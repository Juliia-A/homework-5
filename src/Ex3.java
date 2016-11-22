/**
 * Created by User on 22.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        int k =21;
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*k+1);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nNumber of max element: " + max(arr));
    }

    public static int max(int[] arr1){
        int max = arr1[0], nomMax = 0;
        for (int i = 1; i < arr1.length; i++) {
            if(max < arr1[i]){
                nomMax = i;
            }
        }

        return nomMax;
    }
}
