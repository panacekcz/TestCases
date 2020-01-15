trait A{
  def i: (((=>_) => Int) & (_ => Int))
  def j = i(1)
}
