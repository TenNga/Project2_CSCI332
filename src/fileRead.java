/**
 * Created by gawagn on 4/6/17.
 */
public class fileRead {
    int[] r;
    public int[] reader(){
        for(int p=8;p<16835;p=p*2){
            String file1 = "Num//Num"+p+".txt"; //read file using 'p' as a integer
            Scanner scanner = new Scanner(new File(file1));

            while(scanner.hasNext()){
                int input = scanner.nextInt();
                aList.add(input);
            }   //scanner while

            int[] array = new int[aList.size()]; //array with size of arrayList

            for(int k=0;k<aList.size();k++){ //copy arrayList data in Array
                array[k]=(int) aList.get(k);
            } //input arraylist in array[int]
            aList.clear();

            ///insertion sort
            inSort.sort(array,p); //p=integer on filename
            ///Heap Sort
            hSort.sort(array,p);
            ///Quick Sork
            qSort.sort(array, 0, array.length-1,p);
            ///Merge Sort
            mSort.sort(array, p);

            scanner.close();
        }//big for loop
        return r;
    }
}
