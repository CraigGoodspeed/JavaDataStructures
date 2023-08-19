package nz.co.goodspeed.lists;

import nz.co.goodspeed.common.Tests;

import java.util.List;
import java.util.Vector;

public class SimpleVectorExample extends Tests {
    @Override
    public List<String> getList() {
        return new Vector<>();
    }

    @Override
    public String getListName() {
        return "vector";
    }
}
