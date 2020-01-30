trait A
trait B

// Confusing syntax
def m1 with A with B = ???
def m2 with x:A with B = ???
def m3 with (x:A) with B = ???

