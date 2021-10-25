package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class FilterThirdStepTest {

    @Test
    void filterGreenAndMoreThan150Apple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterThirdStep filterThirdStep = new FilterThirdStep();

        int weight = 150;
        Color color = Color.GREEN;

        // WHEN
        List<Apple> result = filterThirdStep.filterAppleBySelectedColorAndWeight(apples, color, weight);

        // THEN
        assertThat(result.size(), is(1));
    }

    @Test
    void filterRedAndMoreThan150Apple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterThirdStep filterThirdStep = new FilterThirdStep();

        int weight = 150;
        Color color = Color.RED;

        // WHEN
        List<Apple> result = filterThirdStep.filterAppleBySelectedColorAndWeight(apples, color, weight);

        // THEN
        assertThat(result.size(), is(0));
    }

    @Test
    void refactorFilterRedAndMoreThan150Apple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterThirdStep filterThirdStep = new FilterThirdStep();

        // WHEN
        List<Apple> result = filterThirdStep.refactorFilterAppleBySelectedColorAndWeight(apples, new FilterByColorAndWeightApple());

        // THEN
        assertThat(result.size(), is(2));
    }
}
