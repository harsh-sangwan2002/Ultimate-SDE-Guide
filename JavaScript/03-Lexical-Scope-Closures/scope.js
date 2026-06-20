function global() {
  console.log(g, o, i); // ReferenceError: 'o' is not defined

  function outer() {
    console.log(g, o, i);

    function inner() {
      console.log(g, o, i);
    }
    inner();
  }
  outer();
}

// global();

function isHoliday(date) {
  var holidays = ["20-06-2026", "21-06-2026"];
  var res = "";

  if (holidays.includes(date)) {
    var logData = "Yes, it's a holiday";
    res = "Yes";
  } else {
    res = "No";
  }

  return {
    logData,
    res,
  };
}
console.log(isHoliday("22-06-2026"));
