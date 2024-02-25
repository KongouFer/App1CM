fun main(){
    operaNumeros(a:30, b:18, object: Operaciones{
        override fun suma(a: Int,b: Int){
            println("La suma de $a + $b es ${a+b}")
        }
        override fun resta(a: Int, b: Int){
            println("La resta de $a - $b es ${a-b}")
        }
    })
}

interface Operaciones{
    fun suma(a: Int, b: Int)
    fun resta(a:Int, b: Int)
}
/*class Prueba: Operaciones{ //Después de comas todo lo demás son interfaces
    override fun sum(a: Int, b: Int) {
        TODO("Not yet implemented")
    }

    override fun resta(a: Int, b: Int) {
        TODO("Not yet implemented")
    }
}*/

fun operaNumeros(a:Int, b:Int, operaciones: Operaciones){
    println("El resultado de ")
    operaciones.suma(a, b)
    operaciones.resta(a,b)
fun operaNumeros(a: Int,b: Int, operacion: (Int, Int) -> Unit){
    println("La operación con lambda es: ")
    operacion(a,b)
}
val miLambdaSuma: (Int,Int) -> Unit = {num1, num2, num3, texto1 -> println("La suma de $num1 + $num2 es ${num1+num2}") }
}