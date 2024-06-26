import java.util.*;

class CountDigitsSolution {
    public int countDigits(int number){
        int digit_count = (int) (Math.log10(number) + 1);
        
        return digit_count;
    }
}

class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter the number = ");
        int number = scan.nextInt();

        CountDigitsSolution solution = new CountDigitsSolution();
        int result = solution.countDigits(number);

        System.out.println("No of digits "+ result);

        scan.close();
    }
}