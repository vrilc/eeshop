package com.better517na.fangyuan.util;

import org.springframework.lang.Nullable;

public class StringUtils {


    public static Boolean isValidKeyId(String keyId) {
        if(isEmpty(keyId)){
            return false;
        }
        if(keyId.matches("[1-9][0-9]{4,9}")){
            return true;
        }
        return false;
    }
    
	public static boolean isEmpty(@Nullable Object str) {
		return (str == null || "".equals(str));
	}
}