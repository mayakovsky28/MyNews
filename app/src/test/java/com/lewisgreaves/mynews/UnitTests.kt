package com.lewisgreaves.mynews

import junit.framework.Assert.assertEquals
import org.junit.Test

/*
* Created by @Mayakovsky28 on 04 12 2019.
*/

class UnitTests {

    fun helloWorld(name: String = "World"): String {
        return "Hello ${name}!"
    }

    @Test
    fun `user is greeted with personalised message`() {
        assertEquals("Hello Lewis!", helloWorld("Lewis"))
    }
}