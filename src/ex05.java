
public class ex05 {

	public static void main(String[] args) {
		String[] name = {"한사랑","김행복","정밝음"};
		int[][] score = {{75,90,75,0},{75,55,65,0},{100,100,100,0}};
		double[] avg = {0.0,0.0,0.0};
		char[] grade = new char[3];
		String[] pass = new String[3];
		int[] rank = {1,1,1};
		

		
		for(int i=0;i<name.length;i++) {
			score[i][3] = score[i][0] + score[i][1] + score[i][2]; //총점
			avg[i] = (double)score[i][3] /3;
			
			if(avg[i] >= 90) {
				grade[i] = 'A';
				pass[i] = "pass";
			}else if(avg[i] >= 80){
				grade[i] ='B';
				pass[i] = "pass";
			}else if(avg[i] >= 70) {
				grade[i] = 'C';
				pass[i] = "pass";
			}else if(avg[i] >= 60) {
				grade[i] = 'D';
				pass[i] = "pass";
			}else {
				grade[i] = 'F';
				pass[i] = "fail";
			}
			for(int j=0;j<i;j++) {
				if(score[i][3] < score[j][3]) {
					rank[i]++;
				}else {
					rank[j]++;
				}
			}	
		}
		System.out.println("================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t재수강");
		for(int i=0;i<name.length;i++) {
			System.out.println(" " + (i+1) + "     " + name[i] + "\t" + score[i][0] + "\t" +
					score[i][1] + "\t" + score[i][2] + "\t" + score[i][3] + "\t" +
					avg[i] + "\t" + grade[i] + "\t" + pass[i] + "\t\t" + rank[i]);
		}
	}

}
