package nz.co.goodspeed.lists;

import nz.co.goodspeed.common.Tests;

import java.util.List;
import java.util.Stack;

public class SimpleStackExample extends Tests {
    @Override
    public List<String> getList() {
        return new Stack<>();
    }

    @Override
    public String getListName() {
        return "stack";
    }
}
