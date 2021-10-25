package chapter2.filter;

import chapter2.entity.Apple;

public interface ApplePredicate {

    boolean test(Apple apple);
}
