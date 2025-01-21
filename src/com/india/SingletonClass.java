package com.india;

public class SingletonClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonEx obj1 = SingletonEx.getInsatnce();
        SingletonEx obj2 = SingletonEx.getInsatnce();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class SingletonEx
{
    public static SingletonEx singletonEx;
    private SingletonEx(){
    }

    public  static SingletonEx getInsatnce(){
        if(singletonEx == null){
            singletonEx= new SingletonEx();
        }
        return singletonEx;
    }

    public static SingletonEx getInsatnceDoubleCheck() {
        if (singletonEx == null) {
            synchronized (SingletonEx.class) {
                if (singletonEx == null) {
                    singletonEx = new SingletonEx();
                }
            }
        }
        return singletonEx;
    }

}
