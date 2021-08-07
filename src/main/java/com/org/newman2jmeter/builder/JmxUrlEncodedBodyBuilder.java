package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.jmx.JmxHTTPSamplerProxy;
import com.org.newman2jmeter.model.postman.PostmanItem;
import com.org.newman2jmeter.model.postman.PostmanUrlEncodedBody;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.protocol.http.util.HTTPArgument;

import java.util.List;

public class JmxUrlEncodedBodyBuilder extends AbstractJmxBodyBuilder {

    @Override
    public HTTPSamplerProxy buildJmxBody(PostmanItem postmanItem) throws Exception {
        HTTPSamplerProxy httpSamplerProxy = JmxHTTPSamplerProxy.newInstance(postmanItem);

        Arguments arguments = new Arguments();
        List<PostmanUrlEncodedBody> urlEncodes = postmanItem.getRequest().getBody().getUrlEncodes();

        HTTPArgument argument;
        for (PostmanUrlEncodedBody urlEncode : urlEncodes) {
            argument = new HTTPArgument();
            argument.setEnabled(true);
            argument.setName(urlEncode.getKey());
            argument.setValue(urlEncode.getValue());
            argument.setMetaData("=");
            argument.setAlwaysEncoded(false);
            argument.setUseEquals(true);
            arguments.addArgument(argument);
        }

        httpSamplerProxy.setArguments(arguments);
        return httpSamplerProxy;
    }
}
