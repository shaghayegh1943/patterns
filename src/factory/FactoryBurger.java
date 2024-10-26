package factory;

public class FactoryBurger {
    public Burger getInstance(String str){
        switch (str){
            case "cheese":
                return new CheeseBurger();
            case "veg":
            return new VegBurger();

            default:
                return new ChickenBurger();
        }
    }
}
