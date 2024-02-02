/**
 * SelectionSort algorithtm: finds the lowest value in an array and moves it to thte front of the array
 * the algorithm looks through the array again and again, moving the next lowest values to the front,until the array is sorted
 */
public class SelectionSort {

    public static void main(String[] args){
        int my_array[] ={64, 34, 25, 5, 22, 11, 90, 12};
        int n= my_array.length; //taille de notre array
 
        //pour le cas i =0,on va comparer la valeur qui s'y trouve aux autres valeurs de notre
        //tableau pour trouver l'index de la plus petite valeur qu'on met dans min_index
        for(int i=0; i< n-1; i++){
         int min_index = i;
         for(int j=i+1;j<n;j++){
           if(my_array[j] <my_array[min_index]){
             min_index = j;
           }
         }
         int min_value = my_array[min_index];//la plus petite valeur pour dans le tableau
         for(int k = min_index;k > i; k--){//on ramene notre plus petite valeur au tout debut pour le cas i=0 ,pour les autres cas,on le met le plus à gauche possible pour que ça soit ascendant
           my_array[k] =my_array[k-1];
         }
         my_array[i] = min_value;
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++){
         System.out.println(my_array[i] + " ");
 
        }
      }
}