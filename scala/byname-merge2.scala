trait A;
trait B;
object O{
   def m(a: (=>A) => Int, b: B => Int, c: Boolean) = if(c) a else b
}
// In TypeComparer.andTypeGen, distributeAnd handles the case when both types are ExprType
