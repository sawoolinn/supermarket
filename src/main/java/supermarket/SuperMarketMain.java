package supermarket;

public class SuperMarketMain {

  public static void main(String[] args) {

    createObjects();
    Menu.welcomeMessage();
    SimpleCustomer customer = null;
    while (customer == null) {
      String[] credentials = Menu.getCredentials();
      customer = Menu.checkCredentials(credentials[0], credentials[1]);
      if (customer == null) {
        System.out.println("Wrong Combination. Try again.");
      }
    }
    System.out.printf("Welcome *%s*\n\n",customer.getName());
    if (customer instanceof BonusCustomer) {
      BonusCustomer cust = (BonusCustomer) customer;
      while (true) {
        Menu.getBonusMenu(cust);
      }
    } else {
      while (true) {
        Menu.getSimpleMenu(customer);
      }
    }
  }

  public static void createObjects() {
    new SimpleCustomer("Saw Oo Lin","leo","1234");
    new BonusCustomer("Kim Leap","leap","1234");
    new Product("Milk 1Lt",1.99,400);
    new Product("Schnitzel 350gr",5.98,70);
    new Product("Spaghetti 500gr",1.07,350);
  }

}
//here is changing
// new channing 