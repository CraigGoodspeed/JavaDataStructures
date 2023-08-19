package nz.co.goodspeed;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormat extends Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return String.format(
                "%s - %s --> %s\n", logRecord.getMillis(),
                logRecord.getLoggerName(),
                logRecord.getMessage()
        );
    }
}
