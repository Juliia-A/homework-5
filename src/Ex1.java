import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of rows in the table: ");
        int a = sc.nextInt();
        System.out.print("Enter count of columns in the table: ");
        int b = sc.nextInt();
        printTable(a, b);
    }

    public static void printTable(int x, int y){
        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    };
}
