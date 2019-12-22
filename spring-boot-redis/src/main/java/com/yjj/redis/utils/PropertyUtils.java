package com.yjj.redis.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Yin JunJie
 * @date: 2019/12/21 19:16
 */
@Component
public class PropertyUtils implements EnvironmentAware {
    private static Logger logger= LoggerFactory.getLogger(PropertyUtils.class);
    private static Environment environment;

    public static String getProperty(String key){
        return environment.getProperty(key);
    }

    @Override
    public void setEnvironment(Environment environment) {
        logger.info("-------------");
        this.environment=environment;
    }
}
