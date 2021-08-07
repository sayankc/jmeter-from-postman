package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.jmx.JmxHTTPSamplerProxy;
import com.org.newman2jmeter.model.postman.PostmanFormDataBody;
import com.org.newman2jmeter.model.postman.PostmanItem;
import com.org.newman2jmeter.model.postman.PostmanRawBody;
import org.apache.jmeter.config.Argument;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.protocol.http.util.HTTPArgument;

import java.util.List;

public class JmxFormDataBodyBuilder extends AbstractJmxBodyBuilder {

    @Override
    public HTTPSamplerProxy buildJmxBody(PostmanItem postmanItem) {
        HTTPSamplerProxy httpSamplerProxy = JmxHTTPSamplerProxy.newInstance(postmanItem);

        Arguments arguments = new Arguments();
        List<PostmanFormDataBody> formDataList = postmanItem.getRequest().getBody().getFormDataList();

        HTTPArgument argument;
        for(PostmanFormDataBody formData : formDataList) {
            argument = new HTTPArgument();
            argument.setEnabled(true);
            argument.setName(formData.getKey());
            argument.setValue(formData.getValue());
            argument.setMetaData("=");
            argument.setAlwaysEncoded(false);
            argument.setUseEquals(true);
            arguments.addArgument(argument);
        }

        httpSamplerProxy.setArguments(arguments);
        return httpSamplerProxy;
    }
}
