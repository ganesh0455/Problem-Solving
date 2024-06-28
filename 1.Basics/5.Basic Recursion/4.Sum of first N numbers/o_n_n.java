import java.util.*;

class PrintSumOfNnumbersRecursively {
    public void sumOfNnumbers(int currentNumber, int number, int sum) {
        if(currentNumber > number){
            System.out.println(sum);
            return;
        }
        sum = sum + currentNumber;
        sumOfNnumbers(currentNumber + 1, number, sum);
    }
}

class SumOfNnumbers{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scanner.nextInt();

        PrintSumOfNnumbersRecursively solution = new PrintSumOfNnumbersRecursively();
        solution.sumOfNnumbers(1, number, 0);

        scanner.close();
    }
}