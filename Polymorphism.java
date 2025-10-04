
// Polymorphism is many forms of Function [methods]
// 1. Compile-time polymorphism [method Overloading]
// 2. Run-time polymorphism [method Overriding]

class Calculator{           // 1. Compile-time [method Overloading]
    int add(int a, int b){          //-------------------------> Remember parameters are should be different -[int]
        return a + b;
    }
    int add(int a, int b, int c){   //-------------------------> Remember parameters are should be different -[int]
        return a + b + c;
    }
    double add(double a, double b){ //-------------------------> Remember parameters are should be different -[double]
        return a + b;
    }
}

class animal{              // 2. Run-time [method Overriding]
    void sound(){
        System.out.println("Animal makes a Sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("woof..Woof");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("meow..Meow..");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
    //  Compile-time: Method Overloading of [Calculator]
        System.out.println(c.add(10, 10));
        System.out.println(c.add(10, 10, 10));
        System.out.println(c.add(1.1, 1.1));

    //  Run-time: Method Overriding of [animal]
       animal an = new animal();
       an.sound();

       dog dg = new dog();
        dog dg1 = dg;
        dg1.sound();

    }

}
