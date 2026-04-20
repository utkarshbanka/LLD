package FactoryDesginPattern.AbstractFactoryMethod;

public class StandardBurger extends Burger {

    @Override
    void prepare() {
        System.out.println("Preparing Standard  Burger");
    }
}
