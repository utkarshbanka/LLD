package FactoryDesginPattern;

public class SimpleBurger extends Burger {

    @Override
    void prepare() {
        System.out.println("Simple Burger"  );
    }
}
