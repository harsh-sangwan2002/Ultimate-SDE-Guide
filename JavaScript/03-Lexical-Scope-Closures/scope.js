function global() {
    var g = 'global';
    console.log(g, o, i); // ReferenceError: o is not defined

    function outer() {
        var o = 'outer';
        console.log(g, o, i);

        function inner() {
            var i = 'inner';
            console.log(g, o, i);
        }
        inner();
    }
    outer();
}

// global();

function isHoliday(date) {
    var holidays = ['25/12/2025'];
    var res = '';

    if (holidays.includes(date)) {
        var logData = "Yes, it's a holiday";
        res = 'Yes';
    }

    else {
        res = 'No';
    }

    console.log(holidays, logData, res);
    return res;
}

isHoliday('25/12/2025');
isHoliday('25/11/2025');