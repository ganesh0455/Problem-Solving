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

class ReversNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter the number = ");
        int number = scan.nextInt();

        ReversNumberSolution solution = new ReversNumberSolution();
        int result = solution.reverse_number(number);

        System.err.println("Reversed number = "+ result);

        scan.close();
    }
}
