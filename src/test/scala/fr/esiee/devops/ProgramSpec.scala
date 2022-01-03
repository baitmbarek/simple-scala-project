package fr.esiee.devops

import fr.esiee.devops.program.Program
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ProgramSpec extends AnyFlatSpec with Matchers {

  //TODO: Fixme
  "Fibonacci" should "return the expected results" in {
    Map(
      0 -> 0,
      1 -> 1,
      2 -> 1,
      3 -> 2,
      7 -> 13
    ).foreach{case (i, expected) =>
      Program.fibonacci1(i) shouldBe expected
    }
  }

  //TODO: Implement tests
  "lpadZeros" should "return the expected results" in {
    Map(
      Array(7,3) -> "007",
      Array(18,2) -> "18",
      Array(121,2) -> "21",
      Array(-1,5) -> "-00001"
    ).foreach{case (i,expected) =>
      Program.lpadZeros(i(0),i(1)) shouldBe expected
    }
  }

  //TODO: Implement tests
  "isPrimeNumber" should "return the expected results" in {
    Map(
      0 -> false,
      1 -> false,
      2 -> true,
      13 -> true,
      14 -> false
    ).foreach{case (i, expected) =>
      Program.isPrimeNumber(i) shouldBe expected
    }
  }

}
