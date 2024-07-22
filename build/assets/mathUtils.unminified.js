"use strict";
function _export(target, all) {
    for(var name in all)Object.defineProperty(target, name, {
        enumerable: true,
        get: all[name]
    });
}
_export(exports, {
    add: function() {
        return add;
    },
    subtract: function() {
        return subtract;
    }
});
var process = process || {
    env: {
        NODE_ENV: "development"
    }
};
function add(a, b) {
    return a + b;
}
function subtract(a, b) {
    return a - b;
}



