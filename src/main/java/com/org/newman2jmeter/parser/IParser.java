package com.org.newman2jmeter.parser;

import com.org.newman2jmeter.model.postman.PostmanCollection;

import java.io.IOException;
import java.io.InputStream;

public interface IParser {

    PostmanCollection parse(String postmanJsonFile) throws IOException;

    PostmanCollection parse(InputStream is) throws IOException;

}
