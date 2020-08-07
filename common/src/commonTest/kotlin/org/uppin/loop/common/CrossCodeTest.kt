package org.uppin.loop.common

import kotlin.test.*

class CrossCodeTest {
    @Test fun bar() {
        assertEquals(4, 2 * 2)
    }

    @Test fun baz() {
        fail("Doesn't work")
    }
}