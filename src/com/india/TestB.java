package com.india;

class TestA
{
    public void start(){
        System.out.println("i am from com.india.TestA ");
    }

}



public class TestB  extends  TestA{

    public void start(){
        System.out.println("i am from com.india.TestB ");
    }
    public void start1(){
        System.out.println("i am from com.india.TestB start1 ");
    }

    public static void main(String[] args) {

        TestA obj=new TestB();
        obj.start();
    }


}
