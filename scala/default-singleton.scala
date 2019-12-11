object O{
  def main(args: Array[String]):Unit = {
    val v:Int = 1
    class C{
      def m(x: v.type = v) = x
    }
    val u = new C
    u.m()  // Type Mismatch; expected OK
  }
}