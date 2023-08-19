package nz.co.goodspeed.map;

import nz.co.goodspeed.common.MapTests;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample extends MapTests {
    @Override
    protected Map<String, String> getMap() {
        return new HashMap<>();
    }

    @Override
    protected String getName() {
        return "Hash map";
    }
}
