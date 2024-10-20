<h2><a href="https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?page=1&status=unsolved&sortBy=submissions">Count Inversions</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of integers. Find the Inversion Count in the array.&nbsp;</span></p>
<p><span style="font-size: 18px;"><em><strong>Inversion Count</strong>: </em>For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. <br>If an array is sorted in the reverse order then the inversion count is the maximum.&nbsp;<br>Formally, two elements a[i] and a[j] form an inversion if a[i] &gt; a[j] and i &lt; j.</span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: N = 5, arr[] = {2, 4, 1, 3, 5}
<strong>Output</strong>: 3
<strong>Explanation</strong>: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: N = 5
arr[] = {2, 3, 4, 5, 6}
<strong>Output</strong>: 0
<strong>Explanation</strong>: As the sequence is already 
sorted so there is no inversion count.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 3:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: N = 3, arr[] = {10, 10, 10}
<strong>Output</strong>: 0
<strong>Explanation</strong>: As all the elements of array 
are same, so there is no inversion count.</span></pre>
<p><strong><span style="font-size: 18px;">Your Task:<br></span></strong><br><span style="font-size: 18px;">You don't need to read input or print anything. <br>Your task is to complete the function&nbsp;<strong>inversionCount()</strong>&nbsp;which takes the array <strong>arr[]</strong> and the size of the array as inputs and returns the inversion count of the given array.</span><br><br><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(NLogN).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span><br><br><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ N ≤ 5*10<sup>5</sup><br>1 ≤ arr[i]&nbsp;≤ 10<sup>18</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Adobe</code>&nbsp;<code>BankBazaar</code>&nbsp;<code>Myntra</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Divide and Conquer</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;