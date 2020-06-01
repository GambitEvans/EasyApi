package com.mercenaries.EasyApi.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static java.util.Locale.getDefault;
import static java.util.ResourceBundle.getBundle;

public class StringUtils {
    public static final String BLANK = "";
    public static String getStandardMessage(final String keyMessage, final Object... params) {
        final ResourceBundle bundle = getBundle("easy-api-messages", getDefault());

        return recoverText(bundle, keyMessage, params);
    }

    private static String recoverText(final ResourceBundle bundle, final String keyMessage, final Object params) {
        String message = BLANK;

        try {
            message = bundle.getString(keyMessage);
        } catch (final MissingResourceException e) {
            return message;
        }

        return new MessageFormat(message).format(params);
    }
}
