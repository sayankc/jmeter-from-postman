package com.org.newman2jmeter.parser;

import com.org.newman2jmeter.utils.CollectionVersion;

public class ParserFactory {

    public static IParser getParser(CollectionVersion version) {
        if(CollectionVersion.V2 == version) {
            return new PostmanParserV2();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
