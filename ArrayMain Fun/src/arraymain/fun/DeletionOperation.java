
package arraymain.fun;

public class DeletionOperation {
    public static void DeletionOperation(int arr[],int size,int position,int element){
        for(int i=position;i<size;i++){
            arr[i]=arr[i+1];
        }
    }
}
