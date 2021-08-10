package com.org.newman2jmeter.app;

import com.org.newman2jmeter.builder.JmxFileBuilder;
import com.org.newman2jmeter.exception.InvalidArgumentsException;
import com.org.newman2jmeter.model.postman.PostmanCollection;
import com.org.newman2jmeter.parser.IParser;
import com.org.newman2jmeter.parser.ParserFactory;
import com.org.newman2jmeter.utils.CollectionVersion;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class newman2jmeter {

    private static Logger logger = LoggerFactory.getLogger(newman2jmeter.class.getName());


    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new InvalidArgumentsException();
            }

            String postmanCollectionJson = args[0];
            String jmxOutputFile = args[1];

            logger.info("Trying to parse postman collection file: {}", postmanCollectionJson);
            IParser parser = ParserFactory.getParser(CollectionVersion.V2);
            PostmanCollection postmanCollection = parser.parse(postmanCollectionJson);
            logger.info("Successfully parsed postman collection file: {}, Total parsed item count: {} ", postmanCollectionJson, postmanCollection.getItems().size());

            logger.info("Trying to build jmx file: {}", jmxOutputFile);
            JmxFileBuilder jmxFileBuilder = new JmxFileBuilder();
            jmxFileBuilder.build(postmanCollection, jmxOutputFile);

            //Customize JMX file 
            CustomizeJmx cj= new CustomizeJmx();
            
            cj.AddDefaultCacheManager(jmxOutputFile);
            
            //find parameters as per postman collection and throw alert.
            cj.findParameters(jmxOutputFile);
            
            //Parameterize thread group
            cj.ParameterizeThreadGroup(jmxOutputFile); 
            
            //Add Default assertion
            cj.AddDefaultAssertion(jmxOutputFile);
            
            //Add Default Delay
            cj.AddDefaultDelay(jmxOutputFile);
            
            //Add Default Listener
            cj.AddDefaultListener(jmxOutputFile);
            
            logger.info("Successfully build jmx file: {} ", jmxOutputFile);

        } catch (Exception e) {
            logger.error("Error occurred!", e);
        }
    }


}
