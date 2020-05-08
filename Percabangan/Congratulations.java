import java.util.Scanner;

public class CongratulationTime {
    public static void main(String[] args) {

        // membuat variabel dan scanner
        int time;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan Jam: ");
        time = scan.nextInt();

        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }

        // cetak hasilnya
        System.out.println("Jam: " + time);
    }
}

//execution result :
//Inputkan Jam: 12
//Good day.
//Jam: 12
