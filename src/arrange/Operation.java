package arrange;

public class Operation {

	public static void main(String[] args) {
 
		/*
		  연산자의 우선순위
		  1. () 소괄호를 씌운 연산자는 가장 먼저 연산이 된다.
		  2. (*, /, %) 연산이 먼저 왼쪽부터 오른쪽으로 수행된다.
		  	해당 연산자는 동일한 결과값으로부터 왼쪽으로부터 오른쪽을 수행
		  3. +, - 왼쪽 > 오른쪽으로 수행
		  4. 단항연산자(++(increment), --(decrement), !(Not))
		  	  부호 연산자(+, -)
		  	  대입 연산자(=, +=, -=)
		  */
		int num1 = 1;
		int ex = ++num1;
		System.out.println("num1에서 increment연산자를 사용하여 1에서"+ ex+"가 되었습니다." );
		
		int dec1 = 5;
		int ex1 = --dec1;
		System.out.println("감소연산자를 사용해 1이 감소하여 값이"+ex1+"가 되었습니다.");
		
		int num3 = 10;
		int num4 = 20;
		num3 -= 5; // num3 = num3 - 5 
		num4 -= 5; // num4 = num4 - 5, num4 = 20 - 5;
		
		System.out.println("num3: "+ num3);
		System.out.println("num4: "+ num4);
		
		/*
		 비교 연산자 : ==, !=, >, <, >=, <=, instanceof
		 n1 != n2 : 두개의 변수가 다를 때 true, 같으면 false
		 
		 */
		
	}

}

class Person{}
class Book {}
