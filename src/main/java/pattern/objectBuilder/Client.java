package pattern.objectBuilder;

import pattern.objectBuilder.more.AmazonException;

public class Client {

    public static  void main(String[] args) {

        Item item = new Item.Builder().build();
        item.print();

        item = new Item.Builder().setUuid("1234").setName("item 1").build();
        item.print();


        String var = "ABCD";
        NotFoundException ex = new NotFoundException.Builder().addMessage(var).setHttpCode(400).build();
        ex.print();

        Entity entity = new Entity.Builder().setMarque("mar").setModel("mod").setName("bmw").build();
        entity.print();

        AmazonException amazonException = new AmazonException.Builder().addMessage("OK").setHttpCode(120).build();
        amazonException.print();
    }




}
