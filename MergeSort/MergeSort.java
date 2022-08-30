public class MergeSort{
    public static void conqure(int arr[], int start, int mid, int end) {
        
    }
    public static void divide(int arr[], int start, int mid, int end){
        if(start >= end){
            return;
        }

        // mid = (start + end)/2;
        mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conqure(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
    }
}