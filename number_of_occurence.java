// find number of occurences of a number in
//  an array without using hashmap or map

public class number_of_occurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,6,7,5,3,3,5,3,6,2,5,5};
        int len = arr.length;
        int occArr[] = new int[len+1];

        for (int num:arr) {

            // num = arr[i]
            occArr[num]++;
        }

        for (int j = 0; j < 10; j++) {
            if(occArr[j]==0){
                continue;
            }
            else{
            System.out.println("Number "+j+" occurs "+occArr[j]+" times");
        }}
    }
}
