public class selectionsortclass {

    public static  void main(String[]  args)
    {
        int a[] = {9,4,6,2,5};
        SelectionSort(a);
        for(int e:a)
        {
            System.out.print(e + " ");
        }
    }

    public static int[] SelectionSort(int[] a)
    {
        int min;
        for(int i=0;i<a.length;i++)
        {
            min = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i]  = temp;
        }
        return  a;
    }
}