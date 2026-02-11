Running Notes of  PROBLEM SOLUTIONS of LEET CODE BlINK 75 

#1. Container with most water : use 2 pointers - > left and right  : left ++ or righ -- based on ht. keep treck of max area.
 
#238. Product Excpet Self Array; . two pointers = left product and right product. left =  skip first and multiply. right = skip right multiply. merge two products 

#283. Move Zeros - Use only 1 loop to traverse array, 1 counter to keep track pos of zero. use the counter to swap zero with non zero which has index > counter

#392. Is Subsequence - iterate through substring char and check contains in main string, use prev index to check continuity
 
#443. String Compression -  Straight forward , compare previous character in string and loop through to form a new string using builder.

#643. Max Average Subarray- slidingwindow\MaxAverageSubArray.java - two independent for loops . start index of 2 loop from where it was left at the first loop

#1679. Max Number Of K-Sum pairs
