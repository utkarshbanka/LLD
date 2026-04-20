package FactoryDesginPattern;

public class BurgerClient {

    public static void main(String[] args) {

        String type = "kingburger";

        BurgerFactory burgerFactory = new BurgerFactory();

        Burger ans = burgerFactory.creteBurger(type);

        ans.prepare();

        /**
         * Simple Factory Method Deside which concreate object shuld return based on input
         */
    }
}
