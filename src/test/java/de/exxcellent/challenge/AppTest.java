package de.exxcellent.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.exxcellent.challenge.utils.PropertiesUtil;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public class AppTest {

    private String successLabel = "not successful";
    private String fileURL = "src/main/resources/de/exxcellent/challenge/weather.csv";

    @Before
    public void setUp() throws Exception {
        successLabel = "successful";
    }

    @Test
    public void aPointlessTest() {
        Assert.assertEquals("Expectations met", "successful", successLabel);
        PropertiesUtil proUtil = new PropertiesUtil();
        String value = proUtil.getValue("weatherFilePath");
        System.out.println(value);
    }
    
    @Test
    public void getFileFormatTest(){
    	String substring = fileURL.substring(fileURL.lastIndexOf(".")+1);
    	System.out.println(substring);
    	
    }

}