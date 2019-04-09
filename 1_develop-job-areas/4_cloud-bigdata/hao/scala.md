[TOC]
## Scala
``` 
学习Scala的目的是为了大数据开发
```

### 语言特性
- 1.面向对象
- 2.函数式编程 [重点]
``` 
函数也能当值来使用，支持高阶函数...
```
- 3.静态类型
- 4.扩展性
- 5.并发性
``` 
Scala使用Actor作为其并发模型，Actor是类似线程的实体，通过邮箱发收消息。
Actor可以复用线程，因此可以在程序中可以使用数百万个Actor,而线程只能创建数千个。
在2.10之后的版本中，使用Akka作为其默认Actor实现。
```

### 基础语法

#### Scala包
```
import java.awt.Color  // 引入Color
import java.awt._  // 引入包内所有成员
def handler(evt: event.ActionEvent) { // java.awt.event.ActionEvent
   ... // 因为引入了java.awt，所以可以省去前面的部分
}
import java.awt.{Color, Font}
// 重命名成员
import java.util.{HashMap => JavaHashMap}
// 隐藏成员
import java.util.{HashMap => _, _} // 引入了util包的所有成员，但是HashMap被隐藏了
```

#### 数据类型
![数据类型](https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg)
```
Byte
Short
Int
Long
Float
Double
Char 16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
String
Boolean
Unit 表示无值，和其他语言中void等同
Null null 或空引用
Nothing Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型
Any Any是所有其他类的超类
AnyRef AnyRef类是Scala里所有引用类(reference class)的基类

符号字面量 'x 是表达式 scala.Symbol("x")
字符字面量 在 Scala 字符变量使用单引号 'x' 来定义 
	'a' 
	'\u0041'
	'\n'
	'\t'
字符串字面量 	在 Scala 字符串变量使用双引号 "xx" 来定义
多行字符串的表示方法 """ ... """

```

#### 变量
```
变量是一种使用方便的占位符，用于引用计算机内存地址，变量创建后会占用一定的内存空间。
在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
	var myVar : String = "Foo"
	val myVal : String = "Foo" // 不可再赋值
	var VariableName : DataType [=  Initial Value]
	val VariableName : DataType [=  Initial Value]
	var myVar = 10 // myVar 会被推断为 Int 类型
	val myVal = "Hello, Scala!" // myVal 会被推断为 String 类型
	val xmax, ymax = 100  // xmax, ymax都声明为100
	val pa = (40,"Foo") // 如果方法返回值是元组，我们可以使用 val 来声明一个元组
```

#### 访问修饰符
```
private，protected，public。
默认public
Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。
```

#### 运算符
```
算术运算符
关系运算符
逻辑运算符
位运算符
赋值运算符
```

### 高级语法

#### 方法与函数 [重点]
```
Scala 有方法与函数，二者在语义上的区别很小。Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。

Scala 中的方法跟 Java 的类似，方法是组成类的一部分。

Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。

Scala 中使用 val 语句可以定义函数，def 语句定义方法。

class Test{
  def m(x: Int) = x + 3
  val f = (x: Int) => x + 3
}
```
- 方法声明
```
def functionName ([参数列表]) : [return type]
如果你不写等于号和方法主体，那么方法会被隐式声明为抽象(abstract)，包含它的类型于是也是一个抽象类型。
```
- 函数式特征
```
函数传名调用(Call-by-Name)
指定函数参数名
可变参数(args: String*) for( arg <- args ) {}
递归函数 for (i <- 1 to 10) {}
默认参数值  def addInt( a:Int=5, b:Int=7 ) : Int = {}
高阶函数（Higher-Order Function）就是操作其他函数的函数。
	Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
	// 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
    def apply(f: Int => String, v: Int) = f(v)
内嵌函数
	我们可以在 Scala 函数内定义函数，定义在函数内的函数称之为局部函数。
匿名函数
	Scala 中定义匿名函数的语法很简单，箭头左边是参数列表，右边是函数体。使用匿名函数后，我们的代码变得更简洁了。
	var inc = (x:Int) => x+1
	def add2 = new Function1[Int,Int]{  
		def apply(x:Int):Int = x+1;  
	}
	var mul = (x: Int, y: Int) => x*y 	
	var userDir = () => { System.getProperty("user.dir") }
偏应用函数
	def log(date: Date, message: String)  = {
    	println(date + "----" + message)
    }

	val date = new Date
    val logWithDateBound = log(date, _ : String)	
    logWithDateBound("message1" )
函数柯里化(Currying)
	柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数。
```

#### 闭包
```
var factor = 3  
val multiplier = (i:Int) => i * factor  
```

#### 数组(可变)
```
var z:Array[String] = new Array[String](3)
var z = new Array[String](3)
var z = Array("Runoob", "Baidu", "Google")

多维数组
矩阵与表格是我们常见的二维数组
var myMatrix = ofDim[Int](3,3)

合并数组 concat(myList1, myList2)

区间数组
	var myList1 = range(10, 20, 2)
    var myList2 = range(10,20)
```

#### Collection(集合)
```
Scala 集合分为可变的和不可变的集合。
```

- List(列表，不可变，链接表结构)
```
// 字符串列表
val site: List[String] = List("Runoob", "Google", "Baidu")
// 空列表
val empty: List[Nothing] = List()
构造列表的两个基本单位是 Nil 和 ::
Nil 也可以表示为一个空列表。
// 字符串列表
val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
// 空列表
val empty = Nil

列表基本操作 .head .tail

连接列表 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表

List.fill()
	val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println( "site : " + site  )

List.tabulate()
	// 通过给定的函数创建 5 个元素
	val squares = List.tabulate(6)(n => n * n)
	println( "一维 : " + squares  ) // 一维 : List(0, 1, 4, 9, 16, 25)

List.reverse 反转
```

- Set(集合)
```
默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包。

连接集合  ++ 运算符或 Set.++() 

查找集合中最大与最小元素  Set.min Set.max 

交集 Set.& 方法或 Set.intersect 
差集 Set.&~ 方法或 Set.diff
```

- Map(映射)
```
默认情况下 Scala 使用不可变 Map。如果你需要使用可变集合，你需要显式的引入 import scala.collection.mutable.Map 类

// Map 键值对演示
val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

Map 合并 ++ 运算符或 Map.++() 
```

- Tuple(元组)
```
// 创建两个不同类型元素的元组
val x = (10, "Runoob")

val t = (1, 3.14, "Fred")  
val t = new Tuple3(1, 3.14, "Fred")

迭代元组 Tuple.productIterator()
	val t = (4,3,2,1)
    t.productIterator.foreach{ i =>println("Value = " + i )}

元组转为字符串 Tuple.toString() 
	
元素交换 Tuple.swap 	
```

- Option(容器) 有可能包含值的容器，也可能不包含值。
```
Option 有两个子类别，Some 和 None
// 定义 Option
val x:Option[Int] = Some(5)

getOrElse()
```

#### Iterator(迭代器)
```
val it = Iterator("Baidu", "Google", "Runoob", "Taobao") 
while (it.hasNext){
	println(it.next())
}
查找最大与最小元素 it.min 和 it.max
获取迭代器的长度 it.size 或 it.length 
...
```

#### 类和对象
- 继承
```
class
extends 
override val
```

- 单例对象
```
object
在 Scala 中，是没有 static 这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字 object。
Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。
当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object。
你必须在同一个源文件里定义类和它的伴生对象。类被称为是这个单例对象的伴生类：companion class。
类和它的伴生对象可以互相访问其私有成员。
```

#### Trait(特征)[重点]
```
Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。

与接口不同的是，它还可以定义属性和方法的实现。

一般情况下Scala的类只能够继承单一父类，但是如果是 Trait(特征) 的话就可以继承多个，从结果来看就是实现了多重继承。

Trait(特征) 定义的方式与类类似，但它使用的关键字是 trait，如下所示：
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
isEqual 方法没有定义方法的实现，isNotEqual定义了方法的实现。
子类继承特征可以实现未被实现的方法。Scala Trait(特征)更像 Java 的抽象类。

特征构造顺序
```

#### 模式匹配[重点]
```
macth case 相当于java里的switch case
```
- 使用样例类 case classes
```
使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。
// 样例类
case class Person(name: String, age: Int)
```

#### 正则表达式
- [Scala正则表达式](http://www.runoob.com/scala/scala-regular-expressions.html)
```
Scala 通过 scala.util.matching 包中的 Regex 类来支持正则表达式。以下实例演示了使用正则表达式查找单词 Scala :
	val pattern = "Scala".r
    val str = "Scala is Scalable and cool"
    println(pattern findFirstIn str) // Some(Scala)
```

#### 异常处理
```
try {
	val f = new FileReader("input.txt")
} catch {
	case ex: FileNotFoundException => {
		println("Missing file exception")
	}
	case ex: IOException => {
		println("IO Exception")
	}
} finally {
	println("Exiting finally...")
}
```

#### 提取器(Extractor)[重点]
```
apply 构造
unapply 提取
使用match case提取对象信息时，unapply自动执行
```

#### 文件 I/O
```
import java.io._
import scala.io._
```

#### 混合类组成
```
abstract class A {
    val message: String
}
class B extends A {
    val message = "I'm an instance of class B"
}
trait C extends A {
    def loudMessage = message.toUpperCase()
}
class D extends B with C

val d = new D
println(d.message)  // I'm an instance of class B
println(d.loudMessage)  // I'M AN INSTANCE OF CLASS B
```