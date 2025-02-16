package pattern.builder.message;



public class EmailMessageBuilder implements MessageBuilder {

    @Override
    public Message buildMessage() {

        Message emailMessage = MessageFactory.createMessage(MessageType.EMAIL);

        emailMessage.setFont(16);
        emailMessage.setProtocol("IMAP");

        return emailMessage;
    }
}
