package com.amaurypm.myapp1

import kotlin.random.Random

fun main(){
    println("Hola Cómputo Móvil")

    val a: Int = 12345
    val b: Float = 8.5f
    val c = "Hola Amaury"
    val d =  true

    //a = null

    var texto = c + " cómo estás?"
    texto += " ID: "
    texto += "$a"

    println(texto)
    println("La suma de $a + $b es ${a+b}")
    println("El \"total\" de tu carrito es \$50.00")

    var array1 = arrayOf(34, 25, 16)

    println(array1)

    println(array1[1])

    array1.forEach { element ->
        println(element)
    }

    println(array1.size)

    val lista1 = mutableListOf(34,25,16)

    lista1.add(50)
    lista1.add( 2, 100)

    println(lista1)

    var array2 = ArrayList<Int>()

    array2.add(10)
    array2.add(20)
    array2.add(0, 1)

    println(array2)

    var estudiante1 = Student1("Amaury", "Perea")

    println("El nombre del estudiante 1 es: ${estudiante1.name}")

    var estudiante2 = Student2("Héctor", "Matsumura")

    println("El apellido del estudiante 2 es: ${estudiante2.surname}")

    var miMapa2 = mutableMapOf("llave1" to  "valor1", "llave2" to "valor2")
    miMapa2["llave3"] = "valor3"

    println(miMapa2)
    println(miMapa2["llave1"])

    var miMapa3 = mutableMapOf<Int, String>(0 to  "valor1", 1 to "valor2")
    miMapa3[3] = "valor3"

    println("El valor del mapa 3 con la llave 0 es: ${miMapa3[0]}")

    val edad = Random.nextInt(1,100) //del 1 al 99

    if (edad >= 18) {
        println("Tienes $edad, por lo que eres mayor de edad")
    } else {
        println("Tienes $edad, por lo que eres menor de edad")
    }

    var tipoSaludo = Random.nextInt(1,4)

    when(tipoSaludo){
        1 -> {
            println("Hola Amaury")
        }
        2 -> {
            println("¿Qué onda Amaury?")
        }
        else -> {    //Como el default
            println("¿Cómo estás Amaury?")
        }
    }

    var num = 11

    while (num<=10){
        println(num)
        num++
    }

    println("------------------------")

    var num2 = 11

    do {
        println(num2)
        num2 += 1
    } while (num2<=10)

    println("------------------------")
    for(x in 1..5 step 2){
        println(x)
    }

    println("------------------------")

    for(x in 5 downTo 1 step 2){
        println(x)
    }

    println("------------------------")

    for(x in 1.rangeTo(15)){
        println(x)
    }

    println("------------------------")

    for (x in 1 until 5){
        println(x)
    }

    println("------------------------")
    for (num in 1..200){
        if(num % 2 == 0) println(num)   //Números impares
    }

    fun hola(){   //Definición
        println("Hola mundo")
    }

    hola() //llamada

    fun hola2() = "Hola mundo 2"

    println(hola2())

    fun hola3(nombre: String = "Amaury")= "Hola $nombre"

    println(hola3())
    println(hola3("Héctor"))

    fun sumaNumeros(num1: Int, num2: Int) = num1 + num2

    println("La suma de 5 + 8 es: ${sumaNumeros(5,8)}")

    class Perro {
        var nombre = ""   //Agregando las propiedades
        var edad = 0
    }

    var miPerro = Perro() //Instanciando un objeto

    miPerro.nombre = "Rocky"   //ya tiene en automático los getters y setters
    miPerro.edad = 7

    data class Perro2(private var nombre: String, private var edad: Int)

    var miPerro2 = Perro2("Rocky", 5)

    class Perro3 {
        var name: String
        var age: Int

        init {          //Inicializador
            name = ""
            age = 0
        }
    }
    var miPerro3 = Perro3()

    class Perro4 {
        var nombre_p: String
        var edad_p: Int

        constructor(nombre: String, edad: Int){
            this.nombre_p = nombre   //como en Java
            this.edad_p = edad
        }

        constructor() {
            nombre_p = "Sin nombre"
            edad_p = 0
        }

        fun infoPerro() {                              //funciones en una clase (o métodos)
            println("$nombre_p tiene $edad_p años")
        }
    }
    var miPerro4 = Perro4("Fido", 8)   //cada uno usa un constructor diferente
    var miPerro5 = Perro4()
    miPerro4.infoPerro()
    miPerro5.infoPerro()

    var edadPersona: Int? = Random.nextInt(0,3) //aleatorios del 0 al 2

    edadPersona = when(edadPersona){
        0 -> null //Permite el valor null. Marcaría error si no se hubiera declarado nullable
        1 -> 10
        else -> 20
    }

    if(edadPersona!=null) {
        println(edadPersona)
        edadPersona.toDouble()
    }


    //val y = edadPersona?.toDouble() //con safe access

    //Con not null assertion
    val y = edadPersona?.toDouble()

    println(y)

}