<h2><a href="https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1?page=1&category=Greedy&status=unsolved&sortBy=submissions">Activity Selection</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given <strong>N</strong>&nbsp;activities with their start and finish day given in array <strong>start[ ]</strong> and <strong>end[ ]</strong>. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a given day.</span><br>
<span style="font-size:18px"><strong>Note :&nbsp;</strong>Duration of the activity includes both starting and ending day.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 2
start[] = {2, 1}
end[] = {2, 2}
<strong>Output: 
</strong>1<strong>
Explanation:</strong>
A person can perform only one of the
given activities.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
start[] = {1, 3, 2, 5}
end[] = {2, 4, 3, 6}
<strong>Output: 
</strong>3<strong>
Explanation:
</strong>A person can perform activities 1, 2
and 4.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task :</strong><br>
You don't need to read input or print anything. Your task is to complete the function <em><strong>activityselection()</strong></em>&nbsp;which takes array&nbsp;<strong>start[ ],</strong>&nbsp;array <strong>end[ ]</strong> and integer&nbsp;<strong>N</strong>&nbsp;as input parameters&nbsp;and returns&nbsp;the maximum number of activities that can be done.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(N * Log(N))<br>
<strong>Expected Auxilliary Space </strong>: O(N)</span><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤&nbsp;2*10<sup>5</sup><br>
1 ≤&nbsp;start[i] ≤&nbsp;end[i] ≤&nbsp;10<sup>9</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Morgan Stanley</code>&nbsp;<code>Facebook</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search</code>&nbsp;<code>Algorithms</code>&nbsp;<code>Greedy</code>&nbsp;