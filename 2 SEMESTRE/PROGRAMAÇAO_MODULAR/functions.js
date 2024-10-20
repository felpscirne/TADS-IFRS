function abs(n){return n < -0 ? n*-1:n}


function pow(base,exp){

    if (exp%1 !=0)
        throw 'Decimal nâo suportado'

    var result=1
    for (let i = 0; i < abs(exp); i++) result*=base

    return exp < 0 ? 1/result : result
}

console.log(pow(2,9))
