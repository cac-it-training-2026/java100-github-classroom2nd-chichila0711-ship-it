/**

 * 第1章 マカロン屋さんのお仕事


 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		//		問題８　閉店の処理
		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計     \\" + totalCost);
		//		売り上げ内訳
		int citronDetails = (int) ((citronCost * citronstnum) / totalCost * 100);
		int chocolaDetails = (int) ((chocolaCost * chocolanum) / totalCost * 100);
		int pistachDetails = (int) ((pistachCost * pistachnum) / totalCost * 100);

		System.out.println("\n内訳");
		System.out.println("シトロン     \\" + (int) (citronCost * citronstnum) + "・・・" + citronDetails + "%");
		System.out.println("ショコラ     \\" + (int) (chocolaCost * chocolanum) + "・・・" + chocolaDetails + "%");
		System.out.println("ピスターシュ \\" + (int) (pistachCost * pistachnum) + "・・・" + pistachDetails + "%");

		//		問題9
		//		 * 三色マカロンの配合率が決まりました！
		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味     \\" + (int) (citronCost * citronstnum) + "・・・" + citronDetails + "%");
		System.out.println("ショコラの味     \\" + (int) (chocolaCost * chocolanum) + "・・・" + chocolaDetails + "%");
		System.out.println("ピスターシュの味 \\" + (int) (pistachCost * pistachnum) + "・・・" + pistachDetails + "%");

		System.out.println("\nが楽しめます！\n");
		//		マカロンの価格 ＝
		//		これまで売れてた商品の平均単価（1個あたり）
		//		一の位の切り捨ては/10*10
		System.out.println("値段は\\" + (totalCost / sum) / 10 * 10 + "です。");
	}

}
