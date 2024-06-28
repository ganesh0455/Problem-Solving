import java.util.*;

class PrintNtoOneRecursively {
    public void printNtoOne(int number) {
        if(number > 0){
            System.out.print(number + " ");
            printNtoOne(number - 1);
        }
    }
}

class PrintNtoOne{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scanner.nextInt();

        PrintNtoOneRecursively solution = new PrintNtoOneRecursively();
        solution.printNtoOne(number);

        scanner.close();
    }
}