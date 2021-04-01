import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);      // 스캐너를 사용해 키보드로 값을 입력받겠다.
		int r = scan.nextInt();                     //반지름 r을 입력받는다.

		for (int x = -r; x <= r; x++) {				     //x좌표 나타내기
			for (int y = -3*r; y <= 3*r; y++) {		   //y좌표 나타내기,	원에 가깝게 찍기 위해 열의 범위를 행의 범위보다 오른쪽 왼쪽 2배씩키움.
				if (r*r<=x*x+y*y)  				             //원의 방정식을 이용해 식이 맞을때 별을 찍고 아닐 경우 공백을 찍개 함. 3개씩인 이유는 1일때도 별이 나오게 하기위해서 
					System.out.print("**");		
				else 
					System.out.print("  ");
			}
			System.out.println();		                 //줄바꾸기
		}

	}

}
