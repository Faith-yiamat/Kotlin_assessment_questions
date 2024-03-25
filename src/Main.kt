fun main() {
    println(arrRnt(arrayOf(23, 34, 56, 7, 8, 9, 10)))
    calculate(7)
    brniestr(
        "Barnie bakes brown bagels and buns"
    )
    println(isPalindrome("lovely"))
}

fun brniestr(info: String) {
    info.split("")


}

fun arrRnt(num: Array<Int>): Int {
    return (num.sum())


    return (num.count())

}

fun calculate(radius: Int) {
    var pie = 3.14159
    var area = 4 / 3 * pie * radius * radius * radius
    println(area)


}

fun isPalindrome(word: String): Boolean {
    if (word.first() == word.last()) {
        return true
    } else {
        return false
    }


}