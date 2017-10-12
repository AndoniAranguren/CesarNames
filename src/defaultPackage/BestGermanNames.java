package defaultPackage;

import java.util.Comparator;

public class BestGermanNames implements Comparator<String> {
	
	//atributuak

	//Eraikitzailea
	
	@Override
	public int compare(String pLeft, String pRight) {
		return Integer.compare(
				getScore((String) pLeft),
				getScore((String) pRight));
	}

	private int getScore(String pWord) {
		int points=0;
		points+=pointsFromChar(pWord.toLowerCase().charAt(0));
		for(int index=1; index<pWord.length(); index++){
			points+=pointsFromChar(pWord.charAt(index));
		}
		return points;
	}

	private int pointsFromChar(char charAt) {
		switch(charAt){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			return 1;
		default:
			return 0;
		}
	}
}
