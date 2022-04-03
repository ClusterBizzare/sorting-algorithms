public class heapsortclass {

   public static void heapsort(int[] arr) {
      int n = arr.length;
      for(int i=n/2-1;i>=0;i--)        // build max heap
      {
         heapify(arr,n,i);
      }

      for(int i=n-1;i>0;i--)
      {
         int swap = arr[0];
         arr[0] = arr[i];
         arr[i]  = swap;
         heapify(arr,i,0);                // heapify root element
      }
   }

   public static void heapify(int[] arr,int n,int i)
   {
      int largest = i;
      int l = 2*i+1;
      int r = 2*i+2;

      if(l < n && arr[l] > arr[largest])
      {
         largest = l;
      }

      if(r < n && arr[r] > arr[largest])
      {
         largest = r;
      }

      if(largest!=i)
      {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

        heapify(arr,n,largest);
      }
   }

   public static void Print(int[] arr)
   {
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i] + " ");
      }
   }

   public static void main(String[] args)
   {
     int[] arr = {12,3,45,7,1,50,15,11,55};
     heapsort(arr);
     Print(arr);
   }

}