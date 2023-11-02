import java.util.Scanner;

//root function of Java Project
public static void main(Strings []args) {

  // Taking User Input through Scanner
  Scanner sc = new Scanner(System.in);
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();

  int result = num1 + num2;
  System.out.print(result);
}  

//Program to find an element from array
public static int addArray(int[] array, int n) {
    int sum = 0;
    for(int i = 0; i < array.length; i++) {
        sum += array[i];
    }
  return sum;
} 
