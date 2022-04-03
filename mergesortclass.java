public class mergesortclass {
    public static void main(String[] args)
    {
       int[] a = {19,2,6,7,3,12};
       MergeSort(a,0,5);
       for(int e:a)
       {
           System.out.print(e + " ");
       }
    }

    public static void MergeSort(int[] a,int l,int h)
    {
       if(l<h)
       {
           int m = (l+h)/2;
           MergeSort(a,l,m);
           MergeSort(a,m+1,h);
           merge(a,m,l,h);
       }
    }

    public static void  merge(int[] a,int m,int l,int h)
    {
       int i=l;
       int j=m+1;
       int k=l;
       int[] b = new int[a.length];

       while(i<=m && j<=h)
       {
           if(a[i] < a[j])
           {
               b[k]=a[i];
               i++;
           }
           else
           {
               b[k]=a[j];
               j++;
           }
           k++;
       }

       while(i<=m)
       {
           b[k]=a[i];
           k++;
           i++;
       }

       while(j<=h)
       {
           b[k]=a[j];
           k++;
           j++;
       }

        if (h + 1 - l >= 0) System.arraycopy(b, l, a, l, h + 1 - l);
    }
}