package FactoryDesginPattern.FactoryMethod;

public class WheatBurger extends Burger {

    @Override
    void prepare() {
        System.out.println("This is WheatBurger");
    }
}
