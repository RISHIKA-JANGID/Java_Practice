public class stack {
    public class Main {
    public static boolean check(String s) {
        int countA = 0, countB = 0;
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == 'a') {
            countA++;
            i++;
        }

        while (i < n && s.charAt(i) == 'b') {
            countB++;
            i++;
        }

        return (i == n && countA == countB && countA > 0);
    }

    public static void main(String[] args) {
        System.out.println(check("aabb"));   // true
        System.out.println(check("aaabbb")); // true
        System.out.println(check("aab"));    // false
        System.out.println(check("abba"));   // false
    }
}
    
}
