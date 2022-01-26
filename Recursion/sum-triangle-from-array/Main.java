/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    public static void printTriangle(int[] A){
        //Base Case
        if(A.length < 1){
            return ;
        }
        
        int[] temp = new int[A.length-1];
        for(int i=0; i<A.length-1; i++){
            temp[i] = A[i]+A[i+1];
        }
        
        //Recursive Step
        printTriangle(temp);
        //Printing the Triangle
        System.out.println(Arrays.toString(A));
    }
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		printTriangle(A);
	}
}
