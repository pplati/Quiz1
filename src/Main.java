public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");


        Customer customer = new Customer();
        customer.setAddress("Athens");
        Customer customer2 = new Customer();
        customer.setAddress("Berlin");
        System.out.println(customer.getAddress());
        System.out.println(customer2.getAddress());
        System.out.println("Hello!");

    }
}

