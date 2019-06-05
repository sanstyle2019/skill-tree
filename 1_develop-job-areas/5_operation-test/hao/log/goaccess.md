### GoAccess
``` 
Nginx

> iftop
> nethogs
> nmap -v -A 127.0.0.1
```

#### Download
``` 
yum install goaccess

/etc/goaccess.conf
```

#### Get Started
- [Get Started](https://goaccess.io/get-started)
- [一篇不错的教程](https://blog.51cto.com/13444271/2167514)
- [设置中文界面](https://blog.51cto.com/linuxg/2335007)
```
/etc/goaccess.conf 三个注释掉的配置打开 
	time-format
	date-format
	log-format
goaccess -f /var/log/nginx/access.log -c -a > /usr/share/nginx/html/go.html
```