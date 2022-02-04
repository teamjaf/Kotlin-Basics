class Main {

    fun main(){
        var check = 0;
        when(check){
            1 -> print("you one")
            2 -> print("you two")
            3 -> print("you three")
            4 -> print("you four")
            in  4..19 -> print("in 4 to 19")
            in  40 downTo 18 -> print("in 4 to 19")

            else -> {
                System.out.println("You are $check which cannot be touced in real life")
            }


        }

    }
}