package com.org.jmeterfrompostman.config;

import org.apache.jmeter.util.JMeterUtils;

import java.io.File;

public class jmeterfrompostmanConfig {

    public void setJMeterHome() throws Exception {
        String path = new File("").getAbsolutePath();
        path = path + "/jmeter";
        JMeterUtils.setJMeterHome(path);
    }


}
