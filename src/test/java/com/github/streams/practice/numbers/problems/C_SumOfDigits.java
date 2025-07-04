package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Calculates the sum of digits of a given integer.
 *
 * <p>This method takes an integer as input, breaks it down into individual digits, and returns
 * their sum.
 *
 * <p>Example: <br>
 * Input = 123<br>
 * Output = 6 <br>
 * Explanation: (1 + 2 + 3)
 */
class C_SumOfDigits {

  @Test
//  @Disabled
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.sumOfDigits(input);
    var yourSolution = String.valueOf(input).chars().map(Character::getNumericValue).sum();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
