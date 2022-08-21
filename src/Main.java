import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row,col;
        System.out.print("mayin tarlasi satir sayisini giriniz:");
        row=scanner.nextInt();
        System.out.print("mayin tarlasi sutun sayisini giriniz:");
        col=scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);

        mineSweeper.run();




    }
}
