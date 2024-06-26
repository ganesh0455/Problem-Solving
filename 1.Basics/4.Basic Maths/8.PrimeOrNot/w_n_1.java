import java.util.*;

class PrimeOrNotSolution {
    public boolean findPrimeOrNot(int number){
        int count = 0;
        for(int currentNumber = 1; currentNumber <= number; currentNumber++){
            if(number % currentNumber == 0){
                count++;
            }
        }

        if(count == 2){
            return true;
        }
        return false;
    }
}

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();

        PrimeOrNotSolution solution = new PrimeOrNotSolution();
        boolean result = solution.findPrimeOrNot(number);

        if(result){
            System.out.printf("%d is a prime number", number);
        }
        else{
            System.out.printf("%d is not a prime number", number);
        }

        scan.close();
    }    
}
