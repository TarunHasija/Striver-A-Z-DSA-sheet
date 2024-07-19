package sorting;

public class SelectionSort {
     static void Selectionsort(int [] arr,int n){

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = 1+i; j < n; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp = arr[min];
                arr[min] =  arr[i];
                arr[i]=temp;
            }

        }
        System.out.println("After selection sorting");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
            
        }
     }
     
     public static void main(String[] args) {
        int [] arr = {2,4,6,4,3,2};
        int n = arr.length;

        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Selectionsort(arr,n);
     }
}
