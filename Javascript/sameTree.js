/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    var left = false ,right = false;

    if(q === p && p.val === q.val){
        return true;
    }

    left = isSameTree(p.left,p.left);
    rigth = isSameTree(p.right,p.right);


    return left && rigth;
};
//TODO terminar
