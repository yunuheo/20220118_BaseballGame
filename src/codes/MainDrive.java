package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		컴퓨터가 랜덤으로 3자리 숫자를 문제로 출제. (랜덤메써드)

		Scanner myScanner = new Scanner(System.in); // 메모리 낭비를 줄이기 위해 스캐너를 반복문 밖에다가 위치.
		
		int gameCount = 1; // 몇번만에 맞췄는지 계산.
		
//		3S라이크가 될때까지 무한반복
//		while(true) {
//		길이가 3인 배열을 만들자. 
		int[] challNumArr = new int[3]; 
		
//		숫자가 중복되면 안됌 => 중복검사 필요
		
		for (int i = 0; i < challNumArr.length; i++) {
//			조건 만족될때까지 반복 수행.(중복x -> 반복문 탈출)
			while(true) {
				int randomNum = (int)(Math.random()*9+1);  // 1< 랜덤*9+1 < 10
				
				boolean isDuplOk = true; //우선 중복검사에 통과했다 보고, 틀리면 false값 대입.
				
				for (int challNums : challNumArr) {
					if (challNums == randomNum) {
					isDuplOk = false;
					break; // 중복검사에 탈락했으니 break로 for문 탈출
					}
				}
				
				if (isDuplOk) {
					challNumArr[i] = randomNum;
					break;
				}
				
			}
						
		}
		
//	    랜덤으로 1~9 사이의 정수 3개를 반환 (중복되는 수 없음)
		for (int challNum : challNumArr) {
			System.out.print(challNum);
		}
		System.out.println();
//		Scanner로 세자리 정수를 입력받자. ( 147 => [1,4,7]형태로 분리해서 저장 )
		

		
		
		
		while(true) {
			
		
		int[] inputNumArr = new int[3];
		
		while (true) {			
					
		System.out.print("세자리 정수를 입력하시오. : ");
		int inputNum = myScanner.nextInt();
		
		boolean DuplOk = true;
		
			
			
		
		
//		입력된 숫자를 배열에 담자
		
		
//			inputNum의 각 자리수를 분리하여 배열에 저장해야함.

			inputNumArr[0] = inputNum/100;
			inputNumArr[1] = (inputNum/10)%10; 
			inputNumArr[2] = inputNum % 10;
			
			for (int i = 0; i < inputNumArr.length-2; i++){
				if (inputNumArr[i] == inputNumArr[i+1] || inputNumArr [i] == inputNumArr[i+2] || inputNumArr[i+1] == inputNumArr[i+2]) {
					DuplOk = false;
					break;
				}
			}
			
			
			
		if(DuplOk) {
		System.out.print("입력한 숫자: ");
		for ( int inputNums : inputNumArr) {
			
		System.out.print(inputNums);
		}
		
		System.out.println();
		break;
		
		}
		
		else {
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			}
		}
		
		
//		두 배열을 비교해서, ?S ?B을 판정해서 출력하자.
		
//		숫자도 맞고, 위치도 맞다 => S판정.  
//		숫자는 맞는데, 위치가 다르다 => B판정.
//		판정 결과가 3S로 판정될때까지 반복 
		


		int ballCount = 0;	

		
		int strikeCount = 0;
		
		for (int i = 0; i < challNumArr.length; i++) {
			for (int j = 0; j < inputNumArr.length; j++) {
				if (challNumArr[i] == inputNumArr[j]) {  //두 배열에 동일한 숫자가 존재. 
					if (i==j) {  //동일한 숫자가 있으면서 자릿수 까지 같은가요? => strike판정
						strikeCount++;
					}
					else {
						ballCount++;
					}
				}
			}
		}
				
		
		if(strikeCount == 3) {
			System.out.println("축하합니다.정답입니다! "+gameCount+"번만에 정답을 맞추셨습니다."); 
			break;
		}
		
		gameCount++;
		
		System.out.println(ballCount+"볼 "+strikeCount+"스트라이크!");	
		System.out.println("========================="); //구분선 입력
		
		for (int challNum : challNumArr) {
			System.out.print(challNum);
		}
		System.out.println();
		}

		
		
		

		

		
		
		
		

	}

}
