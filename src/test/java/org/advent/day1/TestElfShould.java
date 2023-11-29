package org.advent.day1;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestElfShould {
    @Test
    void have_zero_total_calories_when_created() {
        Elf elf = new Elf();
        assertThat(elf.getTotalCalories(), equalTo(0));
    }

    @Test
    void have_1000_total_calories_after_adding_1000() {
        Elf elf = new Elf();
        elf.addCalories(1000);
        assertThat(elf.getTotalCalories(), equalTo(1000));
    }

    @Test
    void compare_return_positive_value_for_elf_with_more_total_calories() {
        Elf elf1 = new Elf();
        elf1.addCalories(1000);
        elf1.addCalories(2000);
        elf1.addCalories(3000);
        Elf elf2 = new Elf();
        elf2.addCalories(4000);
        assertThat(elf1.compareTo(elf2), equalTo(1));
    }

    @Test
    void compare_zero_for_equal_elf() {
        Elf elf1 = new Elf();
        elf1.addCalories(1000);
        elf1.addCalories(2000);
        elf1.addCalories(3000);
        Elf elf2 = new Elf();
        elf2.addCalories(6000);
        assertThat(elf1.compareTo(elf2), equalTo(0));
    }

    @Test
    void compare_return_negative_value_for_elf_with_less_total_calories() {
        Elf elf1 = new Elf();
        elf1.addCalories(1000);
        elf1.addCalories(2000);
        elf1.addCalories(3000);
        Elf elf2 = new Elf();
        elf2.addCalories(7000);
        assertThat(elf1.compareTo(elf2), equalTo(-1));
    }
}
