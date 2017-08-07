/**
 * Created by anmol on 7/8/17.
 */


fun countBits(number:Int):Int{

    var mask:Int=1;

    var count:Int=0;

    while (mask>0){

        if ((mask and number)>0)
            count++;

        mask=mask shl 1

    }

    return count;


}


fun main(args:Array<String>){

    println("The no. of bits ${countBits(3)}")

}