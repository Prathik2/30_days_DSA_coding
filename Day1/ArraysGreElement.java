//          Finding greatest element in an array
package Arrays;

public class GreElement{
    public static void main(String[] args) {
        int arr[] = {22,34,56,11,90,23,78,100};
        int result = greElement(arr);
        System.out.println(arr[result]);
    }

    public static int greElement(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
}
//  ## IDEA ##
//  res variable keeps track of the largest element in an array.
