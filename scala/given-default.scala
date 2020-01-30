trait A
trait B
object a extends A
object b extends B
class C
object O{
  given (given x:A = a)(given y:B = b) as C = new C
  def z = summon[C]
}
