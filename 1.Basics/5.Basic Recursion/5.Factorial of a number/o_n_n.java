import java.util.*;

class PrintFactorialRecursively {
    public int findFactirial(int number) {
        if(number == 0 || number == 1){
            return 1;
        }
        return number * findFactirial(number - 1);
    }
}

class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scanner.nextInt();

        PrintFactorialRecursively solution = new PrintFactorialRecursively();
        int result = solution.findFactirial(number);

        System.out.printf("Factorial of %d is %d", number, result);

        scanner.close();
    }
}