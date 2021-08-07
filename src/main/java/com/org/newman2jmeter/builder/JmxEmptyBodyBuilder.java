package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.jmx.JmxHTTPSamplerProxy;
import com.org.newman2jmeter.model.postman.PostmanItem;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;

public class JmxEmptyBodyBuilder extends AbstractJmxBodyBuilder {

    @Override
    public HTTPSamplerProxy buildJmxBody(PostmanItem postmanItem) throws Exception {
        return JmxHTTPSamplerProxy.newInstance(postmanItem);
    }
}
