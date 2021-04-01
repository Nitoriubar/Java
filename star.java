/*
 별모양 
*/

public class star {

	public static void main(String args[]) {

    int i=0,j=0,k=0;
		
		// 1/4부분
		for(i=1;i<=20;i++) {
			for(j=1;j<=(70-i);j++)
				System.out.print(" ");
			for(k=1;k<=(2*i);k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		// 2/4부분
		int noOfSpaces=(--j);
		int noOfLetters=(--k);
		int maxEndLetterCount;
				
		for(maxEndLetterCount=noOfLetters+10, noOfLetters=2*noOfSpaces+noOfLetters,noOfSpaces=0;noOfLetters>maxEndLetterCount;
				noOfLetters-=10,noOfSpaces+=5) {
			for(j=1;j<=noOfSpaces;j++)
				System.out.print(" ");
			  for(k=1;k<=noOfLetters;k++)
				  System.out.print("*");
			  
			System.out.println();
		}
		
		// 3/4부분
		for(maxEndLetterCount=noOfLetters+10; noOfLetters<=maxEndLetterCount;noOfLetters+=2,noOfSpaces-=1){
			for(j=1;j<=noOfSpaces;j++)
				System.out.print(" ");
			
			  for(k=1;k<=noOfLetters;k++)
				  System.out.print("*");
			  
			System.out.println();
		}
		
		// 4/4부분
		for(int internalSpace=0,scount=noOfLetters;scount>0;noOfLetters+=2,noOfSpaces-=1,internalSpace+=6) {
			for(j=1;j<=noOfSpaces;j++)
			    System.out.print(" ");
			  scount = noOfLetters-internalSpace;
			  for(k=1;k<=(scount/2);k++)
				  System.out.print("*");
			  for(k=1;k<=internalSpace;k++)
				  System.out.print(" ");
			  for(k=1;k<=(scount/2);k++)
				  System.out.print("*");
			  
			System.out.println();
		}
	}
	
}
