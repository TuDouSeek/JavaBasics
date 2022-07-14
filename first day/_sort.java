package day1;

public class _sort {
    int [] arr = new int[] {3,5,3,7,5,9};
    int c = 0;
    public void a(){
        for (int i =0 ;i<arr.length ;i++){
            for (int j = 0;j< arr.length -1;j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        _sort sorts = new _sort();
        sorts.a();
    }
}
