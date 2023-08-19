package nz.co.goodspeed.lists;

import nz.co.goodspeed.common.Tests;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedListExample extends Tests {
    @Override
    public List<String> getList() {
        return new LinkedList<>();
    }

    @Override
    public String getListName() {
        return "linked list";
    }
}
