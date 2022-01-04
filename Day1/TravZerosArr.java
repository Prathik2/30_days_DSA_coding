//     Traversing Zeros to last in an Array..
package Arrays;

import java.util.Arrays;

public class TravZerosArr {
    public static void main(String[] args) {
        int[] arr = {4,6,0,2,0,1,0,0,9};
        TravZerosToLast(arr);
    }
    public static void TravZerosToLast(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = 0;
                arr[res] = temp;
                res++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// ## IDEA ##
// NOTE : We are keeping track of non-zero elements using res variable.
// only when the element is non-zero you swap the element and increment res variable.
// Also make a note that initially you are swapping the element with same element itself.
