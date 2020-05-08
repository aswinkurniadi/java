import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {

        // membuat variabel nilai dan scanner
        int nilai = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        // cek apakah dia dapat nilai 90
        if ( nilai > 90 ) {
            System.out.println("Selamat, anda mendapatkan hadiah dari saya!");
        }

        System.out.println("Terima kasih...");

    }

}