package harshita02_03;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//before array...
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
		
		//array... similar type ke elements store....
		
		/*
		 * 		
		 * 
		 *   syntax :- 
		 *   
		 *   (1) datatype variable[] = new datatype[size];
		 *   	 int ar[] = new int[5];
		 *       int[] ar = new int[5];
		 *   
		 *   (2) datatype variable[] = {v1, v2, v3,....};
		 * 		 int ar[] = {1,2,3,4,5};
		 * 					 0 1 2 3 4 = size	
				 
				 int[] ar = {2,9,3,8,4};	
		 * 		
		 * 		length = 5;
		 * 
		 * 			ar[0] = 1;
		 * 			ar[1] = 2;	
		 * 		
		 * 	size of array = (length - 1) 
		 *            size=4
		 *            
		 *   Limitations..... (1) size fixed (2) similar type elements
		 *            
		 *   Types of array :- (single dimensional, multidimensional, jagged array)         
		 *            
		 * */
		
//		int ar[] = {1,2,3,4,5}; 
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
//		int ar[] = new int[5];
//		ar[0] = 10;
//		ar[1] = 20;
//		ar[2] = 30;
//		ar[3] = 40;
//		ar[4] = 50;
		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
//		String ar[] = {"C","C++","Java","python"};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.println(ar[i]);
//		}
		
//		char ar[] = {'a','x','b','y'};
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.println(ar[i]);
//		}
		
//		int ar[] = {1,2,9,3,7,4};
//		System.out.println(ar[2]);
		
//		Object ar[] = {12, 1.2f, 'a', "XYZ", 12.34, true};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.println(ar[i]);
//		}
		
		//coding questions....
		
		//ascending, descending, maximum, secondMaximum, smallest
		
		//ascending... 
//		int ar[] = {1,9,2,8,5,7,4,6,3};
//		int temp;            
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				if(ar[i]<ar[j]) {         //ar[0] < ar[0]
//					temp = ar[i];//1
//					ar[i] = ar[j];//9
//					ar[j] = temp;//1
//				}
//			}
//			
//		}
		/*
		 * ar[0] < ar[1]
		 * 1<9
		 * 
		 * */
		
//		System.out.println();
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
		//descending....
		//int ar[] = {1,9,2,8,4,7,5,6,3};
		
		//9,8,7,6,5,4,3,2,1
		
//		int temp;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				if(ar[i]>ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
		//maximum... , smallest... , maximum and smallest...
		
//		int ar[] = {4,90,3,82,76,48,570};
//		
//		int max = 0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(max < ar[i]) {
//				max = ar[i];
//			}
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("maximum number = "+max);
		
		
//		int ar[] = {4,-9,0,3,82,76,48,570};
//		
//		int min = ar[0];
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(min > ar[i]) {
//				min = ar[i];
//			}
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("minimum number = "+min);
		
		
//		int ar[] = {4,9,0,3,820,76,48,570};
//		
//		int max = ar[0];
//		int min = ar[0];
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(max < ar[i]) {
//				max = ar[i];
//			}else if(min > ar[i]) {
//				min = ar[i];
//			}
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("maximum number = "+max+" minimum number = "+min);
		
		
//		int ar[] = {4,90,90,3,82,76,48,5,70};
//		
//		int max = 0;
//		int secMax = 0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(max < ar[i]) {
//				secMax = max;
//				max = ar[i];
//			}else if((secMax < ar[i]) && (ar[i] != max)) {
//				secMax = ar[i];
//			}
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("maximum number = "+max+" second maximum = "+secMax);
		
		//merge two array...
		
//		int a[] = {1,2,3,4};//4
//		int b[] = {5,6,7,8};//4
//		//int c[] = {1,2,3,4,5,6,7,8}
//		
//		int c[] = new int[a.length + b.length];//length of c = 8
//		
//		for(int i=0; i<=a.length-1; i++) {
//			c[i] = a[i];    //1,2,3,4,0,0,0,0
//		}
//		
//		for(int i=0; i<=c.length-1; i++) {
//			System.out.print(c[i]);
//		}
//		
//		for(int i=0; i<=b.length-1; i++) {
//			c[a.length+i] = b[i];//c[4+0]=b[0], //c[{1,2,3,4} + {5,6,7,8}]
//		}
//		
//		for(int i=0; i<=c.length-1; i++) {
//			System.out.print(c[i]);
//		}
		
		//addition... a[]={1,2,3}, b[]={4,5,6}, c={5,7,9}
		
//		int a[]= {1,2,3};//3
//		int b[]= {4,5,6};//3
//		int c[]=new int[3];
//		
//		for(int i=0; i<=c.length-1; i++) {
//			c[i] = a[i] + b[i];
//		}
//		
//		for(int i=0; i<=c.length-1; i++) {
//			System.out.print(c[i]+" ");
//		}
		
		//prime, armStrong-number, even-odd 
		
		
		
		//======================================================================
		
		//multidimentional...=> matrix (row = column)
		
		//int [][] ar = new int[row][column];
		

		/*
		 * 
		 *        |1|2| i=0
		 *        |3|4| i=1
		 *         j j
		 *         0 1
		 * 
		 * 		ar[0][0] = 1
		 * 		ar[0][1] = 2
		 * 		ar[1][0] = 3
		 * 		ar[1][1] = 4		
		 * 
		 * */
		
//		int ar[][] = new int[2][2];		
//		ar[0][0] = 1;
//		ar[0][1] = 2;
//		ar[1][0] = 3;
//		ar[1][1] = 4;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//ascending, descending, max, min, secMax, prime, armStrong-number, even-odd
		//merge two array, add two array
		
		
		//			  (1)   (2)
		//           ar[0]  ar[1]
		//array1={2,4}
		//array2={5,1}
		
//		int ar[][]= {{2,4},{5,1}};
//		
//		int temp;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=0; i<ar.length; i++) {/*outer loop ki length*/
//			for(int j=0; j<ar[i].length-1; j++) {/* inner array ki length = {2,4} */
//				for(int k=0; k<ar[i].length-j-1; k++) {/* 2-0-1 */
//					if(ar[i][k]>ar[i][k+1]) {//ar[0][0] > ar[0][1] => ar[1][0] > ar[1][1]
//						temp = ar[i][k];
//						ar[i][k] = ar[i][k+1];
//						ar[i][k+1] = temp;
//					}
//				}
//				
//			}
//		}
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		/*
		 * 3D array:-
		 *
		 *  int ar[][][] = {{},{},{}};
		 *  
		 * */
		
		//int ar[][][] = {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
		//                 ar[0]     ar[1]     ar[2]
		
		//int ar[][][] = {{{1,2},{3,4}}, {{5,6},{7,8}}, {{9,1},{3,5}}};
		//                 ar[0]           ar[1]         ar[2]
		
		
//		for(int i=0; i<=ar.length-1; i++) {//2
//			for(int j=0; j<=ar[i].length-1; j++) {//2
//				for(int k=0; k<=ar[j].length-1; k++) {//2
//					System.out.print(ar[i][j][k]+" ");//ar[0][0][0]
//				}
//			}
//			System.out.println();
//		}
		
		// jagged array...heterogeus row
		
		/*
		 *       1 2 3   r=1
		 *       1       r=2
		 *       1 2 3 4 r=3
		 *       1 2     r=4
		 * 
		 * */
		
		int ar[][] = new int[4][];
		ar[0] = new int[3];
		ar[1] = new int[1];
		ar[2] = new int[4];
		ar[3] = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=0; j<=ar[i].length-1; j++) {
				ar[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=0; j<=ar[i].length-1; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
