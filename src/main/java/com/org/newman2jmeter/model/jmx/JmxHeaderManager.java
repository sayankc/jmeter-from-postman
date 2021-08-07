package com.org.newman2jmeter.model.jmx;

import com.org.newman2jmeter.model.postman.PostmanHeader;
import org.apache.jmeter.protocol.http.control.Header;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.gui.HeaderPanel;
import org.apache.jmeter.testelement.TestElement;

import java.util.List;

public class JmxHeaderManager {
    public static HeaderManager newInstance(String name, List<PostmanHeader> headers) {
        HeaderManager headerManager = new HeaderManager();
        headerManager.setProperty(TestElement.GUI_CLASS, HeaderPanel.class.getName());
        headerManager.setProperty(TestElement.TEST_CLASS, HeaderManager.class.getName());
        headerManager.setEnabled(true);
        headerManager.setName(name+"-header");

        for (PostmanHeader header : headers) {

            headerManager.add(new Header(header.getKey(), header.getValue()));
        }

        return headerManager;
    }
}
