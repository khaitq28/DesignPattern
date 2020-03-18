package objectBuilder;

import java.util.ArrayList;
import java.util.List;

public class AbstractException {

    private String message;

    private List<String> context;

    private List<String> errors;

    protected void addToContext(String context) {
        if (this.context == null)
            this.context = new ArrayList<>();
        this.context.add(context);
    }

    protected void addError(String error) {
        if (this.errors == null)
            this.errors = new ArrayList<>();
        this.errors.add(error);
    }

    public static class Builder<T extends  AbstractException> {

        public Builder(Class<T> clazz) throws IllegalAccessException, InstantiationException {
            this.exception = clazz.newInstance();
        }

        private T exception;

        public T build() {
            return exception;
        }

        public Builder addMessage(String message) {
            this.exception.setMessage(message);
            return this;
        }

        public Builder addToContext(String content) {
            this.exception.addToContext(content);
            return this;
        }

        public Builder addToError(String error) {
            this.exception.addError(error);
            return this;
        }

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getContext() {
        return context;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "Exception " + this.getClass().getName() + "{" +
                "message='" + message + '\'' +
                ", context=" + context +
                ", errors=" + errors +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
