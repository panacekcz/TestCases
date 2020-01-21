object O{
  def m[T](x: T*) = 0
  def n(b: Boolean): Unit = {
    val li = List(1)
    val ls = List("A")
    m(( if(b) (li: _*) else (ls: _*) ): _*)
  }
}
