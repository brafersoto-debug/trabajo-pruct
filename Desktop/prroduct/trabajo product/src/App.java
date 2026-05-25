public class App{

public static void main(String[] args) {
    Product product1 = new Product();
    Product product2 = new Product("23", 1300, "cocacola", 5, true);

    product2.setPrice(1500);
    System.out.println(product2.getName());
System.out.println("--------------------------------------");
   System.out.println(product2.toString());
   System.out.println("--------------------------------------");
   System.out.println(product1.toString());


}}