package com.org.jmeterfrompostman.builder;

import com.org.jmeterfrompostman.model.postman.PostmanCollection;
import com.org.jmeterfrompostman.model.jmx.JmxFile;

public interface IJmxFileBuilder {

    JmxFile build(PostmanCollection postmanCollection, String jmxOutputFilePath) throws Exception;
}
