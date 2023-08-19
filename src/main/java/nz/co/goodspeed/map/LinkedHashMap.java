package nz.co.goodspeed.map;

import nz.co.goodspeed.common.MapTests;

import java.util.Map;

public class LinkedHashMap extends MapTests {
    @Override
    protected Map<String, String> getMap() {
        return new java.util.LinkedHashMap<>();
    }

    @Override
    protected String getName() {
        return "LinkedHashMap";
    }
}
