package com.org.jmeterfrompostman.builder;

import com.org.jmeterfrompostman.model.jmx.JmxFile;
import com.org.jmeterfrompostman.model.postman.PostmanCollection;

public class JmxFileBuilder extends AbstractJmxFileBuilder {

    @Override
    public JmxFile build(PostmanCollection postmanCollection, String jmxOutputFilePath) throws Exception {
        return super.buildJmxFile(postmanCollection, jmxOutputFilePath);
    }
}
