import builder.Laptop;
import builder.LaptopBuilder;
import factory.Burger;
import factory.FactoryBurger;
import singleTon.SingleTonCls;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SingleTonCls obj1 = SingleTonCls.getInstance();
        SingleTonCls obj2 = SingleTonCls.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

        FactoryBurger fb = new FactoryBurger();
        Burger cheese = fb.getInstance("cheese");
        cheese.recipe();

        Laptop laptopInstance = new LaptopBuilder().setCpu("Intel Corei7 15te generation").setCompanyName("Thinkbook").getLaptop();

    }
}