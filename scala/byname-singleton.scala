object O{
  val x = "a"
  def f(i: => x.type): i.type = x
  def main(args: Array[String]): Unit = {
    f(x)
  }
}

