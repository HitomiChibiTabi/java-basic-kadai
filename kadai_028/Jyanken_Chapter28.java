package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public static String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice = scanner.next();
		scanner.close();
		return myChoice;
	}
	
	//getRandomを呼び出す
	public static String getRandom() {
		//getRandomでやること：対戦相手の3択を配列に代入（12章）
		
		String[] handArray = {"r", "s", "p"};
		
		//配列の3択の中からランダムで1個を出力する（20章）
		
		int handRandom = (int) (Math.floor(Math.random() * handArray.length));
		
		//ランダムで配列された値をクラスに返す：リターン（14章）
		return handArray[handRandom];
		
	}
	
	public void playGame() {
		
		String hand = getRandom();
		String myChoice = getMyChoice();
		
	
		if( (myChoice.equals("r")) || (myChoice.equals("s")) || (myChoice.equals("p"))) {
			
			HashMap<String, String> jyanken = new HashMap<>();
			jyanken.put("r","グー");
			jyanken.put("s","チョキ");
			jyanken.put("p","パー");
			
			System.out.println("自分の手は" + jyanken.get(myChoice) + ",対戦相手の手は" + jyanken.get(hand));
			
			
			if(myChoice.equals(hand)) {
				System.out.println("あいこです");
			} else if ((myChoice.equals("r")) && (hand.equals("s")) || (myChoice.equals("s")) && (hand.equals("p")) || (myChoice.equals("p")) && (hand.equals("r")) ) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("相手の勝ちです");
			}
		
			
		} else {
			
			System.out.println("正しい手を入力しましょう");
		}
	
	}

}
