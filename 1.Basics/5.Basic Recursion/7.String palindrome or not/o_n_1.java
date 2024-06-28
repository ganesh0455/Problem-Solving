import java.util.*;

class StringPalindromeSolution {
    public boolean findPalindromeOrNot(String name, int low, int high, boolean isPalindrome){
        if(isPalindrome == false){
            return false;
        }
        else if(low >= high && isPalindrome == true){
            return true;
        }
        else{
            if(name.charAt(low) != name.charAt(high)){
                isPalindrome =  false;
            }
            return findPalindromeOrNot(name, low + 1, high - 1, isPalindrome);
        }
    }
}

class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name = ");
        String name = scanner.next();
        StringPalindromeSolution solution = new StringPalindromeSolution();
        boolean isPalindrome = solution.findPalindromeOrNot(name, 0, name.length() - 1, true);
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }    
}
