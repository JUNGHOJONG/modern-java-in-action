package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterSecondStep {

    public List<Apple> filterAppleBySelectedColor(List<Apple> appleList, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
