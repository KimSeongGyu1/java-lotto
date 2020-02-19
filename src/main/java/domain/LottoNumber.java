package domain;

import java.util.Arrays;
import java.util.List;

public enum LottoNumber {
    ERROR(-1),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SIXTEEN(16),
    SEVENTEEN(17),
    EIGHTEEN(18),
    NINETEEN(19),
    TWENTY(20),
    TWENTY_ONE(21),
    TWENTY_TWO(22),
    TWENTY_THREE(23),
    TWENTY_FOUR(24),
    TWENTY_FIVE(25),
    TWENTY_SIX(26),
    TWENTY_SEVEN(27),
    TWENTY_EIGHT(28),
    TWENTY_NINE(29),
    THIRTY(30),
    THIRTY_ONE(31),
    THIRTY_TWO(32),
    THIRTY_THREE(33),
    THIRTY_FOUR(34),
    THIRTY_FIVE(35),
    THIRTY_SIX(36),
    THIRTY_SEVEN(37),
    THIRTY_EIGHT(38),
    THIRTY_NINE(39),
    FORTY(40),
    FORTY_ONE(41),
    FORTY_TWO(42),
    FORTY_THREE(43),
    FORTY_FOUR(44),
    FORTY_FIVE(45);

//    private static final int MIN_LOTTO_NUMBER = 1;
//    private static final int MAX_LOTTO_NUMBER = 45;

    private final int number;

    LottoNumber(int number) {
        this.number = number;
    }

    public static LottoNumber getLottoNumber(int number) {
        List<LottoNumber> lottoNumbers = Arrays.asList(LottoNumber.values());

        return lottoNumbers.stream()
                .filter(lottoNumber -> lottoNumber.number == number)
                .findFirst()
                .orElse(LottoNumber.ERROR);
    }

    public int getValue() {
        return this.number;
    }
//
//    private static void validateNumber(int number) {
//        if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER) {
//            throw new IllegalArgumentException("1부터 45사이의 숫자를 입력해주세요.");
//        }
//    }
}
