function memorizedSum(){
    let res = {};

    return function(arr){

        console.log(res);
        
        if(res[arr]){
            console.log("Memorized sum");
            return res[arr];
        }

        else{
            console.log("Computing the sum");
            return res[arr] = arr[0]+arr[1];
        }
    }
}

const s1 = memorizedSum();
console.log(s1([1,2]));
console.log(s1([1,2]));

const s2 = memorizedSum();
console.log(s2([2,3]));
console.log(s2([2,3]));