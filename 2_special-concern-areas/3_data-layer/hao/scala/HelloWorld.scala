import scala.util.matching.Regex
import scala.io._

object HelloWorld {
    def main(args: Array[String]): Unit = {
        // HelloWorld
        println("Hello, World")
        // 变量
        var myVar: String = "Foo"
        myVar = "Too"
        println(myVar)
        // 常量
        val myVal: String = "Foo"
        // myVal = "Too" error: reassignment to val
        println(myVal)

        val set = Set(1, 2, 3)
        println(set.getClass.getName) //

        println(set.exists(_ % 2 == 0)) //true
        println(set.drop(1)) //Set(2,3)
        println(set)

        import scala.collection.mutable.Set // 可以在任何地方引入 可变集合

        val mutableSet = Set(1, 2, 3)
        println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet

        mutableSet.add(4)
        mutableSet.remove(1)
        mutableSet += 5
        mutableSet -= 2

        println(mutableSet) // Set(5, 3, 4)

        val another = mutableSet.toSet
        println(another.getClass.getName) // scala.collection.immutable.Set

        val num1 = Set(5, 6, 9, 20, 30, 45)
        val num2 = Set(50, 60, 9, 20, 35, 55)
        // 交集
        println("num1.&(num2) : " + num1.&(num2))
        println("num1.intersect(num2) : " + num1.intersect(num2))

        val t = new Tuple2("www.google.com", "www.runoob.com")
        println("交换后的元组: " + t.swap)

        // 正则表达式
        var pattern = "Scala".r
        val str = "Scala is scalable and cool"
        println(pattern findFirstIn (str))
        pattern = new Regex("(S|s)cala")
        println((pattern findAllIn (str)).mkString(","))
        println(pattern replaceFirstIn(str, "Java"))

        val x = HelloWorld(5)
        println(x)
        x match {
            case HelloWorld(num) => println(x + " 是 " + num + " 的两倍！")
            // unapply 被调用
            case _ => println("无法计算")
        }

        print("请输入任意信息：")
        var line = Console.readLine()
        println("您输入的是：" + line)

        println("文件内容为：")
        Source.fromFile("test.txt", enc = "UTF-8").foreach {
            print
        }
    }

    // 构造
    def apply(x: Int) = x * 2

    // 提取
    def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None
}