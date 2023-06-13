public class MissingElementUsingRecursion {
    static int missingNumber(int array[], int n){
        int sum = n*(n+1)/2;
        return helperFunc(array, sum, 0, n-2, 0);
    }

    static int helperFunc(int array[], int sum, int start, int end, int arrSum){
        if(start>end){
            return sum-arrSum;
        }

        arrSum = arrSum + array[start];
        return helperFunc(array, sum, start+1, end, arrSum);
    }
    public static void main(String[] args) {
        int array[] = {6,1,2,8,3,4,7,10,5};
        int n = 10;
        System.out.println(missingNumber(array, n));
    }
}
