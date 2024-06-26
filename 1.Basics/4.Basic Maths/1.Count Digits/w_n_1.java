import java.util.*;

class CountDigitsSolution {
    public int countDigits(int number){
        int digit_count = 0;
        while(number > 0){
            digit_count++;
            number = number / 10;
        }
        return digit_count;
    }
}

class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();

        CountDigitsSolution solution = new CountDigitsSolution();
        int result = solution.countDigits(number);

        System.out.println("No of digits "+ result);

        scan.close();
    }
}