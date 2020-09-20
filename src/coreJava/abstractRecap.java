package coreJava;

public  abstract class abstractRecap implements myTrial {
       /*
        Abstract                vs
        1)Abstract can have final and non final variables
        2)Abstract I use extend keyword
        3)I can extend one abstract class
        4) In abstract I can use constructed
        5) I can have abstract and non abstract methods
        6) I can use any type of access modifiers
        Interface
        1) All the variables are static and final
        2) Interface I use implement keyword
        3) I can implement multiple interfaces
        4) In interface I can NOT use constructed (Bc all the variables are final)
        5) All the methods are abstract (abstract methods doesnt have a body )
        6) All the variables are should be public
     */

    int age = 10 ;
    String name = "someone";

    //      4) In abstract I can use constructed
    public abstractRecap(int age, String name){
        this.age = age; // this -> pointing the age on top (22)
    }


    public static void main(String[] args) {

        //1)Abstract can have final and non final variables
        int i1 = 10;
        final int i2 = 20;
//        i2 = 30;   not going to work because i2 is final
        i1 = 30;
        System.out.println(i1);
    }


    //   5) I can have abstract and non abstract methods
    public void method1(){  // non abstract method
    }

    public abstract void method2();  // abstract method
//    abstract methods doesnt have a body

    //     6) I can use any type of access modifiers
    private String cityName = "London";
}
