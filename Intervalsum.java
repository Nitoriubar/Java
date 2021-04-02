import java.util.Scanner;

public class Intervalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 구간 합
		 * 구간 합 문제?
		 * : 연속적으로 나열된 N개의 수가 있을 때 특정 구간의 모든 수를 합한 값을 계산하는 문제
		 * 
		 *  구간합을 구하는 연산이 여러번일 경우 어떵게 해결할 수 있을까?
		 *  
		 *  Solution
		 *  접두사 합을 이용해서 빠르게 구할 수 있다.
		 *  접두사합(Prefix Sum):배열의 맨 앞부터 특정 위치까지의 합을 미리 구해 놓은 것
		 *  
		 *  1. N개의 수 위치 각각에 대하여 접두사 합을 계산하여 P에 저장합니다.
		 *  2. 매 구간 정보를 확인할 때 구간 합은 p[right]-p[left-1]이다.
		 *  
		 * */
		int[] arr = {10, 20, 30, 40, 50};
		Scanner scan = new Scanner(System.in); 
		System.out.println("구간을 정하세요: ");
		int left = scan.nextInt();
		int right = scan.nextInt();
		int[] p = new int[arr.length+1];
		int i = 0, intervalsum=0;
    
		//step1
		while(i < arr.length) {
			if(i==0) {
				p[i] = 0;
			}
			for(int j=0;j<=i;j++) {
				p[i+1] += arr[j];
			}
			i += 1;			
		}
		
    //step2
		intervalsum = p[right]-p[left-1];
		System.out.print(intervalsum);
		
	}

}
