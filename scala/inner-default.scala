class Z{
	trait T
	class C extends T
	def m(x: T = new C) = 1
}

object O{
	def main(args: Array[String]): Unit = {
		val a = new Z; a.m(); // OK
		({();new Z}).m(); // OK
		(new Z).m(); // Type mismatch
	}
}

// Expect to compile (does in scala 2)