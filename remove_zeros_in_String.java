
//Java String Program to Remove leading zeros
public class remove_zeros_in_String 
{

    public static void  main(String[] args) 
    {

    String str = "00000123789";
    String ansstr = "     ";

       for(int i=0;i<str.length();i++) 
      {
        if(str.charAt(i)=='0')       // remove leading zeros
        {
            continue;
        }else
        {
            ansstr= str.substring(i);  // assign substring in ansstr
            break;
        }
      }
      System.out.println(ansstr);     // string without leading zeros

    }
}
