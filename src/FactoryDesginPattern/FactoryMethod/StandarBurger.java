package FactoryDesginPattern.FactoryMethod;

public class StandarBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("This is StandarBurger");
    }
}
