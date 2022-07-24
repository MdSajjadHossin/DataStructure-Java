import java.util.*;

public class InsertionSort{
    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    
        int arr[] = {43, 31, 26, 29, 12};

        //unsorted array
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){

                //swaping
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = temp;

        }
        printArray(arr);
        
    }
}


