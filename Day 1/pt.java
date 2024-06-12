import java.util.Scanner;

class pt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        
        // Read the two indices
        System.out.println("Enter the first index (n1):");
        int n1 = sc.nextInt();
        System.out.println("Enter the second index (n2):");
        int n2 = sc.nextInt();
        
        // Validate indices
        if (n1 < 0 || n2 >= str.length() || n1 >= n2) {
            System.out.println("Invalid indices. Please make sure 0 <= n1 < n2 < length of the string.");
            return;
        }
        
        // Convert string to a character array for easier manipulation
        char[] charArray = str.toCharArray();
        
        // Reverse the characters between indices n1 and n2
        while (n1 < n2) {
            char temp = charArray[n1];
            charArray[n1] = charArray[n2];
            charArray[n2] = temp;
            n1++;
            n2--;
        }
        
        // Convert the character array back to a string
        String result = new String(charArray);
        
        // Print the result
        System.out.println("The resulting string is: " + result);
    }
}
