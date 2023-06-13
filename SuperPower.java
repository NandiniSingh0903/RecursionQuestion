public class SuperPower {
    public static int superPow(int a, int[] b){
        if(a==1){
            return 1;
        }
        
        if(b.length==1){
            return (int)Math.pow(a,b[0]);
        }

        return (int)Math.pow(a, power(b, b.length-1)) %1337;
    }

    static double power(int[] b , int i){
           if(i==-1){
                return 0;
           }
           return b[i]*(int)Math.pow(10, i+1) + power(b, i-1);
    }

    public static void main(String[] args) {
        int a=1;
        int b[] = {4,3,3,8,5,2};
        System.out.println(superPow(a,b));
    }
}