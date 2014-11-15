Link: [http://www.careercup.com/question?id=56605](http://www.careercup.com/question?id=56605)

**Problem Statement:** Given an 2D plane, suppose that there are around 6000 points on it. Find a line which passes the most number of points.

**Solution:** The problem has an $O(N^2)$ solution: go through each point and find the number of points which have the same $dx / dy$ with relation to the current point. Store $dx / dy$ relations in a hash map for efficiency.

**PS:** You can get more information through the following links.
+ [http://stackoverflow.com/questions/4179581/what-is-the-most-efficient-algorithm-to-find-a-straight-line-that-goes-through-m](http://stackoverflow.com/questions/4179581/what-is-the-most-efficient-algorithm-to-find-a-straight-line-that-goes-through-m)
+ [http://stackoverflow.com/questions/2734301/given-a-set-of-points-find-if-any-of-the-three-points-are-collinear](http://stackoverflow.com/questions/2734301/given-a-set-of-points-find-if-any-of-the-three-points-are-collinear)
