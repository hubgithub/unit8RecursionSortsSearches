import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      tempList.add(n);      
//       if (n <= 0)  // The smallest list we can make
//       {
//           return tempList;
//           
// 
//       }
//       else
//       {
// 
//           if(makeList(n-1) == null)
//           {
//           }
//           else
//           {
//             tempList.addAll(0,makeList(n-1));
//           }
//          
//         }
        if(n > 1)
        {
            tempList.addAll(0,makeList(n-1));
        }
        else
        {
            return tempList;
        }
      
      return tempList;
   }
   
   public static void main(String[] args)
   {
       for(int i = 1; i < 100; i ++)
       {
           long startTime = System.currentTimeMillis();
           System.out.println(makeList(i));
           long endTime = System.currentTimeMillis();
           
           System.out.println("     " + (endTime - startTime));
       }
       
       for(int i = 98; i > 1; i --)
       {
           long startTime = System.currentTimeMillis();
           System.out.println(makeList(i));
           long endTime = System.currentTimeMillis();
           
           System.out.println("     " + (endTime - startTime));
       }
    }
   
}
