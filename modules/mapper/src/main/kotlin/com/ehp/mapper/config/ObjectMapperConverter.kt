package com.ehp.mapper.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.json.JsonParseException


class ObjectMapperConverter {
    companion object {
        private var objectMapper: ObjectMapper? = null

        fun initObjectMapper(objectMapper: ObjectMapper) {
            this.objectMapper = objectMapper
        }

        fun writeValueAsString(source: Any?): String? {
            if (source == null) {
                return null
            }

            return try {
                objectMapper!!.writeValueAsString(source)
            } catch (e: Exception) {
                throw JsonParseException(e)
            }
        }

        fun <T> readValue(source: String?, destination: Class<T>?): T? {
            if (source == null) {
                return null
            }
            return try {
                objectMapper!!.readValue(source, destination)
            } catch (e: Exception) {
                throw JsonParseException(e)
            }
        }
    }
}