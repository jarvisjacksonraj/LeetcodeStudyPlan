class Solution {
    /**
    Odd Case 1: Start with Odd and End with Odd         n + 1      3 4 5 6 7    =>  4 + 1 => [5 / 2] + 1    => 3 
    Odd Case 2: Start with Odd and End with Even        n          3 4 5 6 7 8  =>  5 + 1 => [6 / 2]        => 3
    
    Even Case 1: Start with Even and End with Even      n          2 3 4 5 6    =>  4 + 1 => [5 / 2]        => 2
    Even Case 1: Start with Even and End with Even      n          2 3 4 5 6 7  =>  5 + 1 => [6 / 2]        => 3 
    **/
    
    public int countOdds(int low, int high) {
        int totalNums = (high - low + 1);
        if(low % 2 != 0 && high % 2 != 0) {
            return totalNums / 2 + 1;
        }
        return totalNums / 2;
    }
}