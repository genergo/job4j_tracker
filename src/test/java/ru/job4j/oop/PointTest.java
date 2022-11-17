package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void when00to02then2() {
        Point one = new Point(0, 0);
        Point two = new Point(0, 2);
        double expected = 2;
        assertThat(one.distance(two)).isEqualTo(expected);
    }

        @Test
    public void when000to022then2() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(0, 2, 2);
        double expected = 2;
        assertThat(one.distance(two)).isEqualTo(expected);
    }

}