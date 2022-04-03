public class countingsortclass {
public static void main(String[] args)
{
    int a[] = {5,1,4,2,9};
    CountSort(a);
    for(int e:a)
    {
        System.out.print(e + " ");
    }
}

public static void CountSort(int[] a)
{
    int max = a[0];
    int[] output = new int[a.length+1];
    for(int i=0;i<a.length;i++)
        if(a[i]>max)
            max=a[i];

    int[] count = new int[max+1];

    for(int i=0;i<max;i++)
    {
        count[i]=0;
    }

    for(int i=0;i<a.length;i++)
    {
        count[a[i]]++;
    }

    for(int i=1;i<=max;i++)
    {
        count[i] += count[i-1];
    }

    for(int i=a.length-1;i>=0;i--)
    {
        output[count[a[i]]-1] = a[i];
        count[a[i]]--;
    }

    for(int i=0;i<a.length;i++)
    {
        a[i]=output[i];
    }

}
}