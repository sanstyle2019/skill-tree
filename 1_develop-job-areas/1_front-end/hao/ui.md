### UI组件

#### Mobile


#### PC


### HTML
``` 
<!DOCTYPE html> 
<html>
<head>
    <meta charset="utf-8">
    <title>文档标题</title> 
    
    <meta name="description" content="xxx">
    <meta name="keywords" content="HTML,CSS,JavaScript">
    <meta name="author" content="xxx">
    <meta http-equiv="refresh" content="30">
    
    <base href="baseUrl">
    
    <link rel="shortcut icon" href="图片url">
    <link rel="stylesheet" type="text/css" href="mystyle.css">

    <style type="text/css">
        body {background-color:yellow}
        p {color:blue}
    </style>
    
    <script type="text/javascript">
        document.write("Hello World!")
    </script>
</head>
<body>

<h1></h1> - <h6></h6> => <font size="6 - 1"></font>
<p></p> 段落
<br> 换行
<b> 与 <i> 定义粗体或斜体文本
<a id="tips" herf="xxx#tips" target="_blank">点击跳转</a>
<img src="" alt="无图片时提示文字" width="" height="" />
属性: class, id, style, title, name, href, src...
<hr> 水平线
<!-- 注释 -->

<!-- 表格 -->
<table border="1">
    <caption>Monthly savings</caption>
    <thead>
    <tr>
        <th rowspan="2"></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td></td>
    </tr>
    </tbody>
</table>

<!-- 列表 -->
<ul style="list-style-type:disc">
    <li></li>
</ul>
<ol type="A">
    <li></li>
</ol>

<!-- 区块 -->
区块元素: <div> <h1> <p> <ul> <table>
内联元素: <span> <b> <td> <a> <img>

<!-- 布局 -->
<div#container>
<div#header></div>
<div#menu style="float: left;"></div>
<div#content style="float: left;"></div>
<div#footer></div>
</div>

还可以使用<table>来做布局

<!-- 表单 -->
<form action="" method="">
    <label">Username: </label>
    <input type="text" name="" /><br>
    <label">Password: </label>
    <input type="password" name="" />
    文本域 textarea
    <textarea rows="10" cols="30">
        我是一个文本框。
    </textarea>
    下拉列表 select
    <select name="cars">
        <option value="volvo">Volvo</option>
        <option value="audi" selected>Audi</option>
    </select>
    单选框 radio
    <input type="radio" name="sex" value="male">Male<br>
    <input type="radio" name="sex" value="female" checked>Female
    复选框 checkbox
    <input type="checkbox" name="vehicle" value="Bike">I have a bike<br>
    <input type="checkbox" name="vehicle" value="Car" checked>I have a car 
    提交按钮 & 重置按钮 & 普通按钮
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
    <input type="button" value="Hello world">
</form>

<!-- iframe -->
<iframe src="demo_iframe.html" width="200" height="200" frameborder="0"></iframe>

<iframe src="demo_iframe.html" name="iframe_a"></iframe>
<p><a href="//www.runoob.com" target="iframe_a">RUNOOB.COM</a></p>

<!-- 颜色 -->
RGB Red Green Blue 
rgba(255,0,0,0.5);

<!-- 脚本 -->
<script type="text/javascript">
    document.write("Hello World!");
    document.getElementById("demo").style.color="#ff0000";
</script>
<noscript>抱歉，你的浏览器不支持 JavaScript!</noscript>

<!-- 字符实体 -->
< => &lt;
> => &gt;
空格 => &nbsp;
https://www.runoob.com/html/html-entities.html

<!-- 快速查询 -->
https://www.runoob.com/html/html-quicklist.html

<!-- XHTML规范 -->
错误：
<input checked>
<input readonly>
<input disabled>
<option selected>
正确：
<input checked="checked">
<input readonly="readonly">
<input disabled="disabled">
<option selected="selected">

</body>
</html>
```

### HTML5
```
用于绘画的 canvas 元素
用于媒介回放的 video 和 audio 元素
新的特殊内容元素，比如 article、footer、header、nav、section
新的表单控件，比如 calendar、date、time、email、url、search

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>文档标题</title>
</head>
 
<body>
文档内容......
</body>
</html>

<!-- video -->
<video width="320" height="240" controls>
    <source src="https://www.runoob.com/try/demo_source/movie.mp4" type="video/mp4">
    <source src="https://www.runoob.com/try/demo_source/movie.ogg" type="video/ogg">
    你的浏览器不支持 video 标签。
</video>

header, section, footer, aside, nav, main, article, figure {
    display: block; 
}

<!--[if lt IE 9]>
  <script src="http://cdn.static.runoob.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
<![endif]-->

<!-- canvas -->
<canvas> 标签只是图形容器，您必须使用脚本来绘制图形。
<canvas id="myCanvas" width="200" height="100"></canvas>
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
    ctx.fillStyle = "#FF0000";
    ctx.fillRect(0, 0, 150, 75); // fillRect(x,y,width,height)
     
    ctx.moveTo(0,0); // 定义线条开始坐标
    ctx.lineTo(200,100); // 定义线条结束坐标
    ctx.stroke(); // 连线
    
    ctx.beginPath();
    ctx.arc(95,50,40,0,2*Math.PI); // arc(x,y,r,start,stop)
    ctx.stroke(); // 连线
    
    ctx.font="30px Arial"; // font - 定义字体
    ctx.fillText("Hello World",10,50); // fillText(text,x,y) - 在 canvas 上绘制实心的文本
    ctx.strokeText("Hello World",10,50); // strokeText(text,x,y) - 在 canvas 上绘制空心的文本

let c2 = document.getElementById("myCanvas2");
let ctx2 = c2.getContext("2d");
    // 创建渐变
    let grd = ctx2.createLinearGradient(0,0,200,0); // createLinearGradient(x,y,x1,y1) - 创建线条渐变
    let grd = ctx2.createRadialGradient(75,50,5,90,60,100); // createRadialGradient(x,y,r,x1,y1,r1) - 创建一个径向/圆渐变
    grd.addColorStop(0,"red");
    grd.addColorStop(1,"white");
    // 填充渐变
    ctx2.fillStyle = grd;
    ctx2.fillRect(10,10,150,80);
    
    // 画图
    drawImage(image,x,y)

<!-- 内联svg -->
SVG 指可伸缩矢量图形 (Scalable Vector Graphics)
SVG 图像在放大或改变尺寸的情况下其图形质量不会有损失
<svg xmlns="http://www.w3.org/2000/svg" version="1.1" height="190">
  <polygon points="100,10 40,180 190,60 10,60 160,180"
  style="fill:lime;stroke:purple;stroke-width:5;fill-rule:evenodd;">
</svg>
SVG 是一种使用 XML 描述 2D 图形的语言。
Canvas 通过 JavaScript 来绘制 2D 图形。    

<!-- 拖放 -->
<!-- 地理定位 -->
        
<!-- 多媒体元素 -->
<audio>
<video>
<source>
<embed>
<track>
controls属性供添加播放、暂停和音量控件。

<!-- 新input类型 -->
color
date datetime datetime-local time
email tel url image(src) file 
month week
number range
search

数量 ( 1 到 5 之间 ): <input type="number" name="quantity" min="1" max="5">
max min maxlength pattern readonly disabled required size step value
<input type="range" name="points" min="1" max="10">
max min step value

<!-- 新的语义元素 -->
<header>
<nav> <a></a> <a></a> </nav>
<section>
<article>
<aside>
<footer>

<!-- Web存储 -->
HTML5 web 存储,一个比cookie更好的本地存储方式。
localStorage - 用于长久保存整个网站的数据，保存的数据没有过期时间，直到手动去除。
sessionStorage - 用于临时保存同一窗口(或标签页)的数据，在关闭窗口或标签页之后将会删除这些数据。
if(typeof(Storage)!=="undefined")
{
    // 是的! 支持 localStorage  sessionStorage 对象!
    // 一些代码.....
} else {
    // 抱歉! 不支持 web 存储。
}

```

### CSS
- 重点难点
``` 
!important;
float
background:rgba(255,0,0,0.5);
display: block 块样式
    header, section, footer, aside, nav, article, figure {display: block;}
```
