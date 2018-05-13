package builder.message;

/**
 * Created by khaitq
 * Date: 13/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class MessageFactory {

    private MessageFactory() {

    }

    static Message createMessage(MessageType messageType) throws Exception {

        Message message = null;

        switch (messageType) {
            case JMS:
                message = new JmsMessage();
                break;

            case EMAIL:
                message = new EmailMessage();
                break;

                default:
                    throw new Exception("Unknown Message type");
        }

        return message;
    }

}
