import java.util.*;

class PrintOneToNRecursively {
    public void printOneToN(int currentNumber, int number) {
        if(currentNumber <= number){
            System.out.print(currentNumber + " ");
            printOneToN(currentNumber + 1, number);
        }
    }
}

class PrintOneToN{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scanner.nextInt();

        PrintOneToNRecursively solution = new PrintOneToNRecursively();
        solution.printOneToN(1, number);

        scanner.close();
    }
}