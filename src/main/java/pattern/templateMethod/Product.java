package pattern.templateMethod;

public class Product extends Entity {

    private String version;

    private String name;

    public Product(String version, String name) {
        this.version = version;
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }
}
