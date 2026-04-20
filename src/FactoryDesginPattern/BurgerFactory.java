package FactoryDesginPattern;

public class BurgerFactory {

    private Burger burger;


    public Burger  creteBurger(String tpye){

        if(tpye.equalsIgnoreCase("kingburger")){
            return new KingBurger();
        }
        else if(tpye.equalsIgnoreCase("premiumburger")){
            return new PremiumBurger();
        }
        else if(tpye.equalsIgnoreCase("simpleburger")){
            return new SimpleBurger();
        }
        return null;
    }
}
