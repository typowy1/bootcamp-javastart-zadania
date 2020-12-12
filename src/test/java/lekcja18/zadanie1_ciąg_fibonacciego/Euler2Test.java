package lekcja18.zadanie1_ciąg_fibonacciego;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.Test;

class Euler2Test {

    private Euler2 euler2 = new Euler2();

    @Test
    void shouldReturn4613732For4000000Limit() {

        //given
        int limitNumber = 4000000;

        //when
        int sumOfEvenNumbersFromFibonacciSequence = euler2.getEvenNumbersFromFibonacciSequence(limitNumber);

        //then
        assertThat(sumOfEvenNumbersFromFibonacciSequence).isEqualTo(4613732);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForNumberGreaterThan4000000Limit() {

        //given
        int maxLimitNumber = 40000001;

        //when
        final Throwable result = catchThrowable(() -> euler2.getEvenNumbersFromFibonacciSequence(maxLimitNumber));

        //then
        assertThat(result).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForNumberSmallerThan0Limit() {

        //given
        int negativeNumber = -1;

        //when
        final Throwable result = catchThrowable(() -> euler2.getEvenNumbersFromFibonacciSequence(negativeNumber));

        //then
        assertThat(result).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldReturn10For8Limit() {

        //given
        int limitNumber = 8;

        //when
        int sumOfEvenNumbersFromFibonacciSequence = euler2.getEvenNumbersFromFibonacciSequence(limitNumber);

        //then
        assertThat(sumOfEvenNumbersFromFibonacciSequence).isEqualTo(10);
    }

}