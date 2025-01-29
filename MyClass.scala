```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) 
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  val obj2 = new MyClass(5)
  val obj3 = obj1.add(obj2)
  println(obj3.value) // Output: 15
  
  // This won't compile because of type mismatch, the `add` method requires a `MyClass` object
  //println(obj1.add(20)) // error: type mismatch
}
```