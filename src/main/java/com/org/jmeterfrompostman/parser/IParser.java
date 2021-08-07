package com.org.jmeterfrompostman.parser;

import com.org.jmeterfrompostman.model.postman.PostmanCollection;

import java.io.IOException;
import java.io.InputStream;

public interface IParser {

    PostmanCollection parse(String postmanJsonFile) throws IOException;

    PostmanCollection parse(InputStream is) throws IOException;

}
