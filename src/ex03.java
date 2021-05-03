//배열을이용하여 날짜를 기억시킨 후
//각 달의 일수
//int []month={31,28,31,30,31,30,31,31,30,31,30,31};
//
//--입력/출력--
//
//원하는 달 : 3
//3월은 31일입니다...


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31}; //배열
		int num;
		System.out.println("--입력/출력--");
		System.out.print("원하는 달 : ");
		num = Integer.parseInt(br.readLine());
		
		System.out.print(num+"월은 "+month[num-1]+"일 입니다.");
	}

}
