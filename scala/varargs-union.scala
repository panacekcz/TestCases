object O{
  def m(x: Any*) = 0
  def n(a: List[Int] | List[String]) = m(a: _*)
}
