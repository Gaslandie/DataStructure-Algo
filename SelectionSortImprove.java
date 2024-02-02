//the selection sort algorithm can be improved a little bit more
//in the SelectionSort class,the lowest value element is removed, and then inserted in front of the array
//each time the next lowest value array element is removed, all following elements must be shifted
//one place down to make up for the removal.

//Instead of all the shifting ,swap the lowest value with the first value for i=0 for exemple

public class SelectionSortImprove {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;
                }
            }
            //swap instead of shifting
            int temp = my_array[i];
            my_array[i] = my_array[min_index];
            my_array[min_index] = temp;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}
