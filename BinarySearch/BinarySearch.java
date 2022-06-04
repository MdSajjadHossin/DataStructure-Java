import java.util.*;

public class BinarySearch{
    int binarySearch(int arr[], int x){
        int l = 0;
        int r = arr.length-1;

        //claculating mid
        while(l <= r){
            int mid = l + (r - l)/2;

            //checking conditions
            if(arr[mid] == x)
                return mid;
            
            if(arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    } 

public static void main(String args[]) {
    BinarySearch ob = new BinarySearch();
    int arr[] = {5,7,9,12,15,20,24,27,33,40,50,65,72};
    int x = 40;
    int result = ob.binarySearch(arr, x);
    if(result == -1)
        System.out.println("Element not Found");
    else
        System.out.println("Element Found ai Index: " + result);
    }
}

