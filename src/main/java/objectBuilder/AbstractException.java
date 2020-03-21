package objectBuilder;

import java.util.ArrayList;
import java.util.List;

public class AbstractException {

    protected String message;

    protected List<String> context;

    protected List<String> errors;

    protected int httpCode;

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

    protected void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    protected abstract static class Builder<T extends  AbstractException> {

        public Builder() {
            this.exception = createObjectThis();
        }

        protected abstract T createObjectThis();

        private T exception;

        public T build() {
            return exception;
        }

        public Builder<T> addMessage(String message) {
            this.exception.setMessage(message);
            return this;
        }

        public Builder<T> addToContext(String content) {
            this.exception.addToContext(content);
            return this;
        }

        public Builder<T> setHttpCode(int httpCode) {
            this.exception.setHttpCode(httpCode);
            return this;
        }

        public Builder<T> addToError(String error) {
            this.exception.addError(error);
            return this;
        }

    }

    public void setMessage(String message) {
        this.message = message;
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
