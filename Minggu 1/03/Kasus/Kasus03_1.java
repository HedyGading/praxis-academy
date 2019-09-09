package kasus01;
import java.util.Scanner;
public class Kasus03_01 {
    public static void main(String[] args) {
        /*
        *inisialisasi variabel
        */
        int i,j;
        int [][] A,B,C;
        Scanner input = new Scanner(System.in);
        A=new int[2][2];
        B=new int[2][2];
        C=new int[2][2];
        
        /*
        *Deklarasikan Matriks Awal A
        */
        A[0][0]=1;
        A[0][1]=2;
        A[1][0]=3;
        A[1][1]=4;
        /*
        *Deklarasikan Matriks Awal B
        */
        B[0][0]=1;
        B[0][1]=2;
        B[1][0]=3;
        B[1][1]=4;
        
        /*
        *Output Matriks Awal A
        */
        System.out.println("Matriks A");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
             System.out.println();
        }
        
        /*
        *Output Matriks Awal B
        */
        System.out.println("\nMatriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(B[i][j]+" ");
            }
             System.out.println();
        }
        /*
        *Hasil Penjumlahan Matriks A dan B
        */
        System.out.println("\nPenjumlahan Matriks A dan Matriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
             System.out.println();
        }
        /*
        *Merubah matriks A dengan cara input manual menggunakan for
        */
        System.out.println("\n\"Merubah Matriks A dan Matriks B\"");
        System.out.println("\nMatriks A");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Matriks A["+(i+1)+"]["+(j+1)+"] : ");
                A[i][j]=input.nextInt();
            }
        }
        /*
        *Merubah matriks B dengan cara input manual menggunakan for
        */
        System.out.println("\nMatriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Matriks B["+(i+1)+"]["+(j+1)+"] : ");
                B[i][j]=input.nextInt();
            }
        }
        /*
        *Output Matriks Baru A
        */
        System.out.println("\nMatriks A Baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
             System.out.println();
        }
        /*
        *Output Matriks Baru B
        */
        System.out.println("\nMatriks B Baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(B[i][j]+" ");
            }
             System.out.println();
        }
        /*
        *Hasil Penjumlahan Matriks Baru A dan Matriks Baru B
        */
        System.out.println("\nPenjumlahan Matriks A baru dan Matriks B baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}