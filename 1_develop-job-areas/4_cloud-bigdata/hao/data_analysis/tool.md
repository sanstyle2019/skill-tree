### 数据分析工具
``` 
Python 数据分析领域最流行的语言
NumPy,Pandas 科学计算工具
Scikit-learn 机器学习工具
Keras,Tensorflow 深度学习工具
```

#### Python
``` 
版本: 
    2.7.x和3.x
IDE: 
    1.PyCharm 
    2.Sublime Text
    3.Vim
    4.Eclipse+PyDev
```
##### 基础语法
``` 
1.输入输出: 
    name = input("what's your name?")
    sum = 100+100
    print('hello, %s', %name)
    print('sum = %d', %sum)
2.判断语句: if...else...
    if score >= 90:
        ...
    else:
        ...
3.循环语句: for...in while
    sum = 0
    for number in range(11):
        sum += number
    print(sum)
3.数据类型: 列表、元祖、字典、集合
    列表 list [] 
    元祖 (tuple) 一旦初始化不可修改
    字典 {dictionary}
    集合 set()
4.注释: # '''...'''
5.引用模块/包: import
    import model_name1,model_name2
    from package_name import model_name
    from package_name import *
6.函数: def
    def addone(score):
        return score+1
    print(addone(999))
7.异常:
    while True:
        try:
            ...
        except:
            break                
...更高级的语法待更新...            
```

#### NumPy
``` 
所提供的数据结构比Python自身的“更高级、更高效”，是Python数据分析的基础。
用Python自身的list 存储[0,1,2] => 3个指针和3个整数对象，浪费内存和计算时间
list在系统内存中是分散存储的，而NumPy数组存储在一个均匀连续的内存块中。
另外在内存访问模式中，缓存会直接把字节码从RAM加载到CPU寄存器中。NumPy利用现代
CPU的矢量化指令计算，加载寄存器中的多个连续浮点数。另外NumPy中的矩阵计算可以采用
多线程的方式，充分利用多核CPU计算资源，大大提升了计算效率。
注意提升效率的技巧：避免采用隐式拷贝，而是采用就地操作的方式。
good: x*=2 bad: y=x*2 
```

#### Pandas

#### SciPy