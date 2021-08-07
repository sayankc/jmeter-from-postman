package com.org.newman2jmeter.config;

import java.io.File;

public class constants {
	public static final String threadNumContent2Replace = "<intProp name=\"ThreadGroup.num_threads\">1</intProp>";
	public static final String threadNumParameter = "<stringProp name=\"ThreadGroup.num_threads\">\\${__P(users,1)}</stringProp>";
	
	public static final String rampupContent2Replace = "<intProp name=\"ThreadGroup.ramp_time\">1</intProp>";
	public static final String rampupParameter ="<stringProp name=\"ThreadGroup.ramp_time\">\\${__P(users,1)}</stringProp>";
			
	public static final String durationContent2Replace = "<longProp name=\"ThreadGroup.duration\">60</longProp>";
	public static final String durationParameter ="<stringProp name=\"ThreadGroup.duration\">\\${__P(duration,60)}</stringProp>";
	
	public static final String assertionContent2Replace = "</HeaderManager>\n" + 
    		"          <hashTree/>";
	
	public static final String defaultAssertionParameter = "</HeaderManager>\n" + 
    		"          <hashTree/>\n" +
    		"          <ResponseAssertion guiclass=\"AssertionGui\" testclass=\"ResponseAssertion\" testname=\"DefaultAssertion\" enabled=\"true\">\n" + 
    		"            <collectionProp name=\"Asserion.test_strings\">\n" + 
    		"              <stringProp name=\"49586\">200</stringProp>\n" + 
    		"            </collectionProp>\n" + 
    		"            <stringProp name=\"Assertion.custom_message\"></stringProp>\n" + 
    		"            <stringProp name=\"Assertion.test_field\">Assertion.response_code</stringProp>\n" + 
    		"            <boolProp name=\"Assertion.assume_success\">false</boolProp>\n" + 
    		"            <intProp name=\"Assertion.test_type\">2</intProp>\n" + 
    		"          </ResponseAssertion>\n" + 
    		"          <hashTree/>";

	public static final String delayContent2Replace = "</ResponseAssertion>\n" + 
    		"          <hashTree/>\n" + 
    		"        </hashTree>";
	
	public static final String defaultDelayParameter = "</ResponseAssertion>\n" + 
    		"          <hashTree/>\n" + 
    		"        </hashTree>\n" + 
    		"        <ConstantTimer guiclass=\"ConstantTimerGui\" testclass=\"ConstantTimer\" testname=\"DefaultDelay100ms\" enabled=\"true\">\n" + 
    		"          <stringProp name=\"ConstantTimer.delay\">100</stringProp>\n" + 
    		"        </ConstantTimer>\n" +
    		"          <hashTree/>";

	public static final String listenerContent2Replace = "</hashTree>\n" + 
			"    </hashTree>\n" + 
			"  </hashTree>\n" + 
			"</jmeterTestPlan>";
	
	public static final String listenerParameter = "<ResultCollector guiclass=\"ViewResultsFullVisualizer\" testclass=\"ResultCollector\" testname=\"View Results Tree\" enabled=\"true\">\n" + 
			"          <boolProp name=\"ResultCollector.error_logging\">false</boolProp>\n" + 
			"          <objProp>\n" + 
			"            <name>saveConfig</name>\n" + 
			"            <value class=\"SampleSaveConfiguration\">\n" + 
			"              <time>true</time>\n" + 
			"              <latency>true</latency>\n" + 
			"              <timestamp>true</timestamp>\n" + 
			"              <success>true</success>\n" + 
			"              <label>true</label>\n" + 
			"              <code>true</code>\n" + 
			"              <message>true</message>\n" + 
			"              <threadName>true</threadName>\n" + 
			"              <dataType>true</dataType>\n" + 
			"              <encoding>false</encoding>\n" + 
			"              <assertions>true</assertions>\n" + 
			"              <subresults>true</subresults>\n" + 
			"              <responseData>false</responseData>\n" + 
			"              <samplerData>false</samplerData>\n" + 
			"              <xml>false</xml>\n" + 
			"              <fieldNames>true</fieldNames>\n" + 
			"              <responseHeaders>false</responseHeaders>\n" + 
			"              <requestHeaders>false</requestHeaders>\n" + 
			"              <responseDataOnError>false</responseDataOnError>\n" + 
			"              <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>\n" + 
			"              <assertionsResultsToSave>0</assertionsResultsToSave>\n" + 
			"              <bytes>true</bytes>\n" + 
			"              <sentBytes>true</sentBytes>\n" + 
			"              <url>true</url>\n" + 
			"              <threadCounts>true</threadCounts>\n" + 
			"              <idleTime>true</idleTime>\n" + 
			"              <connectTime>true</connectTime>\n" + 
			"            </value>\n" + 
			"          </objProp>\n" + 
			"          <stringProp name=\"filename\"></stringProp>\n" + 
			"        </ResultCollector>\n" + 
			"        <hashTree/>\n" + 
			"        <ResultCollector guiclass=\"StatVisualizer\" testclass=\"ResultCollector\" testname=\"Aggregate Report\" enabled=\"true\">\n" + 
			"          <boolProp name=\"ResultCollector.error_logging\">false</boolProp>\n" + 
			"          <objProp>\n" + 
			"            <name>saveConfig</name>\n" + 
			"            <value class=\"SampleSaveConfiguration\">\n" + 
			"              <time>true</time>\n" + 
			"              <latency>true</latency>\n" + 
			"              <timestamp>true</timestamp>\n" + 
			"              <success>true</success>\n" + 
			"              <label>true</label>\n" + 
			"              <code>true</code>\n" + 
			"              <message>true</message>\n" + 
			"              <threadName>true</threadName>\n" + 
			"              <dataType>true</dataType>\n" + 
			"              <encoding>false</encoding>\n" + 
			"              <assertions>true</assertions>\n" + 
			"              <subresults>true</subresults>\n" + 
			"              <responseData>false</responseData>\n" + 
			"              <samplerData>false</samplerData>\n" + 
			"              <xml>false</xml>\n" + 
			"              <fieldNames>true</fieldNames>\n" + 
			"              <responseHeaders>false</responseHeaders>\n" + 
			"              <requestHeaders>false</requestHeaders>\n" + 
			"              <responseDataOnError>false</responseDataOnError>\n" + 
			"              <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>\n" + 
			"              <assertionsResultsToSave>0</assertionsResultsToSave>\n" + 
			"              <bytes>true</bytes>\n" + 
			"              <sentBytes>true</sentBytes>\n" + 
			"              <url>true</url>\n" + 
			"              <threadCounts>true</threadCounts>\n" + 
			"              <idleTime>true</idleTime>\n" + 
			"              <connectTime>true</connectTime>\n" + 
			"            </value>\n" + 
			"          </objProp>\n" + 
			"          <stringProp name=\"filename\"></stringProp>\n" + 
			"        </ResultCollector>\n" + 
			"        <hashTree/>\n" + 
			"      </hashTree>\n" + 
			"    </hashTree>\n" + 
			"  </hashTree>\n" + 
			"</jmeterTestPlan>";
}
