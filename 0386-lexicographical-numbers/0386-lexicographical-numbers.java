class Solution {

    static List<Integer> arr;
    static int k;

    static void checkLexi(int n){
        if(n>k) return;
        if(n<=k && n!=0) arr.add(n);
        if(n==0){
            for(int i=1; i<=9; i++){
                checkLexi(10*n+i);
            }
        }else{
            for(int i=0; i<=9; i++){
            checkLexi(10*n+i);
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        k=n;
        arr = new ArrayList<>();

        checkLexi(0);
        return arr;
    }
}