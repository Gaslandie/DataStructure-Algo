/*the insertion sort algorithm uses one part of the array to hold the sorted values,and the other part of the array to hold
 * values that are not sorted yet.the algorithme takes one value at a time from the unsorted part of the array and puts it 
 * into the right place in the sorted part of the array, until the array is sorted
 * 
 */

public class InsertionSort {
    public static void main(String[] args) {
        int myArray[] = {64, 34, 25, 12, 22, 11, 90, 5};

        int n = myArray.length;
        for (int i = 1; i < n; i++){ //for each index
            int insertIndex = i; //current value index
            int currentValue = myArray[i];//current value to insert
            int j = i - 1;

            while(j >= 0 && myArray[j] > currentValue){ //for all the value to the left of our current value
                //if the value is greater than our current value, move our current value to the left
                myArray[j + 1] = myArray[j];
                insertIndex = j;
                j--;
            }
            myArray[insertIndex] = currentValue;
        }
        System.out.println("Sorted array: ");//to display our sorted array
        for(int value : myArray){
            System.out.print(value + " ");
        }
    }
}
