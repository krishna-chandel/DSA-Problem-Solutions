import java.util.Scanner;
//Krishna Chandel
class ReverseString
{
    public static String reverseString(String str)
    {   String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result = result+str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        System.out.println("Reversed String: "+ reverseString(input));
    }
}