import java.util.*;

class PrintNameRecursively {
    public void printName(int number, String name) {
        if(number > 0){
            System.out.print(name + " ");
            printName(number-1, name);
        }
    }
}

class PrintName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scanner.nextInt();
        System.out.print("Enter the name = ");
        String name = scanner.next();

        PrintNameRecursively solution = new PrintNameRecursively();
        solution.printName(number, name);

        scanner.close();
    }
}