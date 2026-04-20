package FactoryDesginPattern.FactoryMethod;

public class PremiumBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("This is PremiumBurger");
    }
}
