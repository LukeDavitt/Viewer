"use strict";
var _mathUtilsjses6 = require("./mathUtils.js.es6");
var process = process || {
    env: {
        NODE_ENV: "development"
    }
};
var num1 = 5;
var num2 = 3;
console.log("The sum of ".concat(num1, " and ").concat(num2, " is: ").concat((0, _mathUtilsjses6.add)(num1, num2))); // Output: The sum of 5 and 3 is: 8
console.log("The difference between ".concat(num1, " and ").concat(num2, " is: ").concat((0, _mathUtilsjses6.subtract)(num1, num2))); // Output: The difference between 5 and 3 is: 2



