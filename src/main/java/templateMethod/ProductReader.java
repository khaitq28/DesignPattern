package templateMethod;

public class ProductReader extends  EntityReader<Product> {

    @Override
    protected Product buildEntity(String e) {
        String[] arr = e.split(",");
        return new Product(arr[0], arr[1]);
    }
}
