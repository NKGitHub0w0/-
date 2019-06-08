package 再帰的_トーナメント;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
//	public static List<String> TournamentParticipants = Arrays.asList("A","B","C","D","E","F","G","H","I");

	public static void main(String[] args) throws IOException {
		ArrayList<String> TournamentParticipants = new ArrayList<>() ;
		TournamentParticipants.add("A");
		TournamentParticipants.add("B");
		TournamentParticipants.add("C");
		TournamentParticipants.add("D");
		TournamentParticipants.add("E");
		TournamentParticipants.add("F");
		TournamentParticipants.add("G");
		TournamentParticipants.add("H");
		TournamentParticipants.add("I");
		System.out.println("TournamentParticipants:"+TournamentParticipants);
		//再帰的アルゴリズムのインターフェイスの作成
		new 再帰的_アルゴリズム(TournamentParticipants);
	}
}
