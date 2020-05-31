package com.mercenaries.EasyApi.util;

import java.math.BigDecimal;

public class Utils {
    private Utils() {
        super();
    }

    public static <T extends Comparable<T>> boolean isBetween(BigDecimal value, BigDecimal min, BigDecimal max) {
        return value.compareTo(min) > 0 && max.compareTo(value) > 0;
    }

    public static <T extends Comparable<T>> boolean isBetweenOrEquals(BigDecimal value, BigDecimal min, BigDecimal max) {
        return value.compareTo(min) >= 0 && max.compareTo(value) >= 0;
    }
}
