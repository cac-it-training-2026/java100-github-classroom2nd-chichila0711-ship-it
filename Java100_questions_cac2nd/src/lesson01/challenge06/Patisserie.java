/**

 * 第1章 マカロン屋さんのお仕事



 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\nシトロン     " + citronstnum + "個");
		System.out.println("ショコラ     " + chocolanum + "個");
		System.out.println("ピスターシュ " + pistachnum + "個\n");

		int sum = citronstnum + chocolanum + pistachnum;

		int citronCost = 250;
		int chocolaCost = 280;
		int pistachCost = 320;

		int totalCost = citronCost * citronstnum + chocolaCost * chocolanum + pistachCost * pistachnum;
		System.out.println("\n合計個数" + sum + "個");
		System.out.println("合計金額" + totalCost + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		//		問題⑥在庫を減らす処理
		System.out.println("\n本日のおすすめ商品です。\n");

		int citronstStock = 30 - citronstnum;

		int chocolaStock = 30 - chocolanum;

		int pistachStock = 30 - pistachnum;

		System.out.println("シトロン     \\250・・・残り" + citronstStock + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocolaStock + "個");
		System.out.println("ピスターシュ \\320・・・残り" + pistachStock + "個");

	}

}
