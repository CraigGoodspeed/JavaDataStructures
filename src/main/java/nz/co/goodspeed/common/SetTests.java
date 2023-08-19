package nz.co.goodspeed.common;

import java.time.Instant;
import java.util.Date;
import java.util.Set;
import java.util.logging.Logger;

import static nz.co.goodspeed.Constants.*;

public abstract class SetTests {
    protected abstract Set<String> getSet();
    protected abstract String getName();

    Logger log = buildLogger(getName());

    @FunctionalInterface
    public interface performTest {
        void doIt(Set<String> data);
    }

    public void runTests() {
        Set<String> data = getSet();
        performTest("add items", data, this::addItems);
        performTest("random finds", data, this::performRandomFinds);
        performTest("iterate sequentially", data, this::iterateSequentially);
        performTest("remove from end", data, this::removeFromEnd);
    }

    private void performTest(String testName, Set<String> data, performTest function) {
        log.info(String.format("start %s",testName));
        Instant start = (new Date()).toInstant();
        function.doIt(data);
        Instant end = (new Date()).toInstant();
        log.info(String.format("end %s",testName));
        log.info(String.format("%s %s took %sms",getName(), testName,(end.toEpochMilli() - start.toEpochMilli())));
    }

    private void addItems(Set<String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            data.add(String.valueOf(i));
        }
    }

    private void removeFromEnd(Set<String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            data.remove(String.valueOf(data.size() - 1));
        }
    }

    private void performRandomFinds(Set<String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            boolean found = data.contains(
                    String.valueOf(random.nextInt(LOOP_COUNT))
            );
        }
    }

    private void iterateSequentially(Set<String> data) {
        int counter = 0;
        for(String s : data){
            counter++;
        }
        log.info(String.valueOf(counter));
    }

}
