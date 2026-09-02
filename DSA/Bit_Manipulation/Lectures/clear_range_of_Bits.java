// Basic Algorithm and Explanation
/*
  Clear a range of bits from position i to j.
 
  Example:
  num = 100111010011
  i = 2, j = 7
 
  Bits 2 to 7 are cleared:
 
  100111010011
 *    ↓↓↓↓↓↓
  100100000011
 
  Result = 2307
 
 * Approach:
  1. Create a mask with 0s from bit i to j.
  2. Keep all other bits as 1.
  3. Perform AND (&) with the number.

  Formula:
  a = (~0) << (j + 1)
  b = (1 << i) - 1
  bitMask = a | b
  result = num & bitMask
*/

import java.util.*;
public class clear_range_of_Bits{
    public static int clear_rangeBits(int num, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clear_rangeBits(2495, 2, 4));
    }
}