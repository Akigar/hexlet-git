import java.util.Scanner

fun main() {

    val number = Scanner(System.`in`)
    val mounth = number.nextInt()

    val age = Scanner(System.`in`)
    val years_deth = age.nextInt()

    var count: Long = 0
    var dop_num: Long = 0
    var counts = arrayOf<Long>()

    counts += 1

    for (i in 2..years_deth) {
        counts += 0
    }
    println(counts.joinToString())
    for (i in 1..mounth){
        for (j in 1..(years_deth - 1)){
            dop_num += counts[j]
        }
        for (j in years_deth - 1..1){
            println(j)
            counts[j] = counts[j - 1]
        }

        println(counts.joinToString())
        counts[0] = dop_num
    }
    for (i in 0..(years_deth - 1)) {
        count += counts[i]
    }
    println(count)
}
