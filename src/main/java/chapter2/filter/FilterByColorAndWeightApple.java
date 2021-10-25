package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;

public class FilterByColorAndWeightApple implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor()) && apple.getWeight() > 100;
    }
}
