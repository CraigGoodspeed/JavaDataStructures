package nz.co.goodspeed;

import nz.co.goodspeed.common.MapTests;
import nz.co.goodspeed.common.SetTests;
import nz.co.goodspeed.common.Tests;
import nz.co.goodspeed.lists.SimpleLinkedListExample;
import nz.co.goodspeed.lists.SimpleListsExample;
import nz.co.goodspeed.lists.SimpleStackExample;
import nz.co.goodspeed.lists.SimpleVectorExample;
import nz.co.goodspeed.map.HashMapExample;
import nz.co.goodspeed.map.LinkedHashMap;
import nz.co.goodspeed.map.TreeMap;
import nz.co.goodspeed.practice.SubArraySum;
import nz.co.goodspeed.set.HashSetExample;
import nz.co.goodspeed.set.LinkedHashSetExample;
import nz.co.goodspeed.set.SortedSet;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static Tests[] tests = new Tests[]{
            new SimpleListsExample(),
            new SimpleLinkedListExample(),
            new SimpleVectorExample(),
            new SimpleStackExample()
    };

    static SetTests[] setTests = new SetTests[] {
            new HashSetExample(),
            new LinkedHashSetExample(),
            new SortedSet()
    };

    static MapTests[] mapTests = new MapTests[] {
            new HashMapExample(),
            new LinkedHashMap(),
            new TreeMap()
    };

    public static void main(String[] args) throws IOException {
        /*for (Tests tst : tests
             ) {
            tst.runTests();
        }

        for(SetTests setTest : setTests) {
            setTest.runTests();
        }

        for(MapTests mapTest : mapTests) {
            mapTest.runTests();
            }*/
        SubArraySum sum = new SubArraySum();
        ArrayList<Integer> eg1 = sum.subArraySum(new int[] {1,2,3,7,5},5,12);
        ArrayList<Integer> eg2 = sum.subArraySum(new int[] {1,2,3,4,5,6,7,8,9,10},10,15);
        System.in.read();

    }
}