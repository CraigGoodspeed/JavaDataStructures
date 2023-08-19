package nz.co.goodspeed.common;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

import static nz.co.goodspeed.Constants.*;

public abstract class Tests {

    @FunctionalInterface
    public interface performTest {
        void doIt(List<String> data);
    }

    public abstract List<String> getList();

    public abstract String getListName();
    Logger log = buildLogger(getListName());

    public void runTests() {
        List<String> data = getList();
        log.info("start");
        performTest("add", data, this::performAdd);
        performTest("random access", data, this::performRandomAccess);
        performTest("sequential iteration", data, this::performSequentialIteration);
        performTest("random assignment ", data, this::performRandomAssignment);
        performTest("perform add and remove at end", data, this::removeAndAdd);
    }

    private void performTest(String logMessage, List<String> data, performTest input) {
        log.info(String.format("start %s",logMessage));
        Instant start = (new Date()).toInstant();
        input.doIt(data);
        Instant end = (new Date()).toInstant();
        log.info(String.format("end %s",logMessage));
        log.info(String.format("%s took %sms",logMessage,(end.toEpochMilli() - start.toEpochMilli())));
    }

    private void removeAndAdd(List<String> data) {
        for(int i  = 0; i < LOOP_COUNT; i++) {
            data.remove(0);
            data.add(String.valueOf(i));
        }
    }

    private void performRandomAssignment(List<String> data) {
        for(int i  = 0; i < LOOP_COUNT; i++) {
            int removeAt = random.nextInt(LOOP_COUNT);
            int addAt = random.nextInt(LOOP_COUNT);
            data.remove(removeAt);
            data.add(addAt, String.valueOf(i));
        }
    }

    public void performAdd(List<String> addHere) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            addHere.add(String.valueOf(i));
        }
    }

    public void performRandomAccess(List<String> data) {
        for(int i = 0; i < LOOP_COUNT; i++) {
            String value = data.get(random.nextInt(LOOP_COUNT));
        }
    }

    private void performSequentialIteration(List<String> data) {
        for(String s : data) {
            String val = s;
        }
    }


}
