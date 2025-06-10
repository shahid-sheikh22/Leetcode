class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int minEven = 100;

        int maxOdd = 0;

        for(char key : map.keySet()){
            int n = map.get(key);
            if(n % 2 == 0){
                if(n < minEven) minEven=n;
            }
            else{
                if(n > maxOdd) maxOdd=n;
            }
        }
        return maxOdd - minEven;
        
    }
}