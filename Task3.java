/*
Input : arr [] = { 1, 2, 3, 4, 5, 6, 7 } , d=2

Explanation: d=2 so 2 elements are rotate to the end of the

array. So 1 2 is rotate back.
So, Final Output : 3, 4, 5, 6, 7, 1, 2   */

public class array_rotation 
{
    private static int k;
    public static void reverse(int a[] ,int start ,int end)  // we make reverse function for rotation of array at k place
    {
        int temp = a[start];
        a[start]= a[end];
        a[end]= temp;
        start++;
        end--;
    }

    public static void rotate(int a[],int k)   // now we rotate using reverse function
    {
           k= k % a.length;
           if(k<0)
           {
             k= k + a.length;
           }

           reverse(a, 0, k-1);
           reverse(a, k, a.length-1);
           reverse(a, 0, a.length-1);
           
        
    }
    public static void main(String[] args) 
    {
        int a[]= {1,2,3,4,5};

        System.out.println("array before rotation");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        rotate(a,2);              // CALL FUNCTION AND ROTATE ARRAY AT 2 PLACE

        System.out.println("\n"+"array after rotation");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

       
    }    
}
