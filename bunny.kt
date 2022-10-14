import java.util.Scanner

fun main(){
    val number = Scanner(System. `in`)
    var mounth = number.nextInt()

    val age = Scanner(System. `in`)
    var years_deth = age.nextInt()

    var count : Long = 0

    var count_1 : Long = 1
    var count_2 : Long = 0
    var count_3 : Long = 0

    var dop_num : Long = 0

    for (i in 2..mounth){
        dop_num = count_2 + count_3
        count_3 = count_2
        count_2 = count_1
        count_1 = dop_num
    }
    count = count_1 + count_2 + count_3
    println(count)
}
