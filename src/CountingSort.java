
public class CountingSort {
    int count =0;
    public void countingSort(int[]A,int[]B,int k){

        int  [] C = new int[k+1];

        for(int i=0;i<k;i++){
            C[i] = 0;

        }
        for(int j=1;j<A.length;j++){
            C[A[j]] = C[A[j]]+1;
        }
        for(int i=1;i<=k;i++ ){ //System.out.println("HERE");
            C[i] = C[i]+C[i-1];
        }
        for(int j =(A.length-1);j>=0;j--){
            B[C[A[j]]] = A[j];
            count++;
            C[A[j]] = C[A[j]] -1;
        }
        toPrint(B);

    }
    public int getCount(){
        return count;
    }
    public void toPrint(int []b){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("Count: "+count);

    }

}