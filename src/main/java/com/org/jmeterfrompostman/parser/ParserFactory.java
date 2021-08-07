package com.org.jmeterfrompostman.parser;

import com.org.jmeterfrompostman.utils.CollectionVersion;

public class ParserFactory {

    public static IParser getParser(CollectionVersion version) {
        if(CollectionVersion.V2 == version) {
            return new PostmanParserV2();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
