package com.ehp.mapper.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Configuration

@Configuration
class ObjectMapperAutoConfiguration(
    val objectMapper: ObjectMapper
) : InitializingBean {

    @Throws(Exception::class)
    override fun afterPropertiesSet() {

        ObjectMapperConverter.initObjectMapper(objectMapper)
    }
}