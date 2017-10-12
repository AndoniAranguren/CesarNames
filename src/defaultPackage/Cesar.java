package defaultPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cesar {
	
	//atributuak
	private static Cesar myself;
	private final int firstAscii=97, lastAscii=122, showX= 10;
	
	//Eraikitzailea
	private Cesar(){}
	public static Cesar getCesar(){
		if(myself==null)
			myself=new Cesar();
		return myself;
	}
	
	//gainontzeko metodoak
	public List<String> bestCesarNamification(String pWord){
		ArrayList<String> list= cesarNames(pWord);
		list.sort(new BestNames());
		return list.subList(0, showX);
	}
	public List<String> bestCesarNamificationGerman(String pWord){
		ArrayList<String> list= cesarNames(pWord);
		list.sort(new BestGermanNames());
		return list.subList(0, showX);
	}
	
	public ArrayList<String> cesarNames(String pWord){
		ArrayList<String> list= new ArrayList<String>();
		for(int ind=0; ind<lastAscii-firstAscii; ind++){
			list.add(cesarEncrypt(pWord,ind));
		}
		return list;
	}
	private String cesarEncrypt(String pWord, int pInd) {
		String cesarWord=""+encrypt(pWord.toLowerCase().charAt(0),pInd);
		cesarWord=cesarWord.toUpperCase();
		for(int index=1; index<pWord.length(); index++){
			cesarWord=cesarWord
					+encrypt(pWord.toLowerCase().charAt(index),pInd);;
		}
		return cesarWord;
	}
	private char encrypt(int ch, int index) {
		if((ch+index)<lastAscii)
			return (char)(ch + index);
		else
			return (char)(firstAscii + (ch+index)-lastAscii);
	}
	
}
