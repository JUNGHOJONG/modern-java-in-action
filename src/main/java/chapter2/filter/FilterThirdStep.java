package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterThirdStep {

    public List<Apple> filterAppleBySelectedColorAndWeight(List<Apple> appleList, Color color, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (color.equals(apple.getColor()) && apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> refactorFilterAppleBySelectedColorAndWeight(List<Apple> appleList, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
