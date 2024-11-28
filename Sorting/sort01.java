public class sort01{
    public static void sort01(int[] arr){
        int i = 0 , j = 0 ;
        while(i < arr.length){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }else{
                i++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]  = {1,1,0,1,1,0,0,1,1,1,0,0,0,1};
        sort01(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }        
    }
}