import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import Problem_02._
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 *
 */

@RunWith(classOf[JUnitRunner])
class Problem_02_Test  extends FunSuite with ShouldMatchers {

  test("should sum all even Fibonacci numbers less than 10") {
    sumFibBelow(10) should equal(10)
  }

  test("should sum all even Fibonacci numbers less than 100") {
    sumFibBelow(100) should equal(44)
  }

  test("should sum all even Fibonacci numbers less than 4,000,000") {
    sumFibBelow(4000000) should equal(4613732)
  }

  test("should sum even numbers in list below 100") {
    sumFibBelow(80, List(10,40,55,80,99,110)) should equal(130)
  }

  test("should calculate first 10 Fibonacci numbers") {
    fibs.take(10).toList should equal(List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34))
  }
}
