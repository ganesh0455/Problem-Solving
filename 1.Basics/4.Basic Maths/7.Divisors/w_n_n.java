import java.util.*;

class DivisorsSolution {
    public ArrayList<Integer> findAllDevisors(int number){
        ArrayList<Integer> devisors = new ArrayList<>();

        for(int currentNumber = 1; currentNumber <= number; currentNumber++){
            if(number % currentNumber == 0){
                devisors.add(currentNumber);
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
            System.err.print(devisor + " ");
        }
        System.out.println();

        scan.close();
    }
}