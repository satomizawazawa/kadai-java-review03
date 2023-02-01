package baseball;

public class BaseBallTeam {
//フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
//引数なしのコンストラクタ
    public BaseBallTeam() {
    }

//引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

  //勝敗情報表示メソッド
    public void repot() {
        double rate;
        rate = getRate(win,lose);
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です。");
    }

//勝率計算メソッド
    public double getRate(double num1 , double num2) {
        double rate = num1 / (num1 + num2);
        return rate;
    }


}
