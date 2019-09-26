fun main()
{
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    println(compare(a,b,c,d))
}

fun compare(a:Int, b:Int, c:Int, d:Int):Int
{
    val arr = arrayOf(a,b,c,d)
    var smallest = a
    for(i in 1..3)
    {
        if(arr[i]<smallest) smallest=arr[i]
    }
    return smallest
}