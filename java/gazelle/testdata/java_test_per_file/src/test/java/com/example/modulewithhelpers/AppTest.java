package com.example.modulewithhelpers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCompare() throws Exception {
        App app = new App();
        assertEquals("should return 0 when both numbers are equal", 0, app.compare(Helper.powerOfOne(1), Helper.powerOfOne(1)));
    }
}
