import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        int n=x;

        int revNum = 0;

        while(n>0){
            int d = n%10;

            revNum = revNum*10 + d;

            n/=10;
        }

        if(revNum == x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Check if the number is a palindrome and display the result
        if(solution.isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}