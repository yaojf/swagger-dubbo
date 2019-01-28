package com.deepoove.swagger.dubbo.spring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 条件注解，用于判读是否开启bean配置
 * <p>
 * Created by yaojiafeng on 2019/1/28 3:45 PM.
 */
public class OnPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String swaggerDubboOpen = ((XmlWebApplicationContext) ((XmlWebApplicationContext) context.getResourceLoader()).getParent()).getBeanFactory().resolveEmbeddedValue("${swagger.dubbo.open:false}");
        return "true".equals(swaggerDubboOpen) ? true : false;
    }

}
