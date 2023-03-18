trait Driving {
  def drive(): String
}

trait Flying {
  def fly(): String
}

trait Sailing {
  def sail(): String
}

class Car extends Driving {
  override def drive(): String = {
    "A car can be driven"
  }
}

class Boat extends Sailing {
  override def sail(): String = {
    "A Boat can be sailed."
  }
}

class Aeroplane() extends Flying {
  override def fly(): String = {
    "an Aeroplane can be flown"
  }
}

class FlyingCar() extends Driving with Flying {
  override def drive(): String = "Flying car can be drive"

  override def fly(): String = "Flying car can also be flown"
}

class Hovercraft() extends Sailing with Driving {
  override def sail(): String = "Hovercraft can be sailed"

  override def drive(): String = "Hovercraft can also be drive"
}
