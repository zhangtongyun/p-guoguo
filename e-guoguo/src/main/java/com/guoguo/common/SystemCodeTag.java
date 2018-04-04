package com.guoguo.common;

import com.guoguo.bean.SystemCode;
import com.guoguo.mapper.SystemCodeMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.exception.TemplateInitException;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.directive.Directive;
import org.apache.velocity.runtime.parser.node.Node;
import org.apache.velocity.runtime.parser.node.SimpleNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Created by lenovo on 2017/9/12.
 */
@Component
public class SystemCodeTag extends Directive {

    private static SystemCodeMapper systemCodeMapper;

    @Autowired
    public void setSystemCodeService(SystemCodeMapper systemCodeMapper) {
        SystemCodeTag.systemCodeMapper = systemCodeMapper;
    }

    @Override
    public String getName() {
        return "systemCode";
    }

    @Override
    public int getType() {
        return LINE;
    }

    @Override
    public boolean render(InternalContextAdapter context, Writer writer, Node node) throws IOException, ResourceNotFoundException, ParseErrorException, MethodInvocationException {

        Node node1 = (SimpleNode)node.jjtGetChild(0);

        Object obj = null;
        if(null != node1)
            obj = node1.value(context);

        if(null != obj){
            List<SystemCode> codeVos = systemCodeMapper.selectSystem(obj.toString());
            if(CollectionUtils.isNotEmpty(codeVos)){
                StringBuffer st = new StringBuffer();
                codeVos.stream().forEach(code -> st.append("<option value='"+code.getCodeValueCode()+"'>"+code.getCodeValueName()+"</option>"));
                 writer.write(st.toString());
            }
        }

        return true;
    }

    @Override
    public void init(RuntimeServices rs, InternalContextAdapter context, Node node) throws TemplateInitException {
        super.init(rs, context, node);
    }
}
