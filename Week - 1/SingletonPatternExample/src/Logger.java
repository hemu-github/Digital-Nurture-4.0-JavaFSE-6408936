public class Logger {

    private Logger() {

        System.out.println("Logger initialized.");

    }

    private static class LoggerHolder {

        private static final Logger INSTANCE = new Logger();

    }

    public static Logger getInstance() {

        return LoggerHolder.INSTANCE;

    }

    public void log(String message) {

        System.out.println("Log: " + message);

    }
    
}
