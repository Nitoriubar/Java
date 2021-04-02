import java.util.Arrays;
import java.util.Scanner;


/* 에라토스테네스의 체 
   -소수를 찾는 방법
   
 *장점
  - 알고리즘 시간 복잡도: O(NloglogN) 
 *단점
  - 각 자연수에 대한 소수 여부를 저장해야하므로 메모리 많이 필요!
 
 *Solution   
   1. 모든 자연수를 나열
   2. 남은 수 중 아직 처리하지 않은 가장 작은 수(=i)를 찾는다.
   3. 남은 수 중 i의 배수를 모두 제거한다.(i는 제거X)
   4. 더 이상 반복할 수 없을 때까지(=제곱근) 2번과 3번을 반복한다.
   
 */

public class eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt();	
    
    if(num <= 1) return;
		
		//step 1
		boolean[] arr = new boolean[num+1];  //배열 선언과 동시에 배열 크기 할당
		Arrays.fill(arr, true);				       //배열의 값을 전부 true로 채우기
		
		//step 4
		for(int i=2; i <= Math.sqrt(num);i++) {	
			//step 2
			if(arr[i] == true) {
				int j = 2;
				
				//step 3
				while (i * j <= num) {
					arr[i*j] = false;
					j+=1;
				}
			}
		}
		//소수 화면에 출력
		for(int i=1; i <= num; i++) {
			if(arr[i]) System.out.print(i+" ");
		}
		

	}

}
