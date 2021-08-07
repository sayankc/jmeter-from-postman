package com.org.newman2jmeter.app;


import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.org.newman2jmeter.config.constants;
import org.apache.jmeter.assertions.ResponseAssertion;
import org.apache.jmeter.exceptions.IllegalUserActionException;
import org.apache.jmeter.gui.tree.JMeterTreeModel;
import org.apache.jmeter.gui.tree.JMeterTreeNode;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.util.JMeterUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomizeJmx {

	private static Logger logger = LoggerFactory.getLogger(newman2jmeter.class.getName());

    public int ParameterizeThreadGroup(String jmxOutputFile) {

        try {

            logger.info("Trying to parameterize threadgroup in jmx file: {}", jmxOutputFile);
            
            //Parameterize thread group         
            Path path = Paths.get(jmxOutputFile);
            Charset charset = StandardCharsets.UTF_8;

            String content = new String(Files.readAllBytes(path), charset);
            //Parameterize users
            content = content.replaceAll(constants.threadNumContent2Replace, constants.threadNumParameter );
            //Parameterize ramp-up
            content = content.replaceAll(constants.rampupContent2Replace, constants.rampupParameter);
            //Parameterize duration
            content = content.replaceAll(constants.durationContent2Replace, constants.durationParameter);


            Files.write(path, content.getBytes(charset));
                       
            logger.info("Successfully parameterized threadgroup in jmx file: {} ", jmxOutputFile);
            

        } catch (Exception e) {
            logger.error("Error occurred while parameterizing threadgroup in jmx file!", e);
        }
		return 0;
    }

    public int AddDefaultAssertion(String jmxOutputFile) {

        try {

            logger.info("Trying to add assertion in jmx file: {}", jmxOutputFile);
            
            //Parameterize thread group         
            Path path = Paths.get(jmxOutputFile);
            Charset charset = StandardCharsets.UTF_8;

            String content = new String(Files.readAllBytes(path), charset);
            //add assertion
            content = content.replaceAll(constants.assertionContent2Replace, constants.defaultAssertionParameter);
            //content = content.replaceAll(oldContent, newContent);
            Files.write(path, content.getBytes(charset));
            
            
            logger.info("Successfully added assertion  in jmx file: {} ", jmxOutputFile);
            


        } catch (Exception e) {
            logger.error("Error occurred while adding assertion  in jmx file!", e);
        }
		return 0;
    }

    public int AddDefaultDelay(String jmxOutputFile) {

        try {

            logger.info("Trying to add delay in jmx file: {}", jmxOutputFile);
            
            //Parameterize thread group         
            Path path = Paths.get(jmxOutputFile);
            Charset charset = StandardCharsets.UTF_8;

            String content = new String(Files.readAllBytes(path), charset);
            //add assertion
            content = content.replaceAll(constants.delayContent2Replace, constants.defaultDelayParameter);
            //content = content.replaceAll(oldContent, newContent);

            Files.write(path, content.getBytes(charset));
                      
            logger.info("Successfully added delay  in jmx file: {} ", jmxOutputFile);
            


        } catch (Exception e) {
            logger.error("Error occurred while adding delay in jmx file!", e);
        }
		return 0;
    }

    public int AddDefaultListener(String jmxOutputFile) {

        try {

            logger.info("Trying to add listener in jmx file: {}", jmxOutputFile);
            
            //Parameterize thread group         
            Path path = Paths.get(jmxOutputFile);
            Charset charset = StandardCharsets.UTF_8;
            String content = new String(Files.readAllBytes(path), charset);
            
            //add Listener
            content = content.replaceAll(constants.listenerContent2Replace, constants.listenerParameter);

            Files.write(path, content.getBytes(charset));
            
            logger.info("Successfully added listener  in jmx file: {} ", jmxOutputFile);            

        } catch (Exception e) {
            logger.error("Error occurred while adding listener in jmx file!", e);
        }
		return 0;
    }

    public int findParameters(String jmxOutputFile) {

        try {

            //logger.info("Trying to add listener in jmx file: {}", jmxOutputFile);
                   

            File file = new File(jmxOutputFile);
            Scanner scanner = new Scanner(file);

            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(line.contains("{") && line.contains("}") ) { 
                    String s = line;

                    s = s.substring(s.indexOf("{") + 1);
                    s = s.substring(0, s.indexOf("}"));

                    logger.warn("One parameter called \""+s+ "\" found in the script. Please define values for it.");
                    
                }
            }          

        } catch (Exception e) {
            logger.error("Error occurred while adding listener in jmx file!", e);
        }
		return 0;
    }
}
