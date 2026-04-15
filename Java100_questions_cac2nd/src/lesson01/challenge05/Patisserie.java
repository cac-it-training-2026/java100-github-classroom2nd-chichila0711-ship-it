/**
 * 第1章 マカロン屋さんのお仕事]

 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int citron = 30;
		int chocola = 30;
		int pistach = 30;
		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。 \n");

		System.out.println("シトロン     \\250・・・残り" + citron + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocola + "個");
		System.out.println("ピスターシュ \\320・・・残り" + pistach + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >");
		String citronstr = reader.readLine();
		int citronstnum = Integer.parseInt(citronstr);

		System.out.print("ショコラ     >");
		String chocolastr = reader.readLine();
		int chocolanum = Integer.parseInt(chocolastr);

		System.out.print("ピスターシュ >");
		String pistachstr = reader.readLine();
		int pistachnum = Integer.parseInt(pistachstr);

		int sum = citronstnum + chocolanum + pistachnum;

		int citronCost = 250;
		int chocolaCost = 280;
		int pistachCost = 320;

		int totalCost = citronCost * citronstnum + chocolaCost * chocolanum + pistachCost * pistachnum;
		System.out.println("\n合計個数" + sum + "個");
		System.out.println("合計金額" + totalCost + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
