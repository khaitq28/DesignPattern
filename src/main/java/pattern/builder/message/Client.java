package pattern.builder.message;

public class Client {
    public static void main(String[] args) throws Exception {

        MessageCreator messageCreator = new MessageCreator(new EmailMessageBuilder());
        System.out.println(messageCreator.getMessage());

        messageCreator = new MessageCreator(new JmsMessageBuilder());
        System.out.println(messageCreator.getMessage());

    }
}
