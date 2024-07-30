﻿/// <summary>
/// 1929. Concatenation of Array
/// https://leetcode.com/problems/concatenation-of-array
/// 
/// Difficulty Easy
/// Acceptance 90.0%
/// 
/// Array
/// Simulation
/// </summary>
class Solution
{
  public int[] getConcatenation(int[] nums)
  {
    var result = new int[2 * nums.length];

    for (var i = 0; i < nums.length; i++)
    {
      result[i] = nums[i];
      result[i + nums.length] = nums[i];
    }

    return result;
  }
}
