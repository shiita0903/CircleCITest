package jp.shiita.circlecitest

class DoubleNumber(num: Int) {
    val number = num * 2
}

fun main() {
    val dn = DoubleNumber(100)
    println(dn.number)
}