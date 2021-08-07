package com.org.jmeterfrompostman.builder;

import com.org.jmeterfrompostman.model.postman.PostmanItem;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;

public interface IJmxBodyBuilder {

    HTTPSamplerProxy buildJmxBody(PostmanItem postmanItem) throws Exception;
}
