class Main {

    fun main(){
        var check = 0;
        var x : Any = 5665.56
        when(check){
            1 -> print("you one")
            2 -> print("you two")
            3 -> print("you three")
            4 -> print("you four")
            in  4..19 -> print("in 4 to 19")
            in  40 downTo 18 -> print("in 40 to 18")
            41, 42, 43 -> print("40, 42, 43")
            !in  44..90 -> print("in 4 to 19")

            else -> {
                System.out.println("You are $check which cannot be touced in real life")
            }
        }

        when(x){
            is Int -> println("$x is an Int")
            !is String -> println("$x is not an String")
        }

        //newer for loop in kotlin

        var i = 0
        for (i in 0..100){
            println("O to 100 using ..")
        }

        for (i in 1000 downTo 101 step 5 ){
            println("1000 to 101 by stepping 5")
        }

        for (i in 2000 until  1001){
            println("2000 to 1001 using until")
        }

        fun average(a: Double, b: Double ): Double{
            return (a+b)/2
        }


      //  var nam : String = "Jafrin"
        // nam = null -> Compilation Error

        var nullableNam : String = "Jaf"
      //  nullableNam = null

        // ?: Elvis operator
        val nam = nullableNam ?: "Guest"
        var len = nullableNam ?.length
     //   nullableNam?.let { print(it.length) }

        // Elvis chain

        // val wifesAge: String? = user?.wife?.age ?: 0




    }
}