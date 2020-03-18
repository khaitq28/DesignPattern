package objectBuilder;

public class NotFoundException extends AbstractException {


    public static class Builder extends  AbstractException.Builder<NotFoundException> {

        public Builder() throws IllegalAccessException, InstantiationException {
            super(NotFoundException.class);
        }

    }

}
