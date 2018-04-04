package com.guoguo.service.impl;

import com.guoguo.bean.NationCode;
import com.guoguo.bean.NationCodeExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.NationCodeMapper;
import com.guoguo.respVo.NationCodeResp;
import com.guoguo.service.NationCodeService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
@Service
public class NationCodeServiceImpl implements NationCodeService {

    @Autowired
    private NationCodeMapper nationCodeMapper;

    @Override
    public List<NationCodeResp> getNation() {
        NationCodeExample example = new NationCodeExample();
        example.createCriteria().andIsDelEqualTo(Constants.IS_DEL.NO);
        List<NationCode> list = nationCodeMapper.selectByExample(example);
        List<NationCodeResp> resps = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(n -> {
                NationCodeResp r = new NationCodeResp();
                BeanUtils.copyProperties(n,r);
                resps.add(r);
            });
        }
        return resps;
    }
}
