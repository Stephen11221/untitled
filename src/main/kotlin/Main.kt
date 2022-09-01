import java.util.*

fun main(args: Array<String>) {

    /* Data types
             *Numbers
             *   >whole
             *     -byte
             *     -bit
             *     -short
             *     -long
             *   >decimals
             *      -double
             *      -float
             * Alphanumerics
             *    >char
             *          -a
             *          -b
             *          -c
             *   >string
             *         -samurai
             *         -cat

         **/

    //example
    val comps: Int = 50
    var human = 60
    val desks: Int = 25

    var myname: String = "samurai"
    myname = "takahashi"
    val grade: Char = 'A'

    var chairs = 4
    var students = 20

    var sum = chairs + students

//    println(total)
//   println(myname)
//  println(students)

/* Operators *
      Definition-

    >Types of operators
         -Arithmetic operators
            eg +,-,/,%
         -Binary operators
           eg
         -Assignment operators
           eg =,+=,/=,%=
         -Logic operators
            eg !,||,&&
          -Ternary operators
            eg
          -Comparison operators
             eg ==,!=,>,<,>=
          -Bitwise operators
            eg
   */

    var cars: Int = 47
    var men: Int = 17
    var mod: Int = cars % men

    println(mod)

    var goats = 4
    var cows = 10
    var chicken = 54

    var total = goats + cows + chicken

    var final: Int = total / 2


    println(total)
    println(final)

    var anime = 20
    var Asians = 60
    var Samurai = 300

    var full = anime + Asians + Samurai
    var complete: Int = full / 190

    println(full)
    println(complete)

    /* Booleans
        Description-

        //Booleans with logical operators

         */

    var x: Boolean = true
    var y: Boolean = false

    println("x && y= " + (x && y))
    println("x || y= " + (x || y))
    println(" ! y= " + (!y))

    //Comparison Operators
    //Booleans with comparison operators
    var comp: Int = 97
    var math: Int = 80

    println("comp > math =" + (comp > math))
    println("comp < math=" + (comp < math))
    println("comp<=math=" + (comp <= math))
    println("comp != math=" + (comp != math))
    println("comp == math=" + (comp == math))
    //  1st cow increase by 15%
//    2nd cow increase by 10
//
//    ratio 15:10 or 3:2

//    1st year
    var litres = 8100 / 5
    var ngombe1 = 1620 * 3
    var ngombe2 = 1620 * 2

//     2nd year
    var cowfirst = 4860 + 600
    var cowsecond = 3240 + 400

    println("1st year")
    println(ngombe1)
    println(ngombe2)
    println("2nd year")
    println(cowfirst)
    println(cowsecond)


//    delivery company
    var days = x
    var parts = 25
    var items = 25 * 3
    var adddays = 25 + 5
//    The required equation
//    => 25x =75 + 30(x-3)-100
//       =>25x =75+30x-90-100
//       =>90+100-75=25x-30x
    mwanafunzi("steven",111023,'C')

    var im: Int = 190
    var kim: Int = 75
    var ff: Int = im - kim
    println(ff)


    var ending = 115 / 5
    var allparts = 23 * 25 + 100

    println("part")
    println(items)
    println("New parts")
    println(adddays)
    println(" parts made")
    println(ending)
    println(" masiku took")
    println(allparts)

    println("_____________________________")
    println("1/8/2022" + "--Date")
    println("Array")
    //Array are used to store multiple item or Values of  the same //

    var fruit = arrayOf<String>("banana", "apple", "grapes", "mangoes", "pineapple", "passion")
    println(fruit[0])
    println(fruit[3])
    println(fruit.get(2))
    println(fruit[4])

    fruit.set(2, "guava")
    println(fruit.get(2))
    println(fruit.size)
    if ("guava" in fruit) {
        println("guava exist in array")
    } else {
        println("Does  not exist")
    }

    val nums = arrayOf(1, 2, 3, 4, 5)
    println(Arrays.toString(nums))

    val num2 = arrayOf(3..12).toList().toTypedArray()
    println(Arrays.toString(num2))
    val num3 = IntArray(5, { i -> i * 2 + 3 })
    println(Arrays.toString(num3))
    val num4 = IntArray(4, { i -> i * 2 + 4 })
    println(Arrays.toString(num4))

    println(" kotlin Array Indexing ")

    val num5 = intArrayOf(1, 2, 3, 4, 5)
    println(num5[2])
    num5[0] = 11
    println(num5[0])

    println("--------kotlin Arraybasic Operation------------ ")
    val num7 = arrayOf(1, 2, 3, 4, 5)
    println(num7.get(0))
    num7.set(0, 0)
    println(Arrays.toString(num7))
    val slice = num7.plus(1)
    println(Arrays.toString(slice))

    println("---------Kotlin Array Builtins------------")

    val num6 = arrayOf(1, 2, 3, 4, 5)
    val avg = num6.average()
    println("this the average $avg")

    val nOfvalue = num6.count()
    println("there are $nOfvalue values")
    val maxValue = num6.count()
    println("The Maximum is $maxValue")
    val minValue = num6.minOf { 5 }
    println("the minimum is $minValue")
    println("----------------Array count---------------")
    val number70 = intArrayOf(2, 3, 4, 5, 6, 7)

    println("There are ${nums.count()} elements in the array")

    val nOfEvens = nums.count { it % 2 == 0 }

    println("There are $nOfEvens even values in the array")
    println("-----Traverse Arrays-----------------")
    val number89 = arrayOf(1, 2, 3, 4, 6, 7)
    number89.forEach({ e -> print("$e") })
    println()
    println("________________________")
    number89.forEachIndexed({ i, e -> println("num[$i]") })
    for (e in number89) {
        print("$e")
    }
    println()
    val it: Iterator<Int> = number89.iterator()
    while (it.hasNext()) {
        val e = it.next()
        print("$e")

    }
    println("|----------flow chart--------------|" + "-------control structure--------------")
    //  control statement
    // this are statement that determin the next step to be executed  in program
    // e.g if , if-else, while,when, for, dof
    // if -else Statement
    // NB  what is syntax
    // a syntax is the rules  follows when  writing a program These rules defines the structure of programming language
    //if -else Statemen
    //* Syntax of  if  -els statement
    //  if (condition  ){
    //  statement
    //   }
    //   else{
    // statement
    // }
    var age: Int = 19
    if (age >= 20) {
        println("Adult $age")
    } else {
        println("Children $age")
    }


    if (age >= 13 && age <= 19) {
        println("teen $age")
    }
    // when statement
    //syntax
    // when  (condition ){
    //st=1
    // st=2}
//    var reader = Scanner(System.`in`)
//    println("enter the month number ")
//    var monthofyear = reader.nextInt()
//    var month = when (monthofyear) {
//        1 -> "jan"
//        2 -> "feb"
//        3 -> "Much"
//        4 -> "appril"
//        5 -> "may"
//        6 -> "june"
//        7 -> "july"
//        8 -> "august"
//        9 -> "september"
//        10 -> "October"
//        11 -> "november"
//        12 -> "December"
//
//
//        else -> {
//            println("Doen't exist")
//        }
//    }
//    println(month)
//    // while loops
//    //
//    var number1 = 1
//    while (number1 <= 20) {
//        println(number1)
//        number1++
//    }
//    println("home work ")
//    System.out.println("For control structure ")
//    System.out.println("For ")
//
//    var priceofitem = arrayOf(80, 90, 110, 150, 180, 200, 250, 280)
//    for (item in priceofitem) {
//        println("this is the price of item $item ksh")
//    }
//
//    println("when ")
//    var adminnumber = 3
//    var girlavailable = when (adminnumber) {
//        1 -> "Jane"
//        2 -> "Viginia "
//        3 -> "Mercy"
//        4 -> "Shaila"
//        5 -> "Stella"
//        6 -> "Karen"
//
//        else -> "Invalid student"
//
//    }
//    println("the student name is $girlavailable")
//
//    println("Do")
//    var e = 100
//    do {
//        println(e)
//        e++
//    } while (e <= 200);
    
        //function
    // description-it is a unit code that perform specific task.
    // the function are used to break codde into modules to the program manageble
    //                                               type of function
    // built in function-this aare function that are already defined in the standard library and  are ready for use
    // user defined-this is functiion that is created  by programer  using key world 'fun'
    //                                  user defined function take one or  more paramaters
    // syntax of user defined
    //fun fun-name(data/paramater) return  type{
    // codes
    // }
           // builting function
    var kuogeza = arrayOf(1,2,3,4,5,6,7,8,9,10).sum()
    println("The sum of kuogeza is : $kuogeza")
      // user defined


}

fun mwanafunzi(jina:String,indesi:Int,gradi:Char) {
    println("jina langu ni : $jina ")
    println("indesi $indesi")
    println("gradi yangu ni $gradi")
}
fun mideva(name:String,no:Int ){
    println("Name of the car $name")
    println("$no")
}

fun steve(name:String,salary:Int,){
    println("$name")
    println("$salary")
}