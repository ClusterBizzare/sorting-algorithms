public class bubblesortclass {

    public static void main(String[] args)
    {
        int a[] = {5,7,8,2,1};
        bubblesort(a);
        for(int e:a)
        {
            System.out.print(e + " ");
        }
    }

    public static int[] bubblesort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}