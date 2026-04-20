package FactoryDesginPattern.FactoryMethod;

public class KingBurger extends FactoryBurger{


    @Override
    Burger creteBurger(String type) {

        if(type.equalsIgnoreCase("premiumburger")){
            return new PremiumBurger();
        }
        else if(type.equalsIgnoreCase("burger")){
            return new StandarBurger();
        }
        return null;
    }
}
