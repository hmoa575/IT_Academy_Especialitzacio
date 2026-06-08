package nivell01;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();

        //Check the exception. (no products yet added/)
        try {
            sale.calculateTotal();
        } catch (EmptySaleException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }

        // add products to the list.
        sale.addProduct(new Product("MacBook Air", 900));
        sale.addProduct(new Product("iphone 17", 1200));
        sale.addProduct(new Product("MacBook Pro", 2400));

    }
}
