/*
Java Array Program to Remove Duplicates elements from
an Array

Example : -
Input : [1, 2, 2, 3, 3, 4, 5 ]
Output :[ 1, 2, 3, 4, 5 ]

*/
public class remove_duplicate_element_from_sorted_array 
{
    public static int removeduplicate(int arr[])   // function for remove the duplicate from array
    {
        int rd=0;
        for(int i=1;i<arr.length;i++)      
        {
            if(arr[rd] != arr[i])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }

        return rd+1;               // rd+1 means its size of new array without duplicate elemnt 
        
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,3,4,4,5,6,6,7};     // this is an given sorted array


        System.out.println("sorted array with duplicate element");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");    
        }

        int rd= removeduplicate(arr);        //call the function,function return value rd+1 that is assign in integer rd 

        System.out.println("\nsorted array without duplicate element");
        for (int i=0;i<rd;i++)               // in this loop we traverse at the rd length
        {
            System.out.print(arr[i]+" ");    
        }
    }
}
