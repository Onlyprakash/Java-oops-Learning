
interface MyInterface{
    void Habit1();
    void Habit2();
}
interface MyChildInterface extends MyInterface{         // inheritance Example [extends] in interfaces
    void Habit3();
    void Habit4();
}
class MyClassInterface implements MyChildInterface{     // inheritance [implements] with interfaces
    @Override
    public void Habit1(){
        System.out.println("Reading Books....");
    }
    public void Habit2(){
        System.out.println("Playing GTA 5......");
    }
    public void Habit3(){
        System.out.println("Travelling Outdoor........");
    }
    public void Habit4(){
        System.out.println("And meditate yourself........");
    }
}
public class InheritanceinInterfaces {
    public static void main(String[] args) {
     MyClassInterface obj = new MyClassInterface();
     obj.Habit1();
     obj.Habit2();
     obj.Habit3();
     obj.Habit4();
    }
}
