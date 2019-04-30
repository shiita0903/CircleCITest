package jp.shiita.circlecitest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DoubleNumberTest {
    @Test
    fun testNumber_100() {
        val expected = 200

        val dn = DoubleNumber(100)

        assertEquals(expected, dn.number)
    }

    @Test
    fun testNumber_0() {
        val expected = 0

        val dn = DoubleNumber(0)

        assertEquals(expected, dn.number)
    }


    @Test
    fun testNumber_minus100() {
        val expected = -200

        val dn = DoubleNumber(-100)

        assertEquals(expected, dn.number)
    }
}