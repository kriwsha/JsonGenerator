package bva.json.exceptions;

public class WrongTemplateException extends Exception {
    public WrongTemplateException() {
        super();
    }

    public WrongTemplateException(String message) {
        super(String.format("error while template parsing :: %s", message));
    }
}
