package nz.co.goodspeed.lists;


import nz.co.goodspeed.common.Tests;

import java.util.ArrayList;
import java.util.List;

//demonstration how a simple list should be slower to add but reading will be faster
public class SimpleListsExample extends Tests {
    @Override
    public List<String> getList() {
        return new ArrayList<>();
    }

    @Override
    public String getListName() {
        return "Array list";
    }
}
