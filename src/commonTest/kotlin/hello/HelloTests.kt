package hello

import kotlin.test.Test
import kotlin.test.assertTrue

class HelloTests {
    @Test
    fun testHello() {
        assertTrue("Kotlin/Native" in hello())
    }
}
