```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

val obj = new MyClass(5)
obj.myMethod(10) // This works fine

// Error: value myMethod is not a member of Int
5.myMethod(10)
```