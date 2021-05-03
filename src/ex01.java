//BufferedReader를 이용하여 입력받기
//이름, 나이....각각 배열을 3개씩 만들어서 입력 받기
//
//--입력--
//이름 : 주몽 
//나이 : 20
//
//이름 : 소서노
//나이 : 21
//
//이름 : 모팔모
//나이 : 52
//
//--출력--
//주몽     20세
//소서노   21세
//모팔모   52세
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String name[] = new String[3]; // 문자열타입 객체생성
		int age[] = new int[3];		   // 정수타입 객체생성
		
		System.out.println("----입력----");
		for(int i=0;i<3;i++) {
			System.out.print("이름 : ");
			name[i] = br.readLine();
			System.out.print("나이 : ");
			age[i] = Integer.parseInt(br.readLine());
			
			System.out.println();
		}
		for(int i=0; i<3; i++) {
			System.out.printf("%-5s\t%d세\n", name[i], age[i]);
		}
		
	}

}
