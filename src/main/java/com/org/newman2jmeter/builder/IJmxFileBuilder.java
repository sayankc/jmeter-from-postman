package com.org.newman2jmeter.builder;

import com.org.newman2jmeter.model.postman.PostmanCollection;
import com.org.newman2jmeter.model.jmx.JmxFile;

public interface IJmxFileBuilder {

    JmxFile build(PostmanCollection postmanCollection, String jmxOutputFilePath) throws Exception;
}
