package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        tokyo.repot();

        BaseBallTeam yokohama = new BaseBallTeam("横濱DeNAベイスターズ",73,68,2);
        yokohama.repot();

        BaseBallTeam osaka = new BaseBallTeam("阪神タイガース",68,71,4);
        osaka.repot();

        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        yomiuri.repot();

        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ",66,74,3);
        hiroshima.repot();

        BaseBallTeam nagoya = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        nagoya.repot();

    }
}