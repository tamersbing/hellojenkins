package main

import "fmt"

func main() {
	fmt.Printf("hello, world from mathology\n")
	fmt.Println("such fun!")
	sum := 0
	for i := 0; i < 10; i++ {
		sum += i
		fmt.Print("This is the value of i in the loop ")
		fmt.Println(i)
	}
	fmt.Print("This is sum at the end of the loop ")
	fmt.Println(sum)

}
