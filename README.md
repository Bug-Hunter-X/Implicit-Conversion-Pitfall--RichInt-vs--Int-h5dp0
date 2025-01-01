This repository demonstrates a common Scala error involving implicit conversions.  The `bug.scala` file shows code that fails to compile because it incorrectly assumes methods from the `RichInt` class are directly available on `Int` literals. The solution in `bugSolution.scala` shows the proper approach.