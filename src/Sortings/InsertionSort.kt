package Sortings


fun <T:Comparable<T>>InsertionSort(items:MutableList<T>):MutableList<T>{

    if (items.isEmpty()){
        return items;
    }

    for (idx in 0..items.count()-1){

        var item=items[idx]
        var i=idx

        while (i>0 && item<items[i-1]){
            items[i]=items[i-1]
            i--
        }

        items[i]=item
    }

    return items
}





fun main(args:Array<String>){

    println("Insertion Sort")

    val list= mutableListOf<String>("Hello","My","Name","Is","Anmol","Dua");


    var ordered = InsertionSort(list)

    println(ordered)


}