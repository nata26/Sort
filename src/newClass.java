
public class newClass {

    static void insertionSort(int[] arr){
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }

    }

    public static void main(String[] args){
        int arr[] = {3,60,35,2,45,320,5};

        for (int i = 0; i < arr.length; i++){
            insertionSort(arr);
            System.out.println(arr[i] + " ");
        }

    }
}
