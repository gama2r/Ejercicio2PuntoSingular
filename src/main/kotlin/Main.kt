fun main() {
    println("ingresa el primer lado: ")
    val n1 = readLine()!!.toInt()

    println("ingresa el segundo lado: ")
    val n2 = readLine()!!.toInt()

    println("ingresa el tercero lado: ")
    val n3 = readLine()!!.toInt()

    val ex2 = ExerciseTwo(n1, n2, n3)
    ex2.triangle()
}

class ExerciseTwo(num1:Int, num2:Int, num3:Int){
    var num1=0
    var num2=0
    var num3=0

    init{
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
    }

    fun triangle(){
        val arreglo = arrayOf(num1, num2, num3)
        var temp = 0
        for (i in (0 until arreglo.size-1)){
            for (j in (0 until arreglo.size-1)){
                if (arreglo[j] > arreglo[j+1]){
                    temp = arreglo[j]
                    arreglo[j] = arreglo[j+1]
                    arreglo[j+1] = temp
                }
            }
        }
        //for (i in (0 until arreglo.size)) println(arreglo[i])
        if (num1 == num2 && num2 == num3){
            println("El triangulo es equilatero")
            println("Todos los lados miden: ${num1}")
        }else{
            println("El triangulo no es equilatero")
            println("El lado mayor es: ${arreglo.get(arreglo.size-1)}")
        }
    }
}