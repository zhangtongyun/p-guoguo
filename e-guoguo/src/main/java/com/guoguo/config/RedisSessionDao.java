package com.guoguo.config;


import org.apache.shiro.codec.Base64;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * Created by lenovo on 2018/6/14.
 */
@Component
public class RedisSessionDao extends EnterpriseCacheSessionDAO {

    private static Logger log = LoggerFactory.getLogger(RedisSessionDao.class);

    //session在redis中的过期时间:30分钟 30*60s
    private static final int expireTime = 1800;

    //redis中session名称前缀
    private static String prefix = "sessionId:";

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    // 创建session，保存到数据库
    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = super.doCreate(session);
        log.info( "===================创建session:"+session.getId());
        redisTemplate.opsForValue().set(prefix + sessionId.toString(), serialize(session));
        return sessionId;
    }


    // 获取session
    @Override
    protected Session doReadSession(Serializable sessionId) {
        log.info("====================读取session:"+sessionId);
        // 先从缓存中获取session，如果没有再去数据库中获取
        Session session = super.doReadSession(sessionId);
        if(session == null){
            String se = redisTemplate.opsForValue().get(prefix + sessionId.toString());
            if(null != se)
                session = (Session) deserialize(se);
        }
        return session;
    }

    // 更新session的最后一次访问时间
    @Override
    protected void doUpdate(Session session) {
        super.doUpdate(session);
        log.info( "====================更新session:"+session.getId());
        String key = prefix + session.getId().toString();
        if (!redisTemplate.hasKey(key)) {
            redisTemplate.opsForValue().set(key, serialize(session));
        }
        redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
    }

    //删除session
    @Override
    protected void doDelete(Session session) {
        log.info( "=====================删除session:"+session.getId());
        super.doDelete(session);
        redisTemplate.delete(prefix + session.getId().toString());
    }

    //获取当前活动的session
    @Override
    public Collection<Session> getActiveSessions() {
        return super.getActiveSessions();
    }


    private static String serialize(Object obj) {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            return Base64.encodeToString(bos.toByteArray());
        } catch (Exception e) {
            throw new RuntimeException("serialize session error", e);
        } finally {
            try {
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static Object deserialize(String str) {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bis = new ByteArrayInputStream(Base64.decode(str));
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("deserialize session error", e);
        } finally {
            try {
                ois.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
