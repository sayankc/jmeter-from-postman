package com.org.newman2jmeter.config;

import org.apache.jmeter.util.JMeterUtils;

import java.io.File;

public class newman2jmeterConfig {

    public void setJMeterHome() throws Exception {
        String path = new File("").getAbsolutePath();
        path = path + "/jmeter";
        JMeterUtils.setJMeterHome(path);
    }


}
