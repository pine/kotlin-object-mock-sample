package moe.pine.mock.sample

class Bar {
    fun foo(): String {
        return Foo.foo()
    }

    val bar: String
        get() = Foo.bar
}