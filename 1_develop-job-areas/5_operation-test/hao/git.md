### Git炫技

- [一行查看log](https://git-scm.com/book/zh/v1/Git-%E5%9F%BA%E7%A1%80-%E6%9F%A5%E7%9C%8B%E6%8F%90%E4%BA%A4%E5%8E%86%E5%8F%B2)
``` 
git log --pretty=format:"%h - %an, %ar : %s"
git log --pretty=format:"%h - %an, %ar : %s" > git-log.log
```