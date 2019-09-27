package Latihan_01;
/*
    Hedy Gading
    Latihan 01
*/
public class latihan01 {
    public static void main(String[] args) {
        System.out.println("Hello Wolrd"); // latihan 4 no 11 dan no 12
        String namadepan = "Hedy";
        String namabelakang = "Gading";
        String gent = null,status;
        System.out.println("Nama : "+namadepan+" "+namabelakang);
        /*
        *
        */
        int i,j; //Latih 4 Variabel
        int a=2,b=2,z=1; //Latih 4 Konstanta
        double [] hasil; //Latih 4 array
        int [][] Matriks; // Latih 4 Multidimensi array
        Matriks=new int[3][3]; // Latih 4 tipe data (int,double)
        i=2;
        j=4;
        System.out.println("");
        System.out.print("penjumlahan = ");
        System.out.println(i+j);     //Latih 4 Fungsi Matematika
        System.out.print("perkalian = ");
        System.out.println(i*j);
        System.out.println("");
        System.out.println("urutan data [0-10] ");
        for (i=0;i<=10;i++){
            System.out.print(i+"  ");
        }
        System.out.println("\n");
        System.out.println("Segitiga bawah");
        for (i=1;i<=5;i++){   // Latih 4 looping
            for(j=i;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks "+a+"x"+b);
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                Matriks[i][j]=z;
                z++;
            }
        }
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                System.out.print(Matriks[i][j]+" ");
            }
            System.out.println();
        }
        
        switch(i){ //Latih 4 switch
            case 1:
                gent="Laki-Laki";
                break;
            case 2:
                gent="Perempuan";
                break;
            case 3:
                gent="dipertanyakan";
                break;
        }
        if(i%2==0){ // Latih 4 Block
            System.out.println("\nvariabel i Genap");
        }
        else{
            System.out.println("\nvariabel i ganjil");
        }
        System.out.println("\nNama = Ghalib\nKelamin = "+gent);
        System.out.println("\n"+gent.charAt(i)); //String tunggal
        
    }
}