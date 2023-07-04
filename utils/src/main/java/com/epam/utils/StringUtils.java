package com.epam.utils;
import org.apache.commons.*;


public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if( createNumber(str).doubleValue() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
