package ru.job4j.study;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest{

    @Test
    public void testRubleToEuro() {
    float in = 140;
    float out = Converter.rubleToEuro(in);
    float expected = 2;
    assertThat(out).isEqualTo(expected);
    }
}