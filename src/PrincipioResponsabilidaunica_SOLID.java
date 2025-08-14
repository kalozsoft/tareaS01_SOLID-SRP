public class PrincipioResponsabilidaunica_SOLID {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        ProductService service = new ProductService(repo);

        service.addProduct("Laptop HP", 1600);
        service.addProduct("Mouse Logitech", 95);
        service.addProduct("Teclado Corsair", 155);
        service.addProduct("Monitor Samsung 27", 950);

    }

}



