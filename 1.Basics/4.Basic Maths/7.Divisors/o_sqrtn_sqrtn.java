import java.util.*;

class DivisorsSolution {
    public ArrayList<Integer> findAllDevisors(int number){
        ArrayList<Integer> devisors = new ArrayList<>();

        int SquareRootOfNumber = (int) Math.sqrt(number);

        for(int currentNumber = 1; currentNumber <= SquareRootOfNumber; currentNumber++){
            if(number % currentNumber == 0){
                devisors.add(currentNumber);

                if(currentNumber != (number / currentNumber)){
                    devisors.add(number / currentNumber);
                }
            }
        }

        return devisors;
    }
}

class Divisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();

        DivisorsSolution solution = new DivisorsSolution();
        ArrayList<Integer> result = solution.findAllDevisors(number);

        for(int devisor : result){
            System.out.print(devisor + " ");
        }
        System.out.println();

        scan.close();
    }
}