import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      tempList.add(n);      
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
          

      }
      else
      {
          
//           if(makeList(n-1) == null)
//           {
//           }
//           else
//           {
            tempList.addAll(0,makeList(n-1));
//           }
         
        }
//         if(n > 1)
//         {
//             tempList.addAll(0,makeList(n-1));
//         }
//         else
//         {
//             return tempList;
//         }
      
      return tempList;
   }
 

   
   public static void main(String[] args)
   {
       // Exponential growth
       // R^2 1.0
       // Mean squared error 1.7e+3
       // a = 300.9849
       // b = 0.00003
       // c = 0.72257
       // a + b^(c*x)
       for(int i = 1; i < 100; i ++)
       {
           long startTime = System.currentTimeMillis();
           System.out.print(makeList(i));
           long endTime = System.currentTimeMillis();
           
           System.out.print("     Estimated time :" + (300.9849 + Math.pow(0.00003,0.72257*i)) + "     Result Time: " +(endTime - startTime));
       }
       

    }
   
}
