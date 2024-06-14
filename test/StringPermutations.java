package com.demo.test;
public class StringPermutations {

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }

    public static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix); // Print the permutation when str is empty
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
            }
        }
    }
}

/*
Dry Run:
-----------
Initial call: permute("ABC", "")

1. i = 0
   str = "ABC"
   prefix = ""
   char = 'A'
   New call: permute("BC", "A")

   2. i = 0
      str = "BC"
      prefix = "A"
      char = 'B'
      New call: permute("C", "AB")

      3. i = 0
         str = "C"
         prefix = "AB"
         char = 'C'
         New call: permute("", "ABC")
         str is empty, print: "ABC"

      3. i = 1
         str = "C"
         prefix = "AB"
         char = 'C'
         New call: permute("", "ACB")
         str is empty, print: "ACB"

   2. i = 1
      str = "BC"
      prefix = "A"
      char = 'C'
      New call: permute("B", "AC")

      3. i = 0
         str = "B"
         prefix = "AC"
         char = 'B'
         New call: permute("", "ACB")
         str is empty, print: "ACB" (already printed, skipped)

      3. i = 1
         str = "B"
         prefix = "AC"
         char = 'B'
         New call: permute("", "ACB")
         str is empty, print: "ACB" (already printed, skipped)

1. i = 1
   str = "ABC"
   prefix = ""
   char = 'B'
   New call: permute("AC", "B")

   2. i = 0
      str = "AC"
      prefix = "B"
      char = 'A'
      New call: permute("C", "BA")

      3. i = 0
         str = "C"
         prefix = "BA"
         char = 'C'
         New call: permute("", "BAC")
         str is empty, print: "BAC"

      3. i = 1
         str = "C"
         prefix = "BA"
         char = 'C'
         New call: permute("", "BCA")
         str is empty, print: "BCA"

   2. i = 1
      str = "AC"
      prefix = "B"
      char = 'C'
      New call: permute("A", "BC")

      3. i = 0
         str = "A"
         prefix = "BC"
         char = 'A'
         New call: permute("", "BCA")
         str is empty, print: "BCA" (already printed, skipped)

1. i = 2
   str = "ABC"
   prefix = ""
   char = 'C'
   New call: permute("AB", "C")

   2. i = 0
      str = "AB"
      prefix = "C"
      char = 'A'
      New call: permute("B", "CA")

      3. i = 0
         str = "B"
         prefix = "CA"
         char = 'B'
         New call: permute("", "CAB")
         str is empty, print: "CAB"

      3. i = 1
         str = "B"
         prefix = "CA"
         char = 'B'
         New call: permute("", "CBA")
         str is empty, print: "CBA"

   2. i = 1
      str = "AB"
      prefix = "C"
      char = 'B'
      New call: permute("A", "CB")

      3. i = 0
         str = "A"
         prefix = "CB"
         char = 'A'
         New call: permute("", "CBA")
         str is empty, print: "CBA" (already printed, skipped)

Output:
ABC
ACB
BAC
BCA
CAB
CBA
*/

