// find number of occurences of a number in
//  an array without using hashmap or map

public class number_of_occurence {
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,6,7,5,3,3,4,5,3,6,2,5,5};
        int len = arr.length;
        int occArr[] = new int[len];

        for (int num:arr) {

            // num = arr[i]
            occArr[num]++;
        }

        for (int j = 1; j <= 7; j++) {
            if(occArr[j]==0){
                continue;
            }
            else{
            System.out.println("Number "+j+" occurs "+occArr[j]+" times");
        }
       
    }
    }
}
