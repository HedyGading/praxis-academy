package Latihan1;
public class MyInterface implements MyInterface2{
public void run()
{
    System.out.println("Bismilah");
}
    public static void main(String[] args) {
        MyInterface a =new MyInterface();
        a.doIt();
        MyInterface2.doItStatically();
    }
}
