function global(){
    var g = "global";
    console.log(g,o,i); // ReferenceError: 'g' is not defined

    function outer(){
        var o = "outer";
        console.log(g,o,i);

        function inner(){
            var i = "inner";
            console.log(g,o,i);
        }
        inner();
    }
    outer();
}

// global();

function isHoliday(date){

    var holidays = ["14/06/2026","15/06/2026"];
    var result = "";

    if(holidays.includes(date)){
        var logData = "Yes, it's a holiday";
        result = "Yes";
    }

    return {
        logData,
        result
    }
}

console.log(isHoliday("14/06/2026"));