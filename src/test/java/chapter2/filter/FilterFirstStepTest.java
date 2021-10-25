package chapter2.filter;

import chapter2.entity.Apple;
import chapter2.entity.Color;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class FilterFirstStepTest {

    @Test
    void filterGreenApple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterFirstStep filterFirstStep = new FilterFirstStep();

        // WHEN
        List<Apple> result = filterFirstStep.filterAppleByColor(apples); // 녹색인 사과만 필터링

        // THEN
        assertThat(result.size(), is(3));
    }

    @Test
    void refactorFilterGreenApple() {
        // GIVEN
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 30),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.GREEN, 200));
        FilterFirstStep filterFirstStep = new FilterFirstStep();

        // WHEN
        List<Apple> result = filterFirstStep.refactorFilterAppleByColor(apples, new FilterByGreenApple()); // 녹색인 사과만 필터링

        // THEN
        assertThat(result.size(), is(3));
    }
}
