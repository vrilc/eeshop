package com.better517na.fangyuan.util;

import org.springframework.lang.Nullable;

public class StringUtils {


    public static Boolean isValidKeyId(String keyId) {
        return !isEmpty(keyId) && keyId.matches("[1-9][0-9]{4,9}");
    }

    private static boolean isEmpty(@Nullable Object str) {
		return (str == null || "".equals(str));
	}
}