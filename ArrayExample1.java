package day5;
//array 
//different ways of array declaration 
public class ArrayExample1 {

	public static void main(String[] args) {
		
		//different ways of declaration 
 		int a[]= new int[10];//array size is 10
 		
 		int b[]= {1,2,3,4,5};
 		
 		//int c[2];  compilation error
 		
 		int d[];
 		d= new int[12];
	    int r[]= new int[] {22,3,4,5,6,7,4};//correct
 		
 		//int r1[]= new int[ 22] {22,3,4,5,6,7,4};//compile time error 		
 		
 		int []p;//correct
 		
 		//================================
 		int u[]= new int[2];
 		u[2]=200;  //runtime error java.lang.ArrayIndexOutOfBoundsException
 		
 		//==============================
 		
 		//can we give array size as zero 
 		int h[]= new int[0];//correct   line1
 		
 		System.out.println(h.length);//0  correct  line 2
 		h[0]=33; //runt time error  line 3 
 		//==================================
 	
 		// can we give negative index to array 
 		int h1[]= new int[-2];//Runtime exception  NegativeArraySizeException
 		
		
	}

}
