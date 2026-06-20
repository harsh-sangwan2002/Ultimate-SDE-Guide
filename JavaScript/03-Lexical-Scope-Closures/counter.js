function counter(){
    let count = 0;

    return function(){
        return ++count;
    }
}

const c1 = counter();
console.log(c1());
console.log(c1());
console.log(c1());
console.log(c1());