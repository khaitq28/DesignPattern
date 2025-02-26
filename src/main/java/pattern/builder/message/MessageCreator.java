package pattern.builder.message;


public class MessageCreator {

    private final MessageBuilder messageBuilder;

    public MessageCreator(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    public Message getMessage() {
       return this.messageBuilder.buildMessage();
    }


}
