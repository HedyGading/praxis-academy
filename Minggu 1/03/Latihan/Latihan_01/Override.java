package anotasi;
/*
*Menggunakan anotasi @Override
*/
class ahay
{
     public void Display()
     {
         System.out.println("Base display()");
     }     
     public static void main(String args[])
     {
         ahay t1 = new bis();
         t1.Display();
     }    
}
class bis extends ahay
{
     @Override
     public void Display()
     {
         System.out.println("Derived display()");
     }
}
