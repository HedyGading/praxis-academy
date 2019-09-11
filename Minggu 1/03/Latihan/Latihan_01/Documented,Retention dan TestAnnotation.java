package anotasi;
/*
*Jenis package untuk anotasi
*/
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
*Menggunakan anotasi @Documented, @Retention dan @TestAnnotation
*/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{
    String Developer() default "Rahul";
    String Expirydate();
}
public class haha
{
    @TestAnnotation(Developer="data", Expirydate="01-10-2020")
    void fun1()
    {
        System.out.println("Test method 1");
    }
    @TestAnnotation(Developer="fair", Expirydate="01-10-2020")
    void fun2()
    {
        System.out.println("Test method 2");
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
    }
}  