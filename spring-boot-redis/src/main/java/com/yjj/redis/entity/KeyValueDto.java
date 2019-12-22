package com.yjj.redis.entity;

/**
 * @description:
 * @author: Yin JunJie
 * @date: 2019/12/21 13:49
 */
public class KeyValueDto {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
