package com.bookndrive.common.util;

public final class SensitiveDataMasker {

    private SensitiveDataMasker() {
    }

    public static String maskEmail(String mail) {
        if (mail == null || mail.isBlank()) {
            return "unknown";
        }

        int atIndex = mail.indexOf('@');
        if (atIndex <= 0) {
            return "***";
        }

        return mail.charAt(0) + "***" + mail.substring(atIndex);
    }

    public static String maskKeepingPrefix(String value, int visiblePrefixLength) {
        if (value == null || value.isBlank()) {
            return "unknown";
        }

        if (visiblePrefixLength <= 0 || value.length() <= visiblePrefixLength) {
            return "***";
        }

        return value.substring(0, visiblePrefixLength) + "***";
    }
}
