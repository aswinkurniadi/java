import java.util.Scanner;

public class MenuSwitchCase {
    public static void main(String[] args) {

        // membuat variabel dan scanner
        int input;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.println("== Daftar Menu ==");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mi Goreng");
        System.out.println("3. Bakso");
        System.out.print("Input : ");
        input = scan.nextInt();

        switch(input){
            case 1:
                System.out.println("Nasi Goreng Terpilih!");
                break;
            case 2:
                System.out.println("Mi Goreng Terpilih!");
                break;
            case 3:
                System.out.println("Bakso Terpilih!");
                break;
            default:
                System.out.println("Input yang dimasukkan salah!.");
        }

    }
}