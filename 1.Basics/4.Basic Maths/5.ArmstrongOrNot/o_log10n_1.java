import java.util.Scanner;

class ArmstrongOrNotSolution {
    public int findArmStringOrNot(int number){
        int no_of_digits = (int) (Math.log10(number) + 1);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, no_of_digits);
            number = number / 10;
        }

        return sum;
    }
}

class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();

        ArmstrongOrNotSolution solution = new ArmstrongOrNotSolution();
        int result = solution.findArmStringOrNot(number);

        if(result == number){
            System.out.printf("%d is a armstrong number", number);
        }
        else{
            System.out.printf("%d is not a armstrong number", number);
        }

        scan.close();
    }
}