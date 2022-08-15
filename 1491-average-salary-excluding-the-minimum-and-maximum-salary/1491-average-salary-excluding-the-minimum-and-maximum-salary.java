class Solution {
    public double average(int[] salary) {
        
      /*
      Finding Max sal and Min Sal, While Sum all the elements
      Averge is calculated by excluding max and min and dividend is length - 2
      */
        
        
      int maxSal = Integer.MIN_VALUE;
      int minSal = Integer.MAX_VALUE;

      double sum = 0.0; 
      for(int i = 0; i < salary.length; i++) {
          sum += salary[i];
          if(salary[i] > maxSal) maxSal = salary[i];
          if(salary[i] < minSal) minSal = salary[i];
      }
    return ( sum - maxSal - minSal ) / (salary.length - 2);
    }
}