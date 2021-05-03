//숫자맞추기 게임
//컴퓨가 0~100사이의 임의의수 하나를 발생  
//
//55     <----화면에 보이면 안됨
//숫자입력(0~100) : 50
//크다
//
//숫자입력(0~100) : 60
//작다
//
//숫자입력(0~100) : 55
//맞았다(3번)
//
//
//계속(y/n) : y
//숫자입력(0~100) : 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int myNum;
		int cnt = 0;
		char check;

		while (true) {
			int comNum = (int) (Math.random() * 100 + 1);
			
			while (true) {
				System.out.print("숫자 입력(0~100) : ");
				myNum = Integer.parseInt(bf.readLine());
				cnt++;
				if (myNum < comNum) {
					System.out.print("더 큰 숫자입니다.");
				} else if (myNum > comNum) {
					System.out.print("더 작은 숫자입니다.");
				} else {
					System.out.print("정답입니다," + cnt + "번 만에 맞췄습니다.");
					break;
				}

			}
			System.out.println();
			System.out.print("계속하시겠습니까? (Y/N)");
			check = bf.readLine().charAt(0);

			if (check == 'n') {
				break;
			}
		}
	}
}
