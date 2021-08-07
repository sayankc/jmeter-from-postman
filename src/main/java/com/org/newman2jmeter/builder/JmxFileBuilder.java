package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.jmx.JmxFile;
import com.org.newman2jmeter.model.postman.PostmanCollection;

public class JmxFileBuilder extends AbstractJmxFileBuilder {

    @Override
    public JmxFile build(PostmanCollection postmanCollection, String jmxOutputFilePath) throws Exception {
        return super.buildJmxFile(postmanCollection, jmxOutputFilePath);
    }
}
