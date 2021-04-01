import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);    
		int num = scan.nextInt();				//키보드로 입력받는 값의 변수를 num
		
		for(int i=1;i<=num;i++) 				//마름모의 중간의 가장 긴부분을 위해 시작을 1부터 num까지 도는 행변수 i
		{
			for(int j=1;j<=num-i;j++)			//공백찍기 위한 열변수 j, 가장 긴부분은 공백을 찍으면 안되기때문에 num-i까지 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)			//*을 찍기 위한 열변수 j,양쪽으로 한개씩 늘어야 하기 때문에 2*i-1까지 
			{
				System.out.print("*");
			}
			System.out.println();				//삼각형을 만들기 위해 개행
		}
		
		
		
		for(int i=1;i<=num;i++) 				//마름모의 중간의 가장 긴부분을 위해 시작을 1부터 num까지 도는 행변수 i 
		{
			for(int j=1;j<=i;j++)				//공백을 찍기 위한 열변수 j, 공백이 행이 늘어갈수록 같이 늘어나기 때문에 i까지 돌림 
			{
				System.out.print(" ");
			}
			for(int k=(i*2)-1;k<=(num*2)-3;k++)	  	//*을 찍기 위한 열변수 k, 가장긴부분부터 시작하고 양쪽하나씩 줄어들어야하기 때문에 (i*2)-1부터(num*2)-3까지 돌림
			{
				System.out.print("*");
			}
				System.out.println();			//역삼각형을 만들기 위해 개행
		}
		scan.close();						//스캐너 닫기
	}
	

}
