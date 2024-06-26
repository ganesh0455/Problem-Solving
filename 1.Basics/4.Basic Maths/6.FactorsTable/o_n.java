import java.util.*;

class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the table number = ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.printf("%d X %d \n", i, (number / i));
            }
        }

        scan.close();
    }
}
