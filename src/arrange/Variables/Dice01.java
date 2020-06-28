package arrange.Variables;

public class Dice01 {

	public static void main(String[] args) {
/*		Math.random()을 이용해서 주사위가 1~6번호가 나오게하고, 실행할 때
		마다  해당 번호가 나온 확률을 표기하세요.
		반복문으로 6회 실행하여 
		나온 번호 : @@
		1: @@@ %,  2: @@ %, 3: @@ %, 4: @@%, 5:@@%, 6:@@%
		각 번호별로 나온 횟수 
		no1/cnt : 소숫점 이하의 확률이 나온다. 3/횟수 ==> 0.5
		*100 : %로 변환  50.0 
		(int) : 정수로 casting 처리.. */
		
		// 사건A가 일어날 경우의 수들을 넣을 변수들
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		int no4 = 0;
		int no5 = 0;
		int no6 = 0;
		
		for(int c = 1; c<=6; c++) {
			System.out.println(c+"번째 주사위를 던집니다.");
			int dice = (int)(Math.random()*6+1); // Math.random()*경우의 수+시작하는 수
			System.out.println("나온 번호: "+ dice);
			// 주사위에 나오는 수에 따라 사건이 일어난 경우가 늘어난다.
			if(dice == 1) no1++;
			if(dice == 2) no2++;
			if(dice == 3) no3++;
			if(dice == 4) no4++;
			if(dice == 5) no5++;
			if(dice == 6) no6++; 
		}
		 
	 System.out.println("\t주사위를 6번 던졌을 때 1이 나온 확률: " +(int)((no1/(double)6)*100) + "%" );
	 System.out.println("\t주사위를 6번 던졌을 때 2가 나온 확률: " +(int)((no2/(double)6)*100) + "%");
	 System.out.println("\t주사위를 6번 던졌을 때 3이 나온 확률: " +(int)((no3/(double)6)*100) + "%");
	 System.out.println("\t주사위를 6번 던졌을 때 4가 나온 확률: " +(int)((no4/(double)6)*100) + "%");
	System.out.println("\t주사위를 6번 던졌을 떄 5가 나온 확률 : " + (int)((no5/(double)6)*100) + "%");	
	System.out.println("\t주사위를 6번 던졌을 떄 6이 나온 확률 : " + (int)((no6/(double)6)*100) + "%");	

		
	}

}
