/**
 * Created by User on 22.11.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*50-20);
            System.out.print(arr[i] + "\t");
        }

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
