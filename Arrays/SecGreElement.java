//        To find the second largest element in an array...
package Arrays;

public class SecGreElement {
    public static void main(String[] args) {
        int[] arr = {56,18,23,12,90,2}; 
        int result = secGreElement(arr);
        System.out.println(arr[result]);
    }
    public static int secGreElement(int[] arr) {
        int res=-1,largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
}
//  ## IDEA ##
//  Keep updating the largest and res value by checking the below conditions
//  if arr[i] > arr[largest]  : res=largest,largest=i
//  if arr[i] == arr[largest] : IGNORE
//  if arr[i] < arr[largest]  : if arr[i] <= arr[res] : IGNORE
//                              if arr[i] > arr[res]  : res=i
//                              res == -1             : res=i