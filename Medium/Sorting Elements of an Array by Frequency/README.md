<h2><a href="https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1?page=1&difficulty=Medium&status=unsolved&sortBy=submissions">Sorting Elements of an Array by Frequency</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array<strong> </strong>of integers, sort<strong> </strong>the array according to frequency<strong> </strong>of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
A[] = {5,5,4,6,4}
<strong>Output: </strong>4 4 5 5 6<strong>
Explanation: </strong>The highest frequency here is
2. Both 5 and 4 have that frequency. Now
since the frequencies are same then 
smallerelement comes first. So 4 4 comes 
firstthen comes 5 5. Finally comes 6.
The output is <strong>4 4 5 5 6.</strong></span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
A[] = {9,9,9,2,5}
<strong>Output: </strong>9 9 9 2 5<strong>
Explanation: </strong>The highest frequency here is
3. The element 9 has the highest frequency
So 9 9 9 comes first. Now both 2 and 5
have same frequency. So we print smaller
element first.
The output is <strong>9 9 9 2 5.</strong></span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong></span></p>
<p><span style="font-size: 18px;">You only need to complete the function<strong> sortByFreq() </strong>that takes integer array <strong>arr</strong>,<strong> </strong>and<strong> n </strong>is the length of arr<strong> </strong>as parameters and return the sorted array.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(NLogN).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(N).&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ N ≤ 10<sup>5</sup><br>1 ≤ A<sub>i</sub> ≤ 10<sup>5</sup>&nbsp;</span></p>
<p>&nbsp;</p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Oracle</code>&nbsp;<code>Zycus</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Hash</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;<code>STL</code>&nbsp;<code>Map</code>&nbsp;<code>Java-Collections</code>&nbsp;