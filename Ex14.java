import java.util.Scanner;
/** 
 * ex 14
 * 
 * @author Amit Dana (322519604)
 * @version 5.01.2021
 */
public class Ex14
{      
   /**
    * ex1- finds the single number in an array of pairs of numbers
    * Complications - O(logn) because there is binary search that cuts the array to half every iteration
    * @param a An array of pairs of integers and a single number
    * @return the single single number
    */
public static int findSingle (int [] a)
{
    int start = 0, end =a.length-1, mid;

    if (a.length == 1)
        return a[0];    
    while (start<=end)
    {
       mid=(start+end)/2;
       if (mid%2 == 0)
          if (a[mid] == a[mid+1])
            start = mid +2;
          else if (a[mid] != a[mid-1])
            return a[mid];
          else
           end=mid-2;
       else
          if (a[mid] == a[mid-1])
            start=mid+1;
          else if (a[mid] !=a[mid+1])
            return a[mid];
          else
            end=mid-1;
    }
    return -1;
  }

  /**
    * ex2- find the size of the smallest subset that is larger than the number x
    * Complications - O(n) linear search
    * @param arr An array of positive numbers
    * @param x The parameter for comparison
    * @return The smallest array size whose sum is greater than X
    */
  public static int smallestSubSum(int arr[], int x)
  {
    int index1, index2, sum, length=1, minlength=arr.length+1;
    sum = arr[0];
    index1=0;
    index2=1; 
    
    while (index1<=index2)
    {
        if (sum<=x)
         {
             if (index2==arr.length)
                break;
             sum +=arr[index1];
             index1++;
             length++;
            }
        else
         {
             minlength=Math.min (minlength,length);
             sum=sum-arr[index2];
             index2++;
             length --;
        }
    }
    if (arr.length==0 || (index1==0 && index2==arr.length))
        return -1;
    else
        return minlength;
   }
   
   
   /**
     * ex3- Return Returns how many solutions the equation has NUM1+NUM2ּּ+NUM3=NUM
     * @param num integer numver to find all of his sum
     * @return The number of the sum solutions
     */
    public static int solutions(int num){
        return solutions(num, 1, 1, 1);
    }

    private static int solutions(int num, int num1, int num2, int num3){
        if(num < 3 || num > 30)
            return 0;
        else if(num1 + num2 + num3 < num)
         {
            if(num3 < 10)
                 return solutions(num, num1, num2, num3+1);
            else if(num2 < 10)
                return solutions(num, num1, num2+1, num3);
            else if(num1 < 10)
                return solutions(num, num1+1, num2, num3);
            else
                return 0;
         }
        else
          {
            System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + num);
            if(num3 <= 10 && num3 > 1 && num2 < 10)
                return 1 + solutions(num, num1, num2+1, num3-1);
            else if(num2 > 1 && num1 < 10)
                return 1 + solutions(num, num1+1, 1, num2-1);
            else
                return 1;
        }
    }
   
    
     /**
    * ex4- find the size of the smallest subset that is larger than the number x
    * Complications - O(n)
    * @param arr An array of positive numbers
    * @param x The parameter for comparison
    * @return The smallest array size whose sum is greater than X
    */
    public static int cntTrueReg (boolean[][]mat)
   {
       return cntTrueReg(mat,0,0);
    }
    
    public static int cntTrueReg(boolean[][] mat, int index1, int index2)
    {
        int temp=0;
        if(mat[index1][index2])
         {
            temp=1;
            check(mat,index1,index2);
        }
        
        int nexti,nextj;
        nexti=index1;
        nextj=index2;
        if(nextj == mat[0].length){
            nexti=nextj+1;
            nextj=0;
            if (nexti==mat.length)
                return temp;
         }
        return temp+cntTrueReg (mat, nexti,nextj);
    }
   
    
    private static void check(boolean[][] mat, int index1, int index2)
    {
         if (!mat[index1][index2])
            return;
            
        mat[index1][index2] = false;
         if (index1>0)
            check (mat,index1-1,index2);
            
        if (index2>0)
            check (mat,index1,index2-1);
                
        if(index1 < mat.length-1)
            check(mat, index1+1, index2);
               
        if(index2 < mat.length-1)
            check(mat, index1, index2+1);

    }
  }


