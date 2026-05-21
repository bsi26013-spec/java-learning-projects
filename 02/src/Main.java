import java.util.Scanner;

/**
 * 
 * 【システム仕様】
 * - 10列 × 8座席の座席配置
 * - 列: A～J、座席: 1～8
 * - true=予約済み、false=空き
 * 
 * 【処理フロー】
 * 1. 座席表示（2重ループで行と列を処理）
 * 2. ユーザーが「A-3」の形式で座席指定
 * 3. 空き状況を確認して予約 または キャンセル
 * 4. 更新後の座席表示
 * 
 * 【必須実装】
 * - 座席表示メソッド（2重ループ使用）
 * - 座席予約メソッド
 * - 予約キャンセルメソッド
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // すべてfalse（空き座席）で初期化済み
        boolean[][] seki = new boolean[10][8];

        // 予約済み
        seki[0][2] = true;
        seki[3][4] = true;
        seki[5][3] = true;
        seki[2][5] = true;

        System.out.println("======== 座席一覧 ========");
        System.out.println("○: 空席  ●: 予約済み");
        System.out.println();

        //座席頭上の数字（1~8）表示　println一括表示

        //System.out.println("   " + 1 + " " + 2+ " " + 3+ " " + 4+ " " + 5 + " " + 6 + " " + 7 + " " + 8);

        //forバージョン
        for (int i = 1; i <= 8; i++) {
            if (i == 1) {
                System.out.print("   " + 1);
            } else {
            System.out.print(" " + i);
            }
        }
        System.out.println();

        //座席表示
        for (int i = 0; i < 10; i++) {
            char row = (char)('A' + i);
                System.out.print(row + ": ");
            for (int j = 0; j < 8; j++) {
                if (seki[i][j]) {
                    System.out.print("●" + " ");
                } else {
                    System.out.print("○" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("====座席を選んでください====");
        String input = sc.nextLine();

        // 最初の文字を取得
        char rowChar = input.charAt(0);

        // ハイフンの後の数字を取得
        String numStr = input.substring(2);
        int seatNum = Integer.parseInt(numStr);

        // インデックスに変換
        int row = rowChar - 'A';
        int col = seatNum - 1;

        boolean canReserve = !seki[row][col];

        if(canReserve) {
            seki[row][col] = true;
        }

        System.out.println();
        System.out.println();

        //座席頭上の数字（1~8）表示
        for (int i = 1; i <= 8; i++) {
            if (i == 1) {
                System.out.print("   " + 1);
            } else {
            System.out.print(" " + i);
            }
        }
        System.out.println();

        //座席表示
        for (int i = 0; i < 10; i++) {
            char row2 = (char)('A' + i);
                System.out.print(row2 + ": ");
            for (int j = 0; j < 8; j++) {
                if (seki[i][j]) {
                    System.out.print("●" + " ");
                } else {
                    System.out.print("○" + " ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        if (canReserve) {
            System.out.println("======== 予約結果 ========");
            System.out.println();
            System.out.println("予約しました");
        } else {
            System.out.println();
            System.out.println("予約済みです");
            System.out.println("他の席を指定してください");
        }

        

        


    }
}
