import java.util.Scanner;
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

public class Onerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat <= 25) {
            if (heat < 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz");
            }
        } else {
            System.out.println("Yüsmeye gidebilirsiniz");
        }
    }
}
