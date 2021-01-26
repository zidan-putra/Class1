
package studikasus;
import java.util.Scanner; // menhimport java util Scanner

public class Class1 {
    static int a,b,op; // mendeklarasikan variabel di dalam objek class namun diluar method supaya bisa diakses oleh semua method
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("== kalkulator sederhana ==");
        System.out.println("masukan bilangan a : ");
        a = input.nextInt();
        System.out.println("masukan bilangan b : ");
        b = input.nextInt();
        
        System.out.println("masukan jenis operasi yang diinginkan \n1. penumlahan\n2. pengurangan\n3. perkalian\n4. pembagian");
        op = input.nextInt();
        
        if (op == 1){
            penjumlahan(a,b);
        }
        else if (op == 2){
            pengurangan(a,b);
        }
        else if (op == 3){
            perkalian(a,b);
        }
        else if (op == 4){
            pembagian(a,b);
        }
        else {
            System.out.println("maaf format tidak valid");
        }
    }
    static void penjumlahan(int a, int b){
        System.out.println("hasil penjumlahan adalah : " + (a+b));
    }
    static void pengurangan(int a ,int b){
        System.out.println("hasil pengurangan adalah : "+ (a-b));
    }
    static void perkalian(int a , int b){
        System.out.println("hasil perkalian adalah : " + (a*b));
    }
    static void pembagian(int a, int b){
        System.out.println("hasil pembagian adalah : "+(a/b));
    }
    
    
}
