package arrange.Variables;

public class V_01 {
	public static void main(String[] args) {
// ex) 연산자(+,-,*,/,%)와 변수 활용 연습.
// 1. 사과가 10개가 있는데, 4명이 동일하게 할당할 사과의 갯수와 나머지 갯수를
// 출력 하세요.(프로그램 변수 활용- 실수, 정수)
		System.out.println("-------- 할당할 사과의 갯수와 나머지 갯수--------");

		int apple = 10; 
		int person = 4;
		
		int divApp = apple/person;
		int rest  = apple % person;
		// 정수를 실수로 변환처리..
		double perAppleCnt = apple/(double)person;
		double perAppleCnt1 = (double)apple/person;
		// 어차피 실수 하나로 나누면 결과는 실수
		System.out.println(perAppleCnt1);
		
		System.out.println("사과의 갯수 : " + apple);
		System.out.println("전체인원:" + person);
		System.out.println("4명이 동일하게 할당받을 사과의 갯수 :" + divApp);
		System.out.println("할당하고 난 후의 나머지 갯수 : " + rest);
		System.out.println("한명 당 사과의 갯수(실수) : " + perAppleCnt);

		System.out.println("--------개당 2000원 하는 사과를 5개 구매--------");
		
//	2. 개당 2000원 하는 사과를 5개 구매하였다. 총 비용을 출력하세요.(변수활용)
			
		int e_apple = 5;
		int price = 2000;
		int totPrice = e_apple * price;
		System.out.println("사과의 갯수 : " + e_apple);
		System.out.println("사과의 개당 가격 : " + price);
		System.out.println("2000원어치 사과 5개를 사면 얼마를 내야하나요? " + totPrice);
		
		
		
//		3. 가계부에  초기 잔액이 100000에서  교통비로 2회 2500씩 지출하고,
//		용돈을 50000으로 수입이 되었다. 변수를 이용하여 현잔액을 출력하세요.
	
		int housekeeping = 100000;
		int tranprice = 2500;
		int tranCnt = 2;
		int pmoney = 50000;
		int nowmoney = housekeeping-(tranprice*tranCnt)+pmoney;
		System.out.println("--------현재 잔액-----------");
		System.out.println(nowmoney+"원 입니다.");
		
	
//		4. Math.random()을 이용해서 주사위가 1~6번호가 나오게하고, 		
//		실행할 때마다  해당 번호가 나온 확률을 표기하세요.
//		반복문으로 6회 실행하여 
//		나온 번호 : @@
//		1: @@@ %,  2: @@ %, 3: @@ %, 4: @@%, 5:@@%, 6:@@%
		// 각 번호별로 나온 횟수 
		// 나온 번호에 따른 번호별 횟수 카운트 업

		int no1 = 0 ;
		int no2 = 0;
		int no3 = 0;
		int no4 = 0;
		int no5 = 0;
		int no6 = 0;
		
		for(int cnt = 1; cnt <= 6; cnt++) {
			System.out.println(cnt+"번째 주사위 던지기");
			int dice = (int)(Math.random()*6+1);
			System.out.println("\t 나온 주사위 번호 : "+ dice);
			// 나온 번호에 따른 번호별 횟수 카운트 업
			if(dice == 1)	no1++;
			if(dice == 2)	no2++;
			if(dice == 3)	no3++;
			if(dice == 5)	no4++;
			if(dice == 6)	no6++;
			
			System.out.println("\t # 나온 확률 ");
		
			
		}
		// no1 / cnt = 소숫점 이하의 확률이 나온다, 3/횟수 ==> 0.5
		// *100 : %로 변환 50.0
		// (int) : 정수로 casting 처리
		System.out.println("\t: "+(int)((no1/(double)6)*100)+"%\t");
		
		 
	
	}
	
	
	
}
