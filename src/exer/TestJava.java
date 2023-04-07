package exer;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=98;
		
		if(score < 50) {
			System.out.println("조건의 첫번째 결과가 참입니다.");
		} else if(score <60 ){
			System.out.println("조건의 두번째 결과가 참입니다.");
		} else if(score <70 ){
			System.out.println("조건의 세번째 결과가 참입니다.");
		} else if(score <90 ){
			System.out.println("조건의 네번째 결과가 참입니다.");
		} else {
			System.out.println("그만하십시오");
		}
	}

}
