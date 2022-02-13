package pattern.objectBuilder;

public class Item {

    private String uuid;

    private String ssd;

    private String name;

    private String model;

    private String marque;

    private Item() {

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
