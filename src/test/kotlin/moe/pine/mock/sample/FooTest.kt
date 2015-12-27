package moe.pine.mock.sample

import org.junit.Test
import kotlin.test.assertEquals

class FooTest {
    @Test
    fun foo() {
        assertEquals("foo", Foo.foo())
    }

    @Test
    fun bar() {
        assertEquals("bar", Foo.bar)
    }
}
