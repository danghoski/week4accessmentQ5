fun main() {
diffence()
}

fun diffence() : Boolean{

    var a : Int = 2
    var b : Int = 4
    var c : Int = 6

    var temp : Int
    if (a > b) {
        temp = a
        a = b
        b = temp
    }
    if (b > c) {
        temp = b
        b = c
        c = temp
    }
    if (a > b){
        temp = a
        a = b
        b = temp
    }
    return  (b - a == c - b)

}