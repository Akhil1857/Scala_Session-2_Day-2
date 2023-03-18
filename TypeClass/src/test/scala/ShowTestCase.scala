import org.scalatest.funsuite.AnyFunSuite
import ShowObject.Position


class ShowTestCase extends AnyFunSuite {
  test("Test for Integer(Int): It will convert Int into String") {
    val expectedOutput = ShowObject.intShow.show(42)
    assert(expectedOutput == "42")
  }

  test("Test for Long: It will convert Long into String") {
    val expectedOutput = ShowObject.longShow.show(1054914759)
    assert(expectedOutput == "1054914759")
  }

  test("Test for Double: It will convert Double into String") {
    val expectedOutput = ShowObject.doubleShow.show(25.24975)
    assert(expectedOutput == "25.24975")
  }

  test("Test for the Case Class Position: It will convert Position into String ") {
    val userInput = Position(2, 6)
    val expectedOutput = ShowObject.Position(2, 6).positionShow.show(userInput)
    assert(expectedOutput == "Pos(x: 2, y: 6)")
  }
  
}
