package nz.co.goodspeed.set;

import nz.co.goodspeed.common.SetTests;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample extends SetTests {

    @Override
    protected Set<String> getSet() {
        return new LinkedHashSet<>();
    }

    @Override
    protected String getName() {
        return "Linked hash set";
    }
}
