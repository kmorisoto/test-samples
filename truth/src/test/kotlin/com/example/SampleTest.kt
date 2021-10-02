package com.example

import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class SampleTest {

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3, 4, 5])
    fun plusOne(value: Int) {
        val actual = value + 1
        assertThat(actual).isEqualTo(value + 1)
    }

    @Test
    fun string() {
        val string = "abcdef"
        assertThat(string).startsWith("abc")
        assertWithMessage("sample message").that(string).contains("ef")
    }

    @Test
    fun foo() {
        val foo = Foo(1, "b")
        assertThat(foo).isNotNull()
        assertThat(foo).isEqualTo(foo)
        assertThat(foo).isInstanceOf(Foo::class.java)
    }
}

data class Foo(
    val a: Int,
    val b: String
)
