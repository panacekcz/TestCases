object O{
  def f(i: => String): String = i
  def g(i: String): String = i
  def m(c: Boolean) = if (c) f else g
  def main(args: Array[String]): Unit = m(false)("X")
}