package moe.pine.mock.sample

object Foo {
    @JvmStatic
    fun foo(): String {
        return "foo"
    }

    @JvmStatic
    val bar: String by lazy { "bar" }
}
