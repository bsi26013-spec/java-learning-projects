import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== メニューを選択してください ===");
        System.out.println("1: ハンバーガー    (人気商品)");
        System.out.println("2: カレー          (おすすめ)");
        System.out.println("3: サラダ          (ヘルシー)");
        System.out.print("番号を入力してください: ");

        int choice = sc.nextInt();
        System.out.println();
        System.out.println("===注文する個数を書いてください===");
        int count = sc.nextInt();

        int price = switch (choice) {
            case 1 -> 500;
            case 2 -> 650;
            case 3 -> 200;
            default -> 0;
        };

        String itemName = switch (choice) {
            case 1 -> "ハンバーガー";
            case 2 -> "カレー";
            case 3 -> "サラダ";
            default -> "無効な注文です";
        };

        int total = price * count;
        int tax = total / 10;
        int totalWithTax = total + tax;

        System.out.println();
        System.out.println("========================================");
        System.out.println("             お会計");
        System.out.println("========================================");
        System.out.println("商品................................." + itemName);
        System.out.println("単価................................." + price + "円");
        System.out.println("個数................................." + count + "個");
        System.out.println("----------------------------------------");
        System.out.println("小計.............................." + total + "円");
        System.out.println("消費税(10%)........................." + tax + "円");
        System.out.println("========================================");
        System.out.println("合計.............................." + totalWithTax + "円");
        System.out.println("========================================");

        sc.close();
    }
}
