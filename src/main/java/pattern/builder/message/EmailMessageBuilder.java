package pattern.builder.message;


/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class EmailMessageBuilder implements MessageBuilder {

    @Override
    public Message buildMessage() {

        Message emailMessage = MessageFactory.createMessage(MessageType.EMAIL);

        emailMessage.setFont(16);
        emailMessage.setProtocol("IMAP");

        return emailMessage;
    }
}
