
public class project2 {
public static int[] A = {4,2,7,2,6,9,4,4};
public static int[] B = new int[A.length];
public static int k = 9;
	public static void main(String[] args) {
		//fileRead fRead = new fileRead();
		CountingSort cSort = new CountingSort();
		
		B = cSort.countingSort(A, k);
		for(int i =0; i<B.length;i++)
			System.out.print("Out: "+B[i]);
	     
	}
	public void arrayToArray(int[]a,int[]b){
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
	}
	
	

}
