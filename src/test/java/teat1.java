import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

class MainTest {

    @ParameterizedTest
    @MethodSource("testBubbleSortData")
    void testBubbleSort(int N) {
        Random random = new Random(7777);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(100);
        }

        long start = System.nanoTime();
        Main.bubbleSort(arr);
        long elapsed = System.nanoTime() - start;
        System.out.printf("N=%d, время=%,d нс%n", N, elapsed);

        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] <= arr[i + 1],
                    "Массив не отсортирован на индексе " + i);
        }
    }

    static Stream<Arguments> testBubbleSortData() {
        return Stream.of(
                Arguments.of(10),
                Arguments.of(100),
                Arguments.of(1_000),
                Arguments.of(2_000),
                Arguments.of(4_000),
                Arguments.of(8_000)
        );
    }
}