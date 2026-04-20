package FactoryDesginPattern.AbstractFactoryMethod;

public class StandardGarlicBurger extends GarlicBread{

    @Override
    void prepare() {
        System.out.println("Preparing Standard Garlic Burger  Burger");
    }
}
