function sum(x){
    return function(y){
        return x+y;
    }
}

const s1 = sum(1);
console.log(s1(1));
console.log(s1(2));
console.log(s1(3));
console.log(s1(4));

console.log('------------------------');

const s2 = sum(2);
console.log(s2(1));
console.log(s2(2));
console.log(s2(3));
console.log(s2(4));