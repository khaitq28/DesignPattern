package objectBuilder;

public class Entity {

    private String name;

    private String model;

    private String marque;

    private Entity(Builder builder) {
        this.marque = builder.marque;
        this.model = builder.model;
        this.name = builder.name;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String model;
        private String marque;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMarque(String marque) {
            this.marque = marque;
            return this;
        }

        public Entity build() {
            return new Entity(this);
        }
    }
}
