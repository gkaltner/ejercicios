//var str = "PAYPALISHIRING"; //PAHNAPLSIIGYIR
//var rows = 3
//var str = "ABCD"; //ACBD
//var rows = 2
//var str = "ABCDE"; //ABCED
//var rows = 4
var str = "ABC"; //ACB
var rows = 2

/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
	var len = s.length,
  		position = 0,
        i = null,
        mat = [];

	while(position < len){
        for(i = 0;i < numRows && position < len; i++, position++){
        	mat[i] = mat[i] ? mat[i] + s[position] : s[position];
        }
        for(i = numRows-2;position < len &&  i>0 ;position++,i--){
        	mat[i] = mat[i] ? mat[i] + s[position] : s[position];
        }
  	}
    return mat.join("");
};

console.log(convert(str,rows));
