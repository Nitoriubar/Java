import java.util.Scanner;

public class Twopointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 투포인터 알고리즘은 리스트에 순차적으로 접근해야할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘
		 * 
		 *  투 포인터알고리즘으로 해결할 수 있는 문제
		 *	=> 특정한 합을 가지는 부분 연속 수열 찾기(여기서 부분 연속 수열이란 하나의 수열이 있을때, 그 수열에서 연속된 일부분의 데이터만 가지는 수열을 말한다.)
		 * 
		 * Solution
		 * 1. 시작점(start)과 끝점(end)이 첫번째 원소의 인덱스(0)를 가리키도록 한다. 
		 * 2. 현재 부분 합이 num과 같다면 카운트한다.
		 * 3. 현재 부분 합이 num보다 작다면 end를 1증가 시킨다.
		 * 4. 현재 부분 합이 num보다 크거나 같다면 start를 1증가시킨다.
		 * 5. 모든 경우를 확인할 때까지 2번부터 4번까지의 과정을 반복한다. 
		 * */
		
		//Ver1
		int[] arr = {1,2,2,3,2,4,3,5};
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt();	
		int start = 0, end = 0, count = 0, sum = 0;
		
		while(start < arr.length && end < arr.length){
			for(int i = start; i <= end; i++) {
				sum += arr[i];				
			}
			if(sum==num) {
				count += 1;
				start += 1;
			}
			else if(sum<num) {
				end += 1;
			}
			else {
				start+=1;
			}
			sum=0;
		}
				
		System.out.print(count);
  }
}
