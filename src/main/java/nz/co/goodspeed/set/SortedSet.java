package nz.co.goodspeed.set;

import nz.co.goodspeed.common.SetTests;

import java.util.Set;
import java.util.TreeSet;

public class SortedSet extends SetTests {
    @Override
    protected Set<String> getSet() {
        return new TreeSet<>();
    }

    @Override
    protected String getName() {
        return "tree set";
    }
}
