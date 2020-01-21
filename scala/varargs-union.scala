object O{
  def z[T,U](x: T)(y: U) = List[T | U](x, y)
  def u(x: Int*)(y: String*) = z(x : _*)( y:_*)
  def m[T](x: T*) = x
  def main(x: Array[String]): Unit = {
    m(u(1)("A")(1) : _*)
  }
}
