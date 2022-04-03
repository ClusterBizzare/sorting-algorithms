public class insertsort {
    public static void main(String[] args) {
        int a[] = {7, 5, 1, 9};
        InsertionSort(a);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    public static int[] InsertionSort(int[] a) {
        int i,key,j;
        for (i = 1;i<a.length;i++)
        {
            key = a[i];
            j = i-1;
            while(j>=0 && a[j] > key)
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
        return a;
    }
}