import java.util.Scanner;

public class ArrayUpdate {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = {1, 20, 5, 78, 30};
        int element, pos, i;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position and element:");
        pos = scanner.nextInt();
        element = scanner.nextInt();
        
        if (pos <= size && pos >= 0) {
            // Shift all the elements from the last index to pos by 1 position to the right
            for (i = size - 1; i > pos; i--)
                arr[i] = arr[i - 1];
            
            // Insert element at the given position
            arr[pos] = element;
            
            // Print the updated array
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
        } else {
            System.out.println("Invalid Position");
        }
    }
}
