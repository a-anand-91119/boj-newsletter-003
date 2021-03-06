package com.boundsofjava.newsletter.introducingcombinators;

import java.util.function.BiConsumer;
import java.util.function.Function;

// @formatter:off
@FunctionalInterface
public interface After<T, R>
        extends Function<Function<T, R>,
                Function<BiConsumer<T, R>,
                Function<T, R>>> {
// @formatter:on

    static <T, R> After<T, R> create() {
        return function -> after -> argument -> {
            R result = function.apply(argument);
            after.accept(argument, result);
            return result;
        };
    }

    static <T, R> Function<T, R> decorate(
            Function<T, R> function,
            BiConsumer<T, R> after) {
        return After.<T, R>create().apply(function).apply(after);
    }
}
