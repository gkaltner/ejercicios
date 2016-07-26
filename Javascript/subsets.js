/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {

    var set =[], subset, mask, total = Math.pow(2, nums.length);

    for(mask = 0; mask < total; mask++){
        subset = [];
        for(var fin = nums.length,i=0;i<fin;i++){
            if( (mask & (1 << i)) !== 0){
                subset.push(nums[i]);
            }
        }

        set.push(subset);
    }

    return set;
};
