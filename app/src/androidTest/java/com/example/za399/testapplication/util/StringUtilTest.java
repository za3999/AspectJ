package com.example.za399.testapplication.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void substringByCodePoints() {
        String str = "SDFASDFASDFASFASFASFA";
       String result = StringUtil.substringByCodePoints(str,0,5);
        assertEquals("SDFAS",result);
    }
}