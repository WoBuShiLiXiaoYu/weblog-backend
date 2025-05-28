package com.hgh.weblog.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;


/**
 * Json 工具类
 */
@Slf4j
public class JsonUtil {

    private JsonUtil() {}

    private static final ObjectMapper INSTANCE = new ObjectMapper();

    /**
     * 将 java 对象序列化为 json 字符串
     * @param obj java 对象
     * @return json 字符串
     */
    public static String toJsonString(Object obj) {
        try {
            return INSTANCE.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }
}
