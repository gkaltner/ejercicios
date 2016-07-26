function LookAndSay(start,n){
	var sequence =[];

  var number = start.toString(),
  	count = 0, last = "";
  for(var i=number.length-1; i >= 0; i--){
  	 	if(last === number[i]){
      	count++;
      }else{
      	if(count > 0){
        	sequence.unshift(count);
        }
        sequence.unshift(number[i]);
      	count = 1;
      	last = number[i];
      }
  }
  if(count > 0){
    sequence.unshift(count);
  }

  var newStart = sequence.join("");

  if(n > 1){
  	newStart = LookAndSay(newStart,n-1);
  }
  return newStart
}

console.log(LookAndSay(1));
