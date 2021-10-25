package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterFirstStep {

    // 개선 전
    public List<Apple> filterAppleByColor(List<Apple> appleList) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    // 개선 후
    public List<Apple> refactorFilterAppleByColor(List<Apple> appleList, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
