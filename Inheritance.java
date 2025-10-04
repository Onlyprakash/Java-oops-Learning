
class father{                   // Super-Class [inheritance]
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am father of X now");
        this.x = x;
    }
    public void printMe(){              // Constructor [Method] nescessary then it's works
        System.out.println("I am a Constructor");
    }
}
class son extends father{       // Sub-Class [inheritance]
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class colonel{
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void command(){                     // Constructor
        System.out.println("How the Josh!!!");
    }
}
class major extends colonel{
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void again(){                       // Constructor
        System.out.println("How the Josh!! High Sir!!!!!");
    }
}
public class Inheritance{
     public static void main(String[] args) {
     //  Creating An Object of father Class
         father f = new father();
         f.setX(5);
         System.out.println(f.getX());

     //  Creating An Object of Son Class
         son s = new son();
         s.setY(4);
         System.out.println(s.getY());

     //  Creating An Object of colonel Class
         colonel cl = new colonel();
         cl.command();

     // Creating An Object of Major Class
         major mj = new major();
         mj.again();

     }
}
 