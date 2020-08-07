package org.uppin.loop.server

import org.spekframework.spek2.*
import org.spekframework.spek2.style.specification.*
import org.amshove.kluent.*

object ServerAppTest: Spek({
    describe("a calculator") {
        it("should fail") {
            val app = ServerApp()

            "hello" shouldBeEqualTo "hello"
        }
    }
})
