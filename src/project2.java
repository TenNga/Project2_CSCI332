
public class project2 {
    public static int[] A = {4,2,7,2,6,9,4,4};
    public static int[] B = new int[A.length];
    public static int k = 9;
    public static void main(String[] args) {

        CountingSort cSort = new CountingSort();
        cSort.countingSort(A,B,k);

    }



}
