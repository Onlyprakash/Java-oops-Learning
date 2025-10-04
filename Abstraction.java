abstract class Parent2{                 // Abstract class method
    public Parent2(){
        System.out.println(" mai parent2 ka constructor hoon");
    }
    public void helloji(){
        System.out.println("Hello ji namsate");
    }
    abstract public void greet();
}

class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println(" mai badiya or aap kaise");
    }
}
public class Abstraction {
    public static void main(String[] args){
        child2 c = new child2();
//        Parent2 p = new Parent2(); Parent2 [Object are not be created because of Abstract class method]
        c.greet();
        c.helloji();
        c.greet();
    }
}
