package FactoryDesginPattern.FactoryMethod;

public class SingBurger extends FactoryBurger{



    @Override
    Burger creteBurger(String type) {

        if(type.equalsIgnoreCase("wheatBurger")){
             return new WheatBurger();
        }else if(type.equalsIgnoreCase("breadBurger")){
            return new BasicWheatBurger();
        }
        return null;
    }
}
