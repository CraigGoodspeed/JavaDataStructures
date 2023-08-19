package nz.co.goodspeed.map;

import nz.co.goodspeed.common.MapTests;
import java.util.Map;

public class TreeMap extends MapTests {
    @Override
    protected Map<String, String> getMap() {
        return new java.util.TreeMap<>();
    }

    @Override
    protected String getName() {
        return "Tree map";
    }
}
