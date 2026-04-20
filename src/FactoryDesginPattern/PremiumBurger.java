package FactoryDesginPattern;

public class PremiumBurger extends Burger {

    @Override
    void prepare() {
        System.out.println("Premium Burger");
    }
}
