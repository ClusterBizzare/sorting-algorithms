public class Quicksortclass {
    public static void main(String[] args){
        int[] a = {10,3,2,7,8,9,0,12,1,5};
        print(a);
        QuickSort(a,0,a.length-1);
        System.out.print("\n" + "Array After Qick Sort : ");
        print(a);
    }

    public  static int partition(int[] a,int l,int h)
    {
        int pivot = a[l];
        int i=l,j=h+1;
        while(i < j) {
            do {
                i++;
            } while (a[i] <= pivot && i <= h);

            do {
                j--;
            } while (a[j] > pivot);

            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[l] = a[j];
        a[j] = pivot;
        return j;
    }

    public static  void QuickSort(int[] a,int l,int h){
        if(l < h)
        {
          int j = partition(a,l,h);
          QuickSort(a,l,j-1);
          QuickSort(a,j+1,h);
        }
    }

    public static void print(int[] a)
    {
        for(int i: a)
        {
            System.out.print(i + "\t");
        }
    }
}
