package nz.co.goodspeed;

import java.util.Random;
import java.util.logging.*;

public class Constants {
    public static int LOOP_COUNT = 100000;

    public static Random random = new Random();

    public static Logger buildLogger(String value) {
        Logger toReturn = Logger.getLogger(value);
        toReturn.setUseParentHandlers(false);
        toReturn.setLevel(Level.ALL);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new LogFormat());
        toReturn.addHandler(handler);
        return toReturn;
    }


}
