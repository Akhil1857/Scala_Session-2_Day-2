trait Show[T] {
  def show(a: T): String
}

object ShowObject {
  val intShow: Show[Int] = new Show[Int] {
    override def show(a: Int): String = a.toString
  }

  val longShow: Show[Long] = new Show[Long] {
    override def show(a: Long): String = a.toString
  }

  val doubleShow: Show[Double] = new Show[Double] {
    override def show(a: Double): String = a.toString
  }

  case class Position(x: Int, y: Int) {
    val positionShow: Show[Position] = new Show[Position] {
      override def show(a: Position): String = s"Pos(x: ${a.x}, y: ${a.y})"
    }
  }
}