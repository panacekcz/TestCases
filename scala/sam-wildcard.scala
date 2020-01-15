abstract class Q[-A]{def apply(a:A):Int}

object O{
 def m(i: Int):Int = i
 m : Q[_]
}
