class ReverseArraySolution {
    public void reverseArray(int[] array, int low, int high) {
        if(low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            reverseArray(array, low + 1, high - 1);
        }
    }
}

class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        // int[] array = {6,5,4,3,2,1};
        // int[] array = {10,20,30,40,50};
        ReverseArraySolution solution = new ReverseArraySolution();
        int size = array.length;
        solution.reverseArray(array, 0, size - 1);

        for(int currentIndex = 0; currentIndex < array.length; currentIndex++){
            System.out.print(array[currentIndex] + " ");
        }
        System.out.println();
    }
}