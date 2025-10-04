import java.sql.SQLOutput;

interface Bicycle{              // interfaces are Groups of Methods
    int a = 55;      //---------> int a Properties only for a Example
    void ApplyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{          // Another Example of interfaces
    int b = 45;
    void blowHorn1();
    void blowHorn2();
}
class HeroCycle implements Bicycle, HornBicycle{         // Method [HeroCycle] and some Methods body their
    void BlowRing(){
        System.out.println("Ring.ring..ring.....");
    }
    public void ApplyBrake(int decrement){
        System.out.println("Applying Brakes....");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp.......");
    }
    public void blowHorn1(){
        System.out.println("pee pee poo pooo..");
    }
    public void blowHorn2(){
        System.out.println("peeeeeeeeeee......");
    }

}
public class Interfaces {
    public static void main(String[] args) {
        HeroCycle hero = new HeroCycle();
        hero.ApplyBrake(1);
        hero.speedUp(2);
        hero.BlowRing();

//      You can Create Properties in interfaces
        System.out.println(hero.a);

//  But, You cannot modify the Properties in interfaces as they are Final
//      hero.a = 44;

        hero.blowHorn1();
        hero.blowHorn2();
    }
}
