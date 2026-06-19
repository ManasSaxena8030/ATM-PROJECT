// public class arrayprac {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 5, 2, 3 };
//         int unique = 0;
//         for (int i = 0; i < arr.length; i++) {
//             unique ^= arr[i];
//         }
//         System.out.println(unique);
//     }

// }

// public class arrayprac {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 5, 4, 6 };

//         boolean sorted = true;
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 sorted = false;
//                 break;
//             }
//         }
//         System.out.println(sorted);
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {

//         int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
//         int even = 0, odd = 0;
//         // for each loop use
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0)
//                 even++;
//             else
//                 odd++;
//         }

//         System.out.println("Even = " + even);
//         System.out.println("Odd = " + odd);
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {

//         String sentence = "We love Coding";
//         String[] words = sentence.split(" ");

//         for (int i = words.length - 1; i >= 0; i--) {
//             System.out.print(words[i] + " ");
//         }
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {

//         int[] arr = { 2, 4, 5, 7, 2, 4 };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.print(" Duplicate = " + arr[i]);
//                 }
//             }
//         }
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {
//         String str = "a1b2c3";
//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c >= '0' && c <= '9')
//                 sum += c - '0';
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Arrays;

// public class arrayprac {
//     public static void main(String[] args) {
//         int[] a = { 0, 2, 3, 4, 5, 7, 0, 9, 8 };
//         int position = 0;

//         for (int i = 0; i < a.length; i++) {
//             if (a[i] != 0) {
//                 a[position++] = a[i];
//             }
//         }
//         while (position < a.length) {
//             a[position++] = 0;
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {

//         int[] a = { 0, 2, 3, 4, 5, 7, 0, 9, 8 };
//         boolean[] isvisited = new boolean[a.length];
//         for (int i = 0; i < a.length; i++) {
//             if (isvisited[i])
//                 continue;
//             int count = 0;
//             for (int j = i; j < a.length; j++) {
//                 if (a[i] == a[j]) {
//                     isvisited[j] = true;
//                     count++;
//                 }
//             }
//             System.out.println(a[i] + " count " + count);
//         }
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {

//         int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

//         int total = 10 * (10 + 1) / 2;
//         int sum = 0;
//         for (int i = 0; i < a.length; i++)
//             sum += a[i];
//         System.out.println(total - sum);
//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         for (int i : a) {
//             boolean prime = true;
//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     prime = false;
//                     break;
//                 }
//             }
//             if (prime && i > 1)
//                 System.out.println(i + " ");

//         }

//     }
// }

// public class arrayprac {
//     public static void main(String[] args) {
//         String sentence = "java makes programming powerful";
//         String[] words = sentence.split(" ");
//         String longest = words[0];

//         for (int i = 0; i < words.length; i++) {
//             if (words[i].length() > longest.length()) {
//                 longest = words[i];
//             }
//         }
//         System.out.println(longest);
//     }
// }
import java.util.Arrays;

public class arrayprac {
    public static void main(String[] args) {

        // int[] a = { 3, 4, 9, 5, 1 };
        // int target = 6;
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[i] + a[j] == target) {
        // System.out.println(i + " " + j);
        // }
        // }
        // }

        // int[] a = { 3, 4, 9, 5, 1 };
        // int last = a[a.length - 1];
        // for (int i = a.length - 1; i > 0; i--)
        // a[i] = a[i - 1];
        // a[0] = last;
        // System.out.println(Arrays.toString(a));

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 3, 4, 5, 6, 7 };
        for (int x : a) {
            for (int y : b) {
                if (x == y)
                    System.out.println(x + " ");
            }
        }

    }
}