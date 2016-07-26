function find(list, sublist) {
    var index = -1,count=0;
    var val1,val2;
    val1 = list.val;
    val2 = sublist.val;
    while(list.next != null && sublist.next != null){
        if(val1 === val2){
        		sublist = sublist.next;
            if(index === -1){
                index = count;
            }
        }
        list = list.next;
        count++;
    }
    return sublist === null ? index : -1;
}
