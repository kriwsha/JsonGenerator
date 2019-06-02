package bva.json.exceptions;

public class NoFunctionFoundException extends Exception {
    public NoFunctionFoundException() {
        super();
    }

    public NoFunctionFoundException(String message) {
        super(message);
    }

    public NoFunctionFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFunctionFoundException(Throwable cause) {
        super(cause);
    }

    protected NoFunctionFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
