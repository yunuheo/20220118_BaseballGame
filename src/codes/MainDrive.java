package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//		컴퓨터가 랜덤으로 3자리 숫자를 문제로 출제. (랜덤메써드)
		
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
			System.out.println(challNum);
		}
		
		
		
		

	}

}
