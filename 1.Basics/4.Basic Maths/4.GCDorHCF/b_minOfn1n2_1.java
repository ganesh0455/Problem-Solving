import java.util.Scanner;

class GCDorHCFSolution {
    public int findGCDorHCF(int number1, int number2){
        int gcd = 1;

        for(int currentNumber = Math.min(number1, number2) ; currentNumber > 0 ; currentNumber--){
            if(number1 % currentNumber == 0 && number2 % currentNumber == 0){
                gcd = currentNumber;
                return gcd;
            }
        }

        return gcd;
    }
}

class GCDorHCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int number1 = scan.nextInt();
        System.out.print("Enter the 2nd number = ");
        int number2 = scan.nextInt();

        GCDorHCFSolution solution = new GCDorHCFSolution();
        int result = solution.findGCDorHCF(number1, number2);

        System.out.printf("gcd of %d and %d is %d", number1, number2, result);

        scan.close();
    }
}
