package designpatterns.singleton;

/**
 * @author Ohad Klein
 */
public class Singleton {
    private static Singleton singleton;
    private final StringBuilder log;

    private Singleton() {
        this.log = new StringBuilder();
        logToSingleton("Initiated log singleton.");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void logToSingleton(String message) {
        log.append(message).append("\n");
    }

    public String getLog() {
        return this.log.toString();
    }

}
