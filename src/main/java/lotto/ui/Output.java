package lotto.ui;

import lotto.utils.OutputMessage;

public class Output {
    public static void inputPurchaseAmountMessage() {
        System.out.println(OutputMessage.INPUT_PURCHASE_AMOUNT);
    }

    public static void lottoCount(int count) {
        System.out.println(String.valueOf(count) + OutputMessage.LOTTO_COUNT);
    }
}
