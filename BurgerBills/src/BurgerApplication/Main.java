package BurgerApplication;

public class Main {
    Hamburger hamburger = new Hamburger("Basic ", "sauage", 4.3, "white roll");
    double price = hamburger.calculatePrice();
    hamburger.addHamburgerAddition1("Tomato",0.54);
    hamburger.addHamburgerAddition2("Lettuse",0.39);
    hamburger.addHamburgerAddition3("Cheese",0.78);
    hamburger.addHamburgerAddition4("Onin",0.66);
    System.out.println("Total price is "+hamburger.calculatPrice());
}