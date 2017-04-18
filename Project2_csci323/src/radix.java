
public class radix {
	CountingSort cSort = new CountingSort();
	public int[] sort(int[] input){

        // Largest place for a 32-bit int is the 1 billion's place
        for(int place=1; place <= 1000000000; place *= 10){
            // Use counting sort at each digit's place
            input = cSort.countingSort(input, place);
        }

        return input;
	}
}
