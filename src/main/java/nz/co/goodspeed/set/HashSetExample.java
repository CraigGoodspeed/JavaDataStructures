package nz.co.goodspeed.set;

import nz.co.goodspeed.common.SetTests;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample extends SetTests {
    @Override
    protected Set<String> getSet() {
        return new HashSet<>();
    }

    @Override
    protected String getName() {
        return "HashSet";
    }
}
