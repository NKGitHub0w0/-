package 再帰的_トーナメント;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author taro
 *
 */
public class 再帰的_アルゴリズム {
	private int CountInt = -1;
	private ArrayList<String> List;
/**
 * 再帰的なアルゴリズムのコンストラクタ
 * @param list トーナメントメンバーのリスト
 * @throws IOException
 */
	再帰的_アルゴリズム(ArrayList<String> list_Constructor) throws IOException{
		setList(list_Constructor);
		再帰的トーナメント(list_Constructor.size());
	}

	public ArrayList<String> getList() {
		return List;
	}
	public void setList(ArrayList<String> list) {
		List = list;
		System.out.println("List:"+List);
	}
	/**
	 *再帰的アルゴリズム
	 * @param PlayerCountInt プレイヤー情報
	 * @return	再帰の最後	：ListからPlayerを代入
	 * 			上記以外		：勝者
	 * @throws IOException
	 */
	private String 再帰的トーナメント(int PlayerCountInt) throws IOException {
		if(PlayerCountInt == 1) {
//			System.out.println("末端");
			CountInt++;
			System.out.println(CountInt+"番目："+List.get(CountInt));
			return List.get(CountInt);
		}
		else{
//			System.out.println("再起");
			return 対戦(再帰的トーナメント(PlayerCountInt-(PlayerCountInt/2)),再帰的トーナメント(PlayerCountInt/2));
		}
	}
	/**
	 * 対戦メソッド
	 * @param Player1
	 * @param Player2
	 * @return 勝者
	 * @throws IOException
	 */
	private String 対戦(String Player1,String Player2) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean flagBoolean = true;
		do {
			System.out.println(Player1+"(1) VS "+Player2+"(0) を入力してください");
			String 勝者 = br.readLine();
			if(勝者.equals("1")) {
				return Player1;
			}else if(勝者.equals("0")) {
				return Player2;
			}
			System.out.println("不正な値です。");
		}while(flagBoolean);
		return null;
	}
}
