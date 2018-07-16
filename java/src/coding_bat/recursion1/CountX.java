package coding_bat.recursion1;

/**
 * Created by gaston on 25/07/16.
 */
public class CountX {
    public static void main(String args[]){
        System.out.println(countX("xxhixx")); //4
        System.out.println(countX("xhixhix")); //3
        System.out.println(countX("hi")); //0
    }

    public static int countX(String str) {
        return countX(str.toCharArray(),0,0);
    }

    public static int countX(char [] str,int pos, int count){
        if(pos >= str.length){
            return count;
        }
        if(str[pos] == 'x'){
            count++;
        }
        return countX(str,++pos,count);
    }

}
