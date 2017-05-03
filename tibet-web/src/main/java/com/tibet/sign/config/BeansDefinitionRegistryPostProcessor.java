package com.tibet.sign.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * コードでBeanの初期化を行うクラス
 * （TomcatApplicationのクラスで@ImportResource({"classpath:beans.xml"})の配置でBeanの初期化を行った）
 * @author chunhui.li
 *
 */
@Configuration
public class BeansDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    private static Log logger = LogFactory.getLog(BeansDefinitionRegistryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {

    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

    }

}
