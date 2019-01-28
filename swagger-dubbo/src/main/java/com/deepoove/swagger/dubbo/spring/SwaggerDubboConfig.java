package com.deepoove.swagger.dubbo.spring;

import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 注解配置bean，
 *
 * Created by yaojiafeng on 2019/1/21 12:00 PM.
 */
@Configuration
@EnableDubboSwagger
@Conditional(OnPropertyCondition.class)
public class SwaggerDubboConfig {

}
