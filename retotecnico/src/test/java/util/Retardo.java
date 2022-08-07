package util;

import net.serenitybdd.screenplay.Performable;

import java.util.concurrent.TimeUnit;

public class Retardo {
    public static Performable sleep(long period){
        try {
            TimeUnit.SECONDS.sleep(period);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
