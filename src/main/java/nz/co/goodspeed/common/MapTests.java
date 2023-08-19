package nz.co.goodspeed.common;

import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

import static nz.co.goodspeed.Constants.*;

public abstract class MapTests {
    @FunctionalInterface
    interface PerformMethod {
        void doIt(Map<String,String> input);
    }

    protected abstract Map<String, String> getMap();
    protected abstract String getName();

    Logger log = buildLogger(getName());

    private void performTest(String testName, Map<String, String> data, PerformMethod function) {
        log.info(String.format("start %s",testName));
        Instant start = (new Date()).toInstant();
        function.doIt(data);
        Instant end = (new Date()).toInstant();
        log.info(String.format("end %s",testName));
        log.info(String.format("%s %s took %sms",getName(), testName,(end.toEpochMilli() - start.toEpochMilli())));
    }

    public void runTests() {
        Map<String, String> map = getMap();
        performTest("add items", map, this::addItems);
        performTest("getRandom Items", map, this::getRandomItems);
        performTest("remove and add random items", map, this::removeAndAddRandomItems);
        performTest("iterate sequentially", map, this::iterateSequentially);

    }

    public void addItems(Map<String, String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            data.put(String.valueOf(i), String.valueOf(i));
        }
    }

    public void getRandomItems(Map<String, String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            String value = data.get(String.valueOf(random.nextInt(LOOP_COUNT)));
        }
    }

    public void removeAndAddRandomItems(Map<String, String> data) {
        String key = String.valueOf(random.nextInt(LOOP_COUNT));
        data.remove(key);
        data.put(key, key);
    }

    public void iterateSequentially(Map<String, String> data) {
        Set<String> keys = data.keySet();
        for(String key: keys) {
            data.get(key);
        }
    }
}
