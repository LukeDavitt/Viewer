//# sourceMappingURL=test.js.map
var _asset_pipeline_loaded_modules=_asset_pipeline_loaded_modules||{},_asset_pipeline_require=function(b){var a=_asset_pipeline_loaded_modules[b];if(void 0!=a)return a.exports;a=_asset_pipeline_modules[b];return void 0!=a?(_asset_pipeline_loaded_modules[b]=a(),_asset_pipeline_loaded_modules[b].exports):null},_asset_pipeline_modules=_asset_pipeline_modules||{};
_asset_pipeline_modules["mathUtils.js.es6"]=function(){function b(d,c){return d+c}function a(d,c){return d-c}var e={exports:{}},g=e.exports;"use strict";(function(d,c){for(var f in c)Object.defineProperty(d,f,{enumerable:!0,get:c[f]})})(g,{add:function(){return b},subtract:function(){return a}});return e};"use strict";var _mathUtilsjses6=_asset_pipeline_require("mathUtils.js.es6"),process=process||{env:{NODE_ENV:"development"}},num1=5,num2=3;
console.log("The sum of ".concat(num1," and ").concat(num2," is: ").concat((0,_mathUtilsjses6.add)(num1,num2)));console.log("The difference between ".concat(num1," and ").concat(num2," is: ").concat((0,_mathUtilsjses6.subtract)(num1,num2)));