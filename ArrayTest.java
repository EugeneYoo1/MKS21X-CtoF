import java.util.Arrays;
public class ArrayTest{
   public static void main(String[]args){
      int[] arr=new int[11];
      arr[0]=100;
      for (int i=1;i<arr.length;i++){
        arr[i]=arr[i-1]+10;
    	}
      System.out.println("part 1:");
      System.out.println(Arrays.toString(arr));
      //this is to print the elements on one line
      System.out.println(arr);
      //this is the address
    	//print the array variable
    	System.out.println("part 2:");
      for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
    	//Write a loop to print it out (on one line)
   }
}
