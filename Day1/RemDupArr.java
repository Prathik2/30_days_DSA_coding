//      Remove Duplicates from the Sorted array..
package Arrays;

public class RemDupArr {
    public static void main(String[] args) {
        int[] arr = {34,43,56,56,78,78};
        int n  = remDupElements(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int remDupElements(int[] arr) {
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
     
        return res;
    }
}
// ## IDEA ##
// NOTE : Array should be sorted or first sort it.
// Initialize res variable to 1
// Now check all the ith element and res-1 th element : if They are not same 
//                                                      store at res index and increment res
//                                                    : if They are same just
//                                                      IGNORE 
