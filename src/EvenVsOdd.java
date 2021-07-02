public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sum1Com = 0;
        int sum2Com = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1Com = sum1Com + players[i];
            } else {
                sum2Com = sum2Com + players[i];
            }
        }
        if (sum1Com > sum2Com) {
            return 1;
        } else if (sum2Com > sum1Com) {
            return 2;
        }
        return 0;
    }
}
