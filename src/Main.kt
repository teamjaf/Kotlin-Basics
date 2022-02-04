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

    }
}