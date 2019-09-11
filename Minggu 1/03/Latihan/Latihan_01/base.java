package anotasi;
/*
*Source code untuk pembelajaran anotasi
*bisa meletakkan berbagai macam anotasi di bawah untuk pembelajaran
*/
class base
{
     public void display()
     {
         System.out.println("Base display()");
     }
}
class Derived extends base
{
     public void display(int x)
     {
         System.out.println("Derived display(int )");
     }
     public static void main(String args[])
     {
         Derived obj = new Derived();
         obj.display();
     }
}
