package objectBuilder.more;

public class AmazonException extends AbstractException {

    private AmazonException() {

    }
    public static class Builder extends  AbstractException.Builder<AmazonException, Builder> {

        @Override
        protected Builder getThisBuilder() {
            return this;
        }

        @Override
        protected AmazonException createObjectThis() {
            return new AmazonException();
        }
    }
}
