/**
 * Created by anmol on 7/8/17.
 */


fun printSubsequence(c:CharArray,n:Int){

    var a:Int=2;
    var p:Int=Math.pow(a.toDouble(),n.toDouble()).toInt();

    for (i in 1..p){
        for (j in 0..n-1){
            if ((i and (1 shl j))>0){
                print(c[j])
            }
        }
        println(" ")
    }


}



fun main(args:Array<String>){

    var s:String="Hello";

    var c:CharArray=s.toCharArray();

    printSubsequence(c,c.size);


}