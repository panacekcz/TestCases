class Z{
	class C
	def m(x: C = new C) = 1
}

object O{
	def main(args: Array[String]): Unit = {
		val a = new Z; a.m(); // OK
		({();new Z}).m(); // OK
		(new Z).m(); // Type mismatch
	}
}

// Expect to compile (does in scala 2)