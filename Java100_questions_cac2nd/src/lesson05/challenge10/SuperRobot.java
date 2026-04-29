package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cooking {
	String dish;

	void cook(int method) {
		if (method == 1) {
			dish = "ブフ・ブルギニョン";
		} else if (method == 2) {
			dish = "ラタトゥイユ";
		} else if (method == 3) {
			dish = "キッシュ・ロレーヌ";
		} else if (method == 4) {
			dish = "クロケット";
		} else if (method == 5) {
			dish = "ムール・マリニエール";
		} else {
			dish = "ジャイアンシチュー";
		}
		System.out.println("\n3...");
		System.out.println("\n2...");
		System.out.println("\n1...");

		System.out.println("\n―調理完了―");
		System.out.println(dish + "の出来上がりだ。");

	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		Cooking cooking = new Cooking();

		System.out.println("ぼくはオートシェフ\n");
		System.out.println("冷蔵庫とオート調理が備わった自動調理型冷蔵庫である");
		System.out.println("調理方法を選択するだけで高級フランス料理の出来上がりだ\n");
		System.out.println("調理時間はわずか3秒\n");
		System.out.println("さあ、君はどんなフランス料理が食べたい？\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("調理法を入力するんだ");
		System.out.print("（1.煮る 2.炒める 3.焼く 4.揚げる 5.蒸す）>");
		String methodStr = reader.readLine();
		int method = Integer.parseInt(methodStr);
		cooking.cook(method);

	}

}
