package objectBuilder.more;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractException {

    protected String message;

    protected List<String> context;

    protected int httpCode;

    protected void addToContext(String context) {
        if (this.context == null)
            this.context = new ArrayList<>();
        this.context.add(context);
    }

    protected void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    protected abstract static class Builder<T extends AbstractException, B extends  Builder<T,B>> {

        private final T exception;

        private final B builder;

        public Builder() {
            this.exception = createObjectThis();
            this.builder = getThisBuilder();
        }

        protected abstract B getThisBuilder();

        protected abstract T createObjectThis();

        public T build() {
            return exception;
        }

        public B addMessage(String message) {
            this.exception.setMessage(message);
            return this.builder;
        }

        public B addToContext(String content) {
            this.exception.addToContext(content);
            return this.builder;
        }

        public B setHttpCode(int httpCode) {
            this.exception.setHttpCode(httpCode);
            return this.builder;
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


    @Override
    public String toString() {
        return "AbstractException{" +
                "message='" + message + '\'' +
                ", context=" + context +
                ", httpCode=" + httpCode +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
