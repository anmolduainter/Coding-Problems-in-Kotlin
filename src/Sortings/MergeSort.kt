package Sortings

/**
 * Created by anmol on 7/8/17.
 */


///////////////////////Not working abhi



fun merge(number: IntArray,l: Int,m:Int,r: Int){

    var i:Int;var j:Int;var k:Int;

    var n1:Int=m-l+1;
    var n2:Int=r-m;

    println("number : " + number)
    println("r : "+r)
    println("m : "+m)
    println("n2 : "+n2)

    var left:IntArray=kotlin.IntArray(n1);
    var right:IntArray=kotlin.IntArray(n2);

    for (i in 0..n1-1){
        left[i]=number[l+i]
    }

    println(m)

    for (j in 0..n2-1){
        right[j]=number[m+1+j];
    }


    i=0;
    j=0;
    k=l;

    while (i<n1 && j<n2){

        if (left[i]<=right[j]){
            number[k]=left[i]
            i++;
        }

        else{
            number[k]=right[i]
            j++;
        }

        k++;

    }


    while (i<n1){

        number[k]=left[i];
        i++;
        k++;

    }


    while (j<n2){
        number[k]=right[j];
        j++
        k++
    }


}


fun mergeSort(number:IntArray,l:Int,r:Int){


    if (l<r){

        var m:Int;

        m=l+(r-l)/2;

        mergeSort(number,l,m)
        mergeSort(number,m+1,r)

        merge(number,l,m,r);

    }


}


fun printArr(number:IntArray){

    for (i in 0..number.size){

        println(number.get(i))

    }

}


fun main(args:Array<String>){

    var number:IntArray = intArrayOf(6,3,9,10,44,22,77,66)

    var length:Int=number.size

    println(length)

    mergeSort(number,0,length);

  //  Sortings.printArr(number,length)

}