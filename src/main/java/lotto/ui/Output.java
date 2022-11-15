package lotto.ui;

import lotto.domain.Lotto;
import lotto.utils.OutputMessage;

import java.util.List;

public class Output {
    public static void inputPurchaseAmountMessage() {
        System.out.println(OutputMessage.INPUT_PURCHASE_AMOUNT);
    }

    public static void lottoCount(int count) {
        System.out.println(String.valueOf(count) + OutputMessage.LOTTO_COUNT);
    }

    public static void sortedLotto(List<Lotto> lottos) {
        System.out.println(lottos);
    }

    public static void inputWinningNumberMessage() {
        System.out.println(OutputMessage.INPUT_WINNING_NUMBER);
    }

    public static void inputBonusNumberMessage() {
        System.out.println(OutputMessage.INPUT_BONUS_NUMBER);
    }

    public static void winningStatisticsMessage() {
        System.out.println(OutputMessage.WINNING_STATISTICS_MESSAGE);
    }

    public static void  winningStatistics(List<Integer> counts) {
        for (int i = counts.size(); i >= 0; i--) {
            System.out.println(OutputMessage.WINNING_FIFTH.getMessage() + counts.get(i) + OutputMessage.WINNING_ALL_COUNT.getMessage());
            System.out.println(OutputMessage.WINNING_FOURTH.getMessage() + counts.get(i) + OutputMessage.WINNING_ALL_COUNT.getMessage());
            System.out.println(OutputMessage.WINNING_THIRD.getMessage() + counts.get(i) + OutputMessage.WINNING_ALL_COUNT.getMessage());
            System.out.println(OutputMessage.WINNING_SECOND.getMessage() + counts.get(i) + OutputMessage.WINNING_ALL_COUNT.getMessage());
            System.out.println(OutputMessage.WINNING_FIRST.getMessage() + counts.get(i) + OutputMessage.WINNING_ALL_COUNT.getMessage());
        }
    }
}
