import java.util.*;

class ReversNumberSolution {
    public int reverse_number(int number){
        int reversed_number = 0;

        while(number > 0){
            int digit = number % 10;
            reversed_number = (reversed_number * 10) + digit;
            number = number / 10;
        }

        return reversed_number;
    }
}

class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();

        ReversNumberSolution solution = new ReversNumberSolution();
        int result = solution.reverse_number(number);

        if(number == result){
            System.out.println("Its a Palindrome Number");
        }
        else{
            System.out.println("Its not a Palindrome Number");
        }

        scan.close();
    }
}
