package main

import "fmt"

// package 必须是 main
// go run HelloGo.go
func main() {
	fmt.Printf("hello, Go\n")
	fmt.Println("Hello, Go")

	// 声明变量
	var age int
	fmt.Println(age)

	var b bool
	fmt.Println(b)

	var intVal int
	//intVal := 1
	intVal,intVal1 := 1,2
	fmt.Println(intVal)
	fmt.Println(intVal1)

	var (
		name string
		age2 int
	)
	fmt.Println(name +", "+ string(age2))

	fmt.Println(intVal4,intVal5)
	fmt.Println(&intVal4)
	fmt.Println(&intVal5)
}


//intVal2,intVal3 := 1,2
var intVal4,intVal5 int = 1,2