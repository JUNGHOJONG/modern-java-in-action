package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FilterSecondStepTest {

    @Test
    void filterGreenApple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterSecondStep filterSecondStep = new FilterSecondStep();


        // WHEN
        List<Apple> result = filterSecondStep.filterAppleBySelectedColor(apples, Color.GREEN); // 녹색 사과만 필터링

        // THEN
        assertThat(result.size(), is(3));
    }

    @Test
    void filterRedApple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterSecondStep filterSecondStep = new FilterSecondStep();


        // WHEN
        List<Apple> result = filterSecondStep.filterAppleBySelectedColor(apples, Color.RED); // 빨간 사과만 필터링

        // THEN
        assertThat(result.size(), is(1));
    }
}
