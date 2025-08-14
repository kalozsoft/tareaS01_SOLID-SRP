//  Clase para la Lógica de Negocio
public class ProductService {
    private ProductRepository productRepository;

    // Constructor que recibe el repositorio
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, double price) {
        // Lógica de negocio para agregar un producto
        if (price <= 0) {
            System.out.println("El precio debe ser mayor que 0");
            return;
        }

        System.out.println("Producto agregado: " + name + " - S./" + price);

        // Delegar la persistencia de datos al repositorio
        productRepository.saveProduct(name, price);
    }
}
