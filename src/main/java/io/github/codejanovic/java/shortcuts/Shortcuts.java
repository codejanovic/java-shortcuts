package io.github.codejanovic.java.shortcuts;

import java.util.Objects;

public final class Shortcuts {
    public static String f(String format, Object... args) {
        return String.format(format, args);
    }

    public static <T> T nn(T obj) {
        return Objects.requireNonNull(obj);
    }

    public static <T> T nn(T obj, String message) {
        return Objects.requireNonNull(obj, message);
    }
}
