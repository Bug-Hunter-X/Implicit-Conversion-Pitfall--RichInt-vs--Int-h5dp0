```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

val obj = new MyClass(5)
obj.myMethod(10) // This works fine

// Correct way: Use an instance of MyClass to call the method.
val result = new MyClass(5).myMethod(10) 
println(result) //Output: 15
```