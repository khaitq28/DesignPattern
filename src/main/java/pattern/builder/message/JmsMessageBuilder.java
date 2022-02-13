package pattern.builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class JmsMessageBuilder implements MessageBuilder {

        @Override
        public Message buildMessage() throws Exception {

            Message jmsMessage = MessageFactory.createMessage(MessageType.JMS);
            jmsMessage.setFont(12);
            jmsMessage.setProtocol("HTTP");
            return jmsMessage;
        }
}
