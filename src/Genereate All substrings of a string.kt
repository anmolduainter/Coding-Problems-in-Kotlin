/**
 * Created by anmol on 7/8/17.
 */



fun print(c:CharArray,start:Int,end:Int){

    for (i in start..end){

        print(c[i])

    }

    println(" ")

}




fun main1(c:CharArray,start:Int,end:Int){

  if (start==end){

     return

  }
    var i:Int;

    for (i in start..end){

        print(c,start,i)

    }

    main1(c,start+1,end);

}


fun main(args:Array<String>){

    var s:String="abcdeeff";

    var c:CharArray =s.toCharArray();

    main1(c,0,c.size-1)

}