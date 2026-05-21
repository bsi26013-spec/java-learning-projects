public class Main {
    public static void main(String[] args) {
        //生徒を作成
        String[] names = {"田中", "佐藤", "鈴木"};
        //教科作成
        String[] subjects = {"国語", "数学", "英語"};

        //点数
        int[][] score = {
            {80,70,90},
            {55,60,50},
            {90,85,95}
        };

        //計算した点数を保存

        //合計点
        int[] allScore = new int[names.length]; 

        //平均点
        int[] averageScore = new int[names.length];
        System.out.println("===== クラス成績表 =====");
        System.out.println();
        System.out.println("名前    国語 数学 英語 合計 平均 判定");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+ "     " );
            for (int j = 0; j < subjects.length; j++) {

                //生徒ごとの合計点数を計算
                allScore[i] += score[i][j];
                System.out.print(score[i][j] +"   " );
            }
            //合計点を表示
            System.out.print(allScore[i] + "  ");
            //平均点を計算＆表示
            averageScore[i] = allScore[i] / subjects.length;
            System.out.print(averageScore[i]+ "  ");
            
            //60点以上なら合格
            if (averageScore[i] >= 60) {
                System.out.print("合格");
            } else {
                System.out.print("不合格");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("===== 教科別平均 =====");
        System.out.println();

        //教科別平均点の変数作成
        int[]  subjectsAverage = new int[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            //教科別平均点をだすための一時変数　合計を計算
            int all = 0;
            for (int j = 0; j < names.length; j++) {
                all += score[j][i];
            }
            subjectsAverage[i] = all / names.length;
            System.out.println(subjects[i] + "の平均点: " + subjectsAverage[i] + "点");
        }
    }
}

