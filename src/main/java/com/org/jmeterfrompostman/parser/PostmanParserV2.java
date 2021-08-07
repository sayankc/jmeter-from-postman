package com.org.jmeterfrompostman.parser;

import com.org.jmeterfrompostman.model.postman.PostmanCollection;
import com.org.jmeterfrompostman.model.postman.PostmanItem;
import com.org.jmeterfrompostman.utils.PostmanCollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PostmanParserV2 extends AbstractParser {

    @Override
    public PostmanCollection parse(String postmanJsonFile) throws IOException {
        PostmanCollection postmanCollection = readValue(postmanJsonFile);
        return postmanCollection;
    }

    @Override
    public PostmanCollection parse(InputStream is) throws IOException {
        PostmanCollection postmanCollection = readValue(is);
        return postmanCollection;
    }

}
