/**
 * 第1章 マカロン屋さんのお仕事


 *


 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double citronstnum = Double.parseDouble(citronstr);

		System.out.print("ショコラ     >");
		String chocolastr = reader.readLine();
		double chocolanum = Double.parseDouble(chocolastr);

		System.out.print("ピスターシュ >");
		String pistachstr = reader.readLine();
		double pistachnum = Double.parseDouble(pistachstr);

		System.out.println("\nシトロン     " + citronstnum + "個");
		System.out.println("ショコラ     " + chocolanum + "個");
		System.out.println("ピスターシュ " + pistachnum + "個\n");

		int sum = (int) (citronstnum + chocolanum + pistachnum);

		int citronCost = 250;
		int chocolaCost = 280;
		int pistachCost = 320;

		//		売上合計
		int totalCost = (int) (citronCost * citronstnum + chocolaCost * chocolanum + pistachCost * pistachnum);
		System.out.println("\n合計個数" + sum + "個");
		System.out.println("合計金額" + totalCost + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		//		問題⑥在庫を減らす処理
		System.out.println("\n本日のおすすめ商品です。\n");

		int citronstStock = (int) (30 - citronstnum);

		int chocolaStock = (int) (30 - chocolanum);

		int pistachStock = (int) (30 - pistachnum);

		System.out.println("シトロン     \\250・・・残り" + citronstStock + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocolaStock + "個");
		System.out.println("ピスターシュ \\320・・・残り" + pistachStock + "個");

	}
}
