import java.util.Scanner;

//root function of Java Project
public static void main(Strings []args) {

  // Taking User Input through Scanner
  Scanner sc = new Scanner(System.in);
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();

  int result = num1 + num2;
  System.out.print(result);

//Program to find an element from array
public static int addArray(int[] array, int n) {
    int sum = 0;
    for(int i = 0; i < array.length; i++) {
        sum += array[i];
    }
  return sum;
} 

// Program to check if number is negative, positive or zero
public static void checkNumber(int num) {

  if(num > 0) {
      System.out.print("Number is positive");
} else if (num < 0) {
      System.out.print("Number is negative");
}  else {
      System.out.print("Number is Zero");
}
}

// Program to check if number is odd or even 
public static void oddOrEven (int num) {

  if(num % 2 == 0) {
     System.out.print("Number is Even");
  } else {
     System.out.print("Number is Odd");
  }
}

// Next Greater element in Array
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int count = 0;
    for(int i = 0; i < nums1.length; i++) {
      for(int j = 0; i < nums2.length; j++) {
         if(nums1[i] == nums2[j]) {
           int temp = nums2[j];
           count = 0;
           while(j<nums2.length-1) {
             j++;
             if(nums2[j]>temp) {
                nums1[i] = nums2[j];
                count++;
                break;
             }  
          }
         }
      } 
      if(count == 0) {
        nums[i] = -1;
      }
    }
  return nums1;
}
