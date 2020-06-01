package com.mercenaries.EasyApi.util;

import static com.mercenaries.EasyApi.util.StringUtils.getStandardMessage;

public class EasyApiConstants {
    private EasyApiConstants() {
        super();
    }

    /*
     * Standard Response messages according to the returned HTTP code.
     */
    public static final String RESPONSE_200 = getStandardMessage("response.code200");
    public static final String RESPONSE_201 = getStandardMessage("response.code201");
    public static final String RESPONSE_204 = getStandardMessage("response.code204");

    public static final String RESPONSE_304 = getStandardMessage("response.code304");

    public static final String RESPONSE_400 = getStandardMessage("response.code400");
    public static final String RESPONSE_401 = getStandardMessage("response.code401");
    public static final String RESPONSE_404 = getStandardMessage("response.code404");

    public static final String RESPONSE_500 = getStandardMessage("response.code500");
}
