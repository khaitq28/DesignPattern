package objectBuilder;

public class Item {

    private String uuid;

    private String ssd;

    private String name;

    private String model;

    private String marque;

    public Item(String uuid, String ssd, String name, String model, String marque) {
        this.uuid = uuid;
        this.ssd = ssd;
        this.name = name;
        this.model = model;
        this.marque = marque;
    }

    public Item() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "  uuid='" + uuid + '\'' +
                ", ssd='" + ssd + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }

    public static class Builder {

        private Item item = new Item();

        public Builder setUuid(String uuid) {
            this.item.uuid = uuid;
            return this;
        }

        public Builder setName(String name) {
            this.item.name = name;
            return this;
        }

        public Item build() {
            return item;
        }

    }
}
