package org.uppin.loop.node

import kotlin.test.*

class CrossCodeTest {
    @Test fun bar() {
        assertEquals(4, 2 * 2)
    }

    @Test fun baz() {
        fail("Doesn't work")
    }
}