package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class L_GenerateInfinitePrimeNumberStream {

  @Test
//  @Disabled
  void intStreamOfPrimeNumber() {
    final var mySolution = NumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    final var yourSolution = IntStream.range(0, 12).filter(x-> x==2 || x==3 || (x>1 && x%2!=0 && x%3!=0)).boxed().collect(Collectors.toList());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
