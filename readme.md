>recently,I find myself clumsy (╯`□′)╯(┻━┻.  
So I decide to do some practice to evoke my intellect.  
Ok,let's get it on~  

>ps:forgive my poor English plz :)  

#Catalogue:

##day1

This algorithm is about to calculate the sum of a arithmetic progression  
without:"for","while","if","else","switch","case" and any else control  
statement.  

##day2

The problem is:  
There is a positive integer,I'm about to calculate the least steps  
to change it to 1.  
Step means:  
If this number is even number,just divide it by 2.This is ONE step.  
If this number is odd number,minus one or plus one.This is ONE step.  

##day3

The question is:
There is n balls and m baskets,I want to put the balls into the baskets.  
The algorithm returns the count of the distribution.  
ps:empty basket is allowed.  

##day4

The question is:  
There is a frog wants to jump to the top of the steps,the total number of  
the stairs is n(user input),and the frog can jump m(user input) stairs in  
one time.
How many ways can the frog reach the top?  

##day5

The question is:  
Calculate the preorder traverse of a binary tree according to the inorder  
traverse and the postorder traverse.(every node in the binary tree is different)  

##day6

Today,I want to learn something about sort algorithm,it's basic and absolutely important.  
The first sort I learn is merge sort.INTERESTING!~  

##day7

I learned insert sort,shell sort,select sort today,and also implement them in day6's code.  
I will implement all common sort methods in the near future.  

##day8

Today,I will realize the most useful sort algorithm:Heap sort & Quick sort!Quick sort is known  
as the top ten algorithm during the decade.EXCITING!~＞ω＜(code is merged in day6's project.)

##day9

The question is:  
 Input:a single linked list,a number k  
 Output:the value of No.k node in reverse order.(the last node is No.0 node in reverse order)  

##day10

The question is:  
Given a string, determine if it is a palindrome,considering only alphanumeric characters and ignoring cases.  
Number is not allowed.  
For example:  
 "A man, a plan, a canal: Panama" is a palindrome.  
 "race a car" is not a palindrome.  

##day11

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist,  
return the maximum number. The time complexity must be in O(n).  
 
Example 1:  
 Input: [3, 2, 1]  
 Output: 1  
 Explanation: The third maximum is 1.
 
Example 2:  
 Input: [1, 2]  
 Output: 2  
 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:  
 Input: [2, 2, 3, 1]  
 Output: 1  
 Explanation: Note that the third maximum here means the third maximum distinct number.  
 Both numbers with value 2 are both considered as second maximum.  

##day12

Here is the question:  
Compare two version numbers version1 and version2.  
If version1 > version2 return 1, if version1 < 
version2 return -1, otherwise return 0.  

You may assume that the version strings are non-empty and contain only digits and the . character.  
The . character does not represent a decimal point and is used to separate number sequences.  
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level  
revision of the second first-level revision.  

Here is an example of version numbers ordering:  
0.1 < 1.1 < 1.2 < 13.37  

##day13

The question is:  
The string "PAYPALISHIRING" is written in a zigzag patternon a given number of rows like this:  
(you may want to display this pattern in a fixed font for better legibility)  
P_A_H_N  
APLSIIG  
Y_I_R  
(_means space)
And then read line by line:  
"PAHNAPLSIIGYIR" Write the code that will take a string and make this conversion given a number of rows:  
 
string convert(string text, int nRows);  
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".  

##day14

The question is:  
Write a function that takes a string as input and reverse only the vowels of a string.  

Example 1:  
Given s = "hello", return "holle".  

Example 2:  
Given s = "leetcode", return "leotcede".  

##day15

Verify Preorder Serialization of a Binary Tree
Difficulty: Medium

One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node,  
we record the node's value. If it is a null node, we record using a sentinel value such as #.  

For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#",  
where # represents a null node.Given a string of comma separated values, verify whether it is a correct  
preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.  

Each comma separated value in the string must be either an integer or a character '#' representing null pointer.  

You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".  

Example 1:  
"9,3,4,#,#,1,#,#,2,#,6,#,#"  
Return true  

Example 2:  
"1,#"  
Return false  

Example 3:  
"9,#,#,1"  
Return false  

##day16

The question is:  
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).  
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,which together  
with x-axis forms a container, such that the container contains the most water.  

Note: You may not slant the container.  

##day17

The question is:  
Given two binary strings, return their sum (also a binary string).
For example:  
a = "11"  
b = "1"  
Return "100".  

##day18

The question is:  
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',determine if the input string is valid.The   
brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.  

##day19

The question is:  
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.  
If the last word does not exist, return 0.  

Note: A word is defined as a character sequence consists of non-space characters only.  
For example:  
Given s = "Hello World"  
return 5.  

##day20

The question is:  
Implement atoi to convert a string to an integer.  

Hint: Carefully consider all possible input cases. If you want a challenge,  
please do not see below and ask yourself what are the possible input cases.  
Notes: It is intended for this problem to be specified vaguely  
(ie, no given input specs). You are responsible to gather all the input  
requirements up front.  

Requirements for atoi:  
The function first discards as many whitespace characters as necessary until the  
first non-whitespace character is found. Then, starting from this character, takes  
an optional initial plus or minus sign followed by as many numerical digits as possible,  
and interprets them as a numerical value.The string can contain additional characters  
after those that form the integral number, which are ignored and have no effect on the  
behavior of this function.If the first sequence of non-whitespace characters in str is  
not a valid integral number, or if no such sequence exists because either str is empty  
or it contains only whitespace characters, no conversion is performed.  

If no valid conversion could be performed, a zero value is returned. If the correct value  
is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648)  
is returned.  

##day21

The count-and-say sequence is the sequence of integers beginning as follows:  
1, 11, 21, 1211, 111221, ...  

1 is read off as "one 1" or 11.  
11 is read off as "two 1s" or 21.  
21 is read off as "one 2, then one 1" or 1211.  
Given an integer n, generate the nth sequence.  
Note: The sequence of integers will be represented as a string.  

Input:index of target String  
Output:target String  

