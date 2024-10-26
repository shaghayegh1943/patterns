package factory;

public class VegBurger implements Burger {
    @Override
    public void recipe() {
        System.out.println("this is a Vegetable recipe");
    }
}
