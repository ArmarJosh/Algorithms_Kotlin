package org.example

class MaxStockProfit {

    fun maxStockProfit(pricesArr:Array<Int>):Int{

        var maxProfit = -1
        var buyPrice = 0
        var sellPrice = 0

        var changeBuyPrice = true

        for(i in 0 until  pricesArr.size -1){
            if(changeBuyPrice) buyPrice = pricesArr[i]
            sellPrice = pricesArr[i +1];

            if(sellPrice < buyPrice){
                changeBuyPrice = true
            }else{
                var tempProfit = sellPrice - buyPrice
                if(tempProfit > maxProfit) maxProfit = tempProfit;
                changeBuyPrice = false;
            }
           // println("maxProfit: $maxProfit")
        }
        return maxProfit
    }
}