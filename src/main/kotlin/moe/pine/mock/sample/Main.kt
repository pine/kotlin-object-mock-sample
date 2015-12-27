@file:JvmName("Main")
package moe.pine.mock.sample

fun main(args : Array<String>) {
    println("Hello Kotlin!")

    println("Foo.foo = " + Foo.foo())
    println("Foo.bar = " + Foo.bar)

    val bar = Bar()
    println("Bar.foo = " + bar.foo())
    println("Bar.bar = " + bar.bar)
}
