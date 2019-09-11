package anotasi;
/*
*Contoh lain penggunakan anotasi @Deprecated
*/
public class tes
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
    
   public static void main(String args[])
    {
        tes d1 = new tes();
        d1.Display();
    }
}
