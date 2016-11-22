/**
 * Created by User on 22.11.2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        int k =17;
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*k+1);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nMultiplication: " + multiplication(arr));
    }

    public static int multiplication(int[] arr1){
        int mult = 1;
        for (int i = 0; i < arr1.length; i++) {
            mult *= arr1[i];
        }

        return mult;
    }
}