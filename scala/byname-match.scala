object O{
  def f(i: => Int): Int = 1
  val z = f
  type Arg[F] = F match {
    case Function1[a,b]=>a
  };
  val x: Arg[z.type] = 2
}


