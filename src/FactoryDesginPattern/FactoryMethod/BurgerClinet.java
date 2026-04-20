package FactoryDesginPattern.FactoryMethod;

import FactoryDesginPattern.BurgerFactory;

public class BurgerClinet {

    public static void main(String[] args) {

        FactoryBurger factoryBurger = new KingBurger();
        Burger burger = factoryBurger.creteBurger("premiumburger");
        burger.prepare();
    }
}
