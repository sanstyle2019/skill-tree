[TOC]
## Go
``` 
学习Go的目的是为了满足好奇心
``` 

### 基础语法

#### 数据类型
``` 
1.布尔型 var b bool = true 默认 false
2.数字类型 
    int(8/16/32/64) unit(8/16/32/64) 
    float32 float64 
    complex64 complex128
3.字符串类型
4.派生类型
    指针类型 pointer
    数组类型
    结构化类型 struct
    Channel类型
    函数类型
    切片类型
    接口类型 interface
    Map类型
```

#### 声明变量
```
默认: int=0,bool=false,string="",*int=nil,[]int=nil,
    chan int=nil,func(string) int=nil,map[string] int=nil
var identifier type
example 1: 
    var age int
    age = 20
example 2:
    var age = 20
example 3:
    age := 20  //替代var，并且这种只能在函数内声明
```

- 多变量声明
```
var (
    name string
    age int
)
```

- 值类型和引用类型
``` 
int float bool string 基本数据类型 值类型 变量直接指向内存中的值
使用等号 = 将一根变量赋值给另一个变量 j = i，实际是在内存中将 i 的值进行了拷贝

通过 &i 获取内存地址
值类型的变量的值存储在栈中。

引用类型的变量存储的是值所在的内存地址，或内存地址中第一个字所在的位置，这个内存地址称为指针
此时赋值只是引用地址被赋值。

:= 这是变量赋值的首选类型，但是只能被用在函数体内，不可用于全局变量的声明与赋值。

局部变量声明了就必须使用，全局变量可以不。

交换两个变量的值 a, b = b, a，两个变量的类型必须是相同
```

#### 声明常量
