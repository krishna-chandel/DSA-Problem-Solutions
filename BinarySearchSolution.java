import java.util.*;
//Krishna Chandel
class BinarySearchSolution {
    public static int binarysearch(int arr[], int n, int k) {
        for(int i=0;i<n;i++){
            if (arr[i]==k){
                return i;
            }
        }
    return -1;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the (positive integer) number of elements to be entered in array");
        int n = sc.nextInt();
        int[] array =  new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int count=0;count<n;count++){
            array[count] = sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int k = sc.nextInt();
        int result = binarysearch(array, n, k);
        System.out.println("Element found at index: "+ result);
    }
}