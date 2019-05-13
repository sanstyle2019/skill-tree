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
##### 1.ndarry对象
``` 
多维数组 维数称为秩(rank) 每一个线性的数组称为一个轴(axes)
秩就是描述轴的数量
import numpy as np
a = np.array([1,2,3])
b = np.array([[1,2,3],[4,5,6],[7,8,9]])
a.shape   (3,)
a.dtype   dtype('int32')

persontype = np.dtype({
    'names':['name', 'age', 'chinese', 'math', 'english'],
    'formats':['S32','i', 'i', 'i', 'f']})
peoples = np.array([("ZhangFei",32,75,100, 90),("GuanYu",24,85,96,88.5),
       ("ZhaoYun",28,85,92,96.5),("HuangZhong",29,65,85,100)],
    dtype=persontype)
ages = peoples[:]['age']
print np.mean(ages)
```

##### 2.ufunc
``` 
NumPy 中很多 ufunc 函数计算速度非常快，因为都是采用C语言实现的。
连续数组的创建：
x1 = np.arange(1,11,2) array([1, 3, 5, 7, 9]) 初始值、终值(不包括)、步长
x2 = np.linspace(1,9,5) linear space 线性等分向量 array([1., 3., 5., 7., 9.]) 初始值 终值(包括)、元素个数

运算函数
print np.add(x1, x2)
print np.subtract(x1, x2)
print np.multiply(x1, x2)
print np.divide(x1, x2)
print np.power(x1, x2)
print np.remainder(x1, x2)
print np.mod(x1,x2)

统计函数
最大值、最小值、平均值、正态分布、方差、标准差
a = np.array([[1,2,3], [4,5,6], [7,8,9]])
print np.amin(a) 扁平最小
print np.amin(a,0) x轴最小 axis=0 轴
print np.amin(a,1) y轴最小 axis=1 轴
print np.amax(a) 扁平最大 
print np.amax(a,0) x轴最大
print np.amax(a,1) y轴最大
最大值与最小值之差
```

#### Pandas

#### SciPy