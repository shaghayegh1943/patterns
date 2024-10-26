package singleTon;

public class SingleTonCls {
    //first
    static SingleTonCls singleTonObj = new SingleTonCls();
//second
    private SingleTonCls(){}
    //third
    public static SingleTonCls getInstance(){
        return singleTonObj;
    }

}
