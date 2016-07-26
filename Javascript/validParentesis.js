/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var i = 0,len = s.length,
        stack = [];

    for(;i < len; i++){
        if(stack.length > 0 && stack[0] === s[i]){
            stack.shift();
        }else{
            stack.unshift(value(s[i]));
        }
    }
    return !stack.length;
};

function value(str){
    switch(str){
        case '(': return ')';
        case '[': return ']';
        case '{': return '}';
        default: return str;
    }
}
