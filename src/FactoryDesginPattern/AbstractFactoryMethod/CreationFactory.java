package FactoryDesginPattern.AbstractFactoryMethod;

public class CreationFactory implements MealFactory{

    @Override
    public Burger createBurger(String type) {

        if(type.equalsIgnoreCase("preburger")){
            return new PremiurBurger();
        }
        else if(type.equalsIgnoreCase("sburger")){
            return new StandardBurger();
        }

        return null;
    }

    @Override
    public GarlicBread createGarlicBread(String type) {

        if (type.equalsIgnoreCase("pregburger")) {
            return new StandardGarlicBurger();
        }
        else if (type.equalsIgnoreCase("sburger")) {
            return new PremiumGarlicBread();
        }
        return null;
    }

}
