package objectBuilder;

public class Client {

    public static  void main(String[] args) throws InstantiationException, IllegalAccessException {



        Item item = new Item.Builder().build();

        item.print();;

        item = new Item.Builder().setUuid("1234").setName("item 1").build();

        item.print();

        new NotFoundException.Builder().addMessage("cv").build();

        new NotFoundException.Builder().build();
    }




}
