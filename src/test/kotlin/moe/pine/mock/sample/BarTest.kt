package moe.pine.mock.sample

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import kotlin.test.assertEquals

@RunWith(PowerMockRunner::class)
@PrepareForTest(Foo::class)
class BarTest {
    // Bar.foo のテスト
    @Test
    fun foo() {
        // Foo.foo() のモック処理
        PowerMockito.mockStatic(Foo::class.java)
        Mockito.`when`(Foo.foo()).thenReturn("xxx_foo")

        // モックを用いて Bar クラスをテスト
        assertEquals("xxx_foo", Bar().foo())

        // モックが呼ばれたことを検証
        PowerMockito.verifyStatic()
        Foo.foo()
    }

    // Bar.getBar のテスト
    @Test
    fun bar() {
        // Foo.getBar() のモック処理
        // (Kotlin のプロパティは、Java の getter/setter に該当)
        PowerMockito.mockStatic(Foo::class.java)
        Mockito.`when`(Foo.bar).thenReturn("xxx_bar")

        assertEquals("xxx_bar", Bar().bar)

        // モックが呼ばれたことを検証
        PowerMockito.verifyStatic()
        Foo.bar
    }
}
