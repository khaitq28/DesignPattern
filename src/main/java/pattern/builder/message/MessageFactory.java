package pattern.builder.message;


public class MessageFactory {

    private MessageFactory() {

    }

    static Message createMessage(MessageType messageType) {

        Message message;

        switch (messageType) {
            case JMS:
                message = new JmsMessage();
                break;

            case EMAIL:
                message = new EmailMessage();
                break;

                default:
                    throw new IllegalArgumentException("Unknown Message type");
        }

        return message;
    }

}
