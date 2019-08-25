package com.xzq.config;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DozerConfig {

    @Bean("mapper")
    public DozerBeanMapper dozerBeanMapper(){
        List<String> mappingFiles = Lists.newArrayList();
        //mappingFiles.add("classpath*:dozer/dozerBeanMapping.xml");

        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper(mappingFiles);

        return dozerBeanMapper;

    }
}
