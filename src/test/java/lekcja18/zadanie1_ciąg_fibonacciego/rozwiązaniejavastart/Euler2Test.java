package lekcja18.zadanie1_ciąg_fibonacciego.rozwiązaniejavastart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {


    private Euler2 euler2 = new Euler2();

    @Test
    void shouldReturn2For2() {
        // when
        int result = euler2.calculateSum(2);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldReturn0For1() {
        // when
        int result = euler2.calculateSum(1);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturn2For3() {
        // when
        int result = euler2.calculateSum(3);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldReturn10For8() {
        // when
        int result = euler2.calculateSum(8);

        // then
        assertEquals(10, result);
    }

    @Test
    void shouldReturn10For33() {
        // when
        int result = euler2.calculateSum(33);

        // then
        assertEquals(10, result);
    }

    @Test
    void shouldReturn44For34() {
        // when
        int result = euler2.calculateSum(34);

        // then
        assertEquals(44, result);
    }

    @Test
    void shouldReturn44For35() {
        // when
        int result = euler2.calculateSum(35);

        // then
        assertEquals(44, result);
    }

}