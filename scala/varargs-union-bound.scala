object O{
  type A <: |
  def m(x: Any*) = 0
  def n(a: A[List[Int], List[String]]) = m(a: _*)
}
