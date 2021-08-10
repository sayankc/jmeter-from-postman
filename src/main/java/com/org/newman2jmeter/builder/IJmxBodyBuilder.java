package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.postman.PostmanItem;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;

public interface IJmxBodyBuilder {

    HTTPSamplerProxy buildJmxBody(PostmanItem postmanItem) throws Exception;
}
