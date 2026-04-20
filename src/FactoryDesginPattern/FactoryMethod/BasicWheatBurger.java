package FactoryDesginPattern.FactoryMethod;

public class BasicWheatBurger extends Burger {

    @Override
    void prepare() {
        System.out.println("This is basicWheatBurger");
    }
}
