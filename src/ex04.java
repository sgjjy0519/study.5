//크기가 5인 정수형배열을 잡아 난수(1~50)를 저장하여 출력하시오
//
//
//--출력--
//
//[정렬전]
//num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25
//
//[정렬후]
//num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
//
//합 = xx
import java.util.Arrays;

public class ex04 {

	public static void main(String[] args) {
		int[] num = new int[5]; // 배열객체 5개 생성
		int sum = 0;
		
		System.out.println("[정렬 전]");
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*51);
			
			System.out.print("num["+i+"]="+num[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(num);  // 낮은값부터 차례대로 정렬
		System.out.println("[정렬 후]");
		for(int i=0;i<num.length;i++) {
			System.out.print("num["+i+"]="+num[i]+" ");
			sum += num[i];
		}
		System.out.println();
		System.out.print("합계="+sum);
	}

}
