package main

import "fmt"

func isOdd(i int) bool {
    return i % 2 == 1
}

func main() {
	fmt.Println(isOdd(2))
	fmt.Println(isOdd(1))
	fmt.Println(isOdd(0))
	fmt.Println(isOdd(-1))
	fmt.Println(isOdd(-2))
}
