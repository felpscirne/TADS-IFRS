function positiveNumber(number){
    number=number*-1
    return number
}

function mmc(a, b) {   
   
    try{
        if(a==undefined || b==undefined) throw new Error ('Dois valores são necessários')
        if ((typeof a != 'number' || typeof b != 'number'))  throw new Error ('Os valores devem ser númericos')
        if (a==0 || b==0) throw new Error ('Não é possível calcular o MMC com 0')
    }catch (Error) {return Error} 
    
    if (a<0) a=positiveNumber(a)
    if (b<0) b=positiveNumber(b) 

    var mmc=1
    while (true) {
        if (mmc % a == 0 && mmc % b == 0)break

        mmc++
    }
    return mmc
}
    
console.log(mmc(-15,0))
console.log(mmc(15,1))
console.log(mmc())
console.log(mmc('a','b'))
console.log(mmc(15,2))
console.log(mmc(4, 5))
console.log(mmc(3, 6))
console.log(mmc(8, 12))
console.log(mmc(9, 15))
console.log(mmc(7, 11))
console.log(mmc(2, 9))
console.log(mmc(14, 21))
console.log(mmc(5, 10))
console.log(mmc(16, 24))
console.log(mmc(13, 26))