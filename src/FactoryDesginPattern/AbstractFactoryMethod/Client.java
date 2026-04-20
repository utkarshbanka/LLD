package FactoryDesginPattern.AbstractFactoryMethod;

public class Client {


    public static void main(String[] args) {

        MealFactory mealFactory =  new CreationFactory();

        String type ="preburger";
        String typeg = "pregburger";
        Burger burger = mealFactory.createBurger(type);
        burger.prepare();
        GarlicBread garlicBread = mealFactory.createGarlicBread(typeg);
        garlicBread.prepare();

    }
}
