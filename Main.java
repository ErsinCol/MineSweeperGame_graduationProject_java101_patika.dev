import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("-ZORLUK SEVİYESİ BELİRLEME-");
        System.out.print("Oyun alanının uzunlugunu giriniz: ");
        int rowCount=input.nextInt();
        System.out.print("Oyun alanının genişliğini giriniz: ");
        int colCount=input.nextInt();
        System.out.println("=====================================");

        MineSweeper mineSweeper=new MineSweeper(rowCount,colCount);
        mineSweeper.run();

    }
}
