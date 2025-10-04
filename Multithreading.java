
// MultiThread:-
// There are Two Types of Thread in JAVA:-
// 1. By Extending Thread Class
// 2. By Implement Runnable Interface

// Create a thread Class:-

class MyThread1 extends Thread {  //-------------> 1. By Extending Thread Class
    @Override
    public void run() {
        int i = 0;
        while (i<4000){
            System.out.println("My Thread1 is Playing....");
            System.out.println("So, Iam Happy..");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<4000){
            System.out.println("My Thread2 is not Playing....");
            System.out.println("So, Iam Sad..");
            i++;
        }
    }
}
class MythreadRunnable1 implements Runnable {   //-----------> 2. By Implement Runnable Interface
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am a Thread1 not a Threat......");
            i++;
        }
    }
}
class MythreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am a Thread2 not a thread1");
            i++;
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
    //-->1. By Extending Thread Class:
        MyThread1 My1 = new MyThread1();
        MyThread2 MY2 = new MyThread2();

        My1.start();
        MY2.start();    //-------------------> [start] is Thread Method

    //-->2. By Implement Runnable Interface:
        MythreadRunnable1 run1 = new MythreadRunnable1();
        Thread th = new Thread(run1);

        MythreadRunnable2 run2 = new MythreadRunnable2();
        Thread ht = new Thread(run2);

        th.start();
        ht.start();




    }
}


































