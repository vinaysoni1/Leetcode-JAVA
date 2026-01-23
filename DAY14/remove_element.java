import java.net.SocketPermission;

class remove_element {
    static int removeElement(int [] arr, int val){
        int n=arr.length;
        int newArr=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=val){
                arr[newArr++]=arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args){
        int [] arr =  {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }

}