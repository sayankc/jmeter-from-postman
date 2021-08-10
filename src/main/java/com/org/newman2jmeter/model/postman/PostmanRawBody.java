package com.org.newman2jmeter.model.postman;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.org.newman2jmeter.utils.ValueUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostmanRawBody {

    private String value;

    public PostmanRawBody() {
    }

    public PostmanRawBody(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = ValueUtils.value(value);
    }
}
