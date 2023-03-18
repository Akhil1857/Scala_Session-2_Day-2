import org.scalatest.funsuite.AnyFunSuite

class VehicleFunctionalityTestCase extends AnyFunSuite {

  test("A car can be driven") {
    val expectedValue = "A car can be driven"
    val objCar = new Car
    val actualValue = objCar.drive()
    assert(actualValue == expectedValue)
  }

  test("A Boat can be sailed.") {
    val expectedValue = "A Boat can be sailed."
    val objBoat = new Boat
    val actualValue = objBoat.sail()
    assert(actualValue == expectedValue)
  }

  test("an Aeroplane can be flown") {
    val expectedValue = "an Aeroplane can be flown"
    val objAeroplane = new Aeroplane
    val actualValue = objAeroplane.fly()
    assert(actualValue == expectedValue)
  }

  test("FlyingCar can be drive and flown") {
    val expectedValueForDrive = "Flying car can be drive"
    val expectedValueForFlying = "Flying car can also be flown"
    val objFlyingCar = new FlyingCar
    val actualValueForDrive = objFlyingCar.drive()
    val actualValueForFlying = objFlyingCar.fly()
    assert(actualValueForDrive == expectedValueForDrive)
    assert(actualValueForFlying == expectedValueForFlying)
  }

  test("Hovercraft can be sailed and flown") {
    val expectedValueForSailed = "Hovercraft can be sailed"
    val expectedValueForDrive = "Hovercraft can also be drive"
    val objHovercraft = new Hovercraft
    val actualValueForSailed = objHovercraft.sail()
    val actualValueForDrive = objHovercraft.drive()
    assert(actualValueForSailed == expectedValueForSailed)
    assert(actualValueForDrive == expectedValueForDrive)
  }
}