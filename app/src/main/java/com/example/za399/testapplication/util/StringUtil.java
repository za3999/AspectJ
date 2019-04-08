package com.example.za399.testapplication.util;

import android.text.TextUtils;

public class StringUtil {

    public static String substringByCodePoints(String source, int start, int end) {
        String result;
        start = start < 0 ? 0 : start;
        if (TextUtils.isEmpty(source) || end < start) {
            return "";
        }
        try {
            int pointCount = source.codePointCount(0, source.length());
            start = source.offsetByCodePoints(0, Math.min(pointCount, start));
            end = source.offsetByCodePoints(0, Math.min(pointCount, end));
            result = source.substring(start, end);
        } catch (Exception e) {
            result = "";
        }
        return result;
    }
}
