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
    localStorage.sitename="测试测试";
    document.getElementById("tips").innerHTML = "网站名：" + localStorage.sitename;
} else {
    // 抱歉! 不支持 web 存储。
}

保存数据：localStorage.setItem(key,value);
读取数据：localStorage.getItem(key);
删除单个数据：localStorage.removeItem(key);
删除所有数据：localStorage.clear();
得到某个索引的key：localStorage.key(index);

作用域
localStorage只要在相同的协议、相同的主机名、相同的端口下，就能读取/修改到同一份localStorage数据。
sessionStorage比localStorage更严苛一点，除了协议、主机名、端口外，还要求在同一窗口（也就是浏览器的标签页）下。

<!-- Web SQL websql.d.ts typescript -->
openDatabase：这个方法使用现有的数据库或者新建的数据库创建一个数据库对象。
transaction：这个方法让我们能够控制一个事务，以及基于这种情况执行提交或者回滚。
executeSql：这个方法用于执行实际的 SQL 查询。
// 数据库名称 版本号 描述文本 数据库大小 创建回调
var db = openDatabase('mydb', '1.0', 'Test DB', 2 * 1024 * 1024);

<!-- Application Cache -->
1.离线浏览 - 用户可在应用离线时使用它们
2.速度 - 已缓存资源加载得更快
3.减少服务器负载 - 浏览器将只从服务器下载更新过或更改过的资源。
<!DOCTYPE HTML>
<html manifest="demo.appcache">
...
</html>
???

<!-- Web Worker -->
<!-- 服务器发送事件(Server-Sent Events) -->

<!-- WebSocket lib.dom.d.ts typescript -->
WebSocket 是 HTML5 开始提供的一种在单个 TCP 连接上进行全双工通讯的协议。
在 WebSocket API 中，浏览器和服务器只需要完成一次握手，两者之间就直接可以创建持久性的连接，并进行双向数据传输。
HTML5 定义的 WebSocket 协议，能更好的节省服务器资源和带宽，并且能够更实时地进行通讯。
var Socket = new WebSocket(url, [protocol] );
WebSocket 属性
    Socket.readyState
        0 - 表示连接尚未建立。
        1 - 表示连接已建立，可以进行通信。
        2 - 表示连接正在进行关闭。
        3 - 表示连接已经关闭或者连接不能打开。
WebSocket 事件
    open	Socket.onopen	连接建立时触发
    message	Socket.onmessage	客户端接收服务端数据时触发
    error	Socket.onerror	通信发生错误时触发
    close	Socket.onclose	连接关闭时触发
WebSocket 方法
    Socket.send()	使用连接发送数据
    Socket.close()	关闭连接    
```

### HTML手册
- 属性
``` 
class <element class="classname"> 
data-* <element data-*="somevalue">
hidden <element hidden>
id <element id="id">
style <element style="style_definitions">
title <element title="text">
```
- 事件
``` 
窗口事件（Window Event）：
onbeforeonload New	script	在文档加载之前运行脚本
onload	script	当文档加载时运行脚本
onunloadNew	script	当用户离开文档时运行脚本
onfocus	script	当窗口获得焦点时运行脚本
onblur	script	当窗口失去焦点时运行脚本
onresize New	script	当调整窗口大小时运行脚本
onerror New	script	当错误发生时运行脚本

表单事件（Form Events）：
onfocus	script	当元素获得焦点时运行脚本
onblur	script	当元素失去焦点时运行脚本
oninput New	script	当元素获得用户输入时运行脚本
onselect	script	当选取元素时运行脚本
onchange	script	当元素改变时运行脚本
onsubmit	script	当提交表单时运行脚本

键盘事件（Keyboard Events）：
onkeydown	script	当按下按键时运行脚本
onkeyup	script	当松开按键时运行脚本
onkeypress	script	当按下并松开按键时运行脚本

鼠标事件（Mouse Events）：
onclick	script	当单击鼠标时运行脚本
ondblclick	script	当双击鼠标时运行脚本
onmousedown	script	当按下鼠标按钮时运行脚本
onmouseup	script	当松开鼠标按钮时运行脚本
onmousemove	script	当鼠标指针移动时运行脚本
onmouseover	script	当鼠标指针移至元素之上时运行脚本
onmouseout	script	当鼠标指针移出元素时运行脚本
onmousewhee lNew	script	当转动鼠标滚轮时运行脚本
onscroll New	script	当滚动元素的滚动条时运行脚本

多媒体事件（Media Events）：
onabort	script	当发生中止事件时运行脚本
onerror New	script	当在元素加载期间发生错误时运行脚本
onplay New	script	当媒介数据将要开始播放时运行脚本
onplaying New	script	当媒介数据已开始播放时运行脚本
onpause New	script	当媒介数据暂停时运行脚本
onratechange New	script	当媒介数据的播放速率改变时运行脚本
```
- 画布
- 音视频
``` 
音频/视频 方法：
load()	重新加载音频/视频元素。
play()	开始播放音频/视频。
pause()	暂停当前播放的音频/视频。
音频/视频 属性：
autoplay	设置或返回是否在加载完成后随即播放音频/视频。
controls	设置或返回音频/视频是否显示控件（比如播放/暂停等）。
ended	返回音频/视频的播放是否已结束。
loop	设置或返回音频/视频是否应在结束时重新播放。
muted	设置或返回音频/视频是否静音。
paused	设置或返回音频/视频是否暂停。
playbackRate	设置或返回音频/视频播放的速度。
readyState	返回音频/视频当前的就绪状态。
src	设置或返回音频/视频元素的当前来源。
volume	设置或返回音频/视频的音量。
音频/视频 事件：
pause	当音频/视频已暂停时触发。
play	当音频/视频已开始或不再暂停时触发。
ended	当目前的播放列表已结束时触发。
volumechange	当音量已更改时触发。
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

### JavaScript
#### 全局对象
``` 
Storage
localStorage
document
navigator
window
parent
```
#### HTTP状态码
``` 
1xx:信息
2xx:成功
    200 OK
3xx:重定向
    304 Not Modified
4xx:客户端错误
    401 Unauthorized 未授权的
    403 Forbidden 被禁止
```