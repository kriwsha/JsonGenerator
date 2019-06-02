package bva.json.exceptions;

public class WrongTemplateException extends Exception {

    private static final String ERROR_PREFIX = "error while template parsing :: %s";


    public WrongTemplateException() {
        super();
    }

    public WrongTemplateException(String message) {
        super(String.format(ERROR_PREFIX, message));
    }

    public WrongTemplateException(Throwable cause) {
        super(cause);
    }
}
