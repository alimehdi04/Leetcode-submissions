import java.util.HashMap;

class Solution {
    static HashMap<Integer, String> below10 = new HashMap<>();
    static HashMap<Integer, String> below100 = new HashMap<>();
    static HashMap<Integer, String> below20 = new HashMap<>();

    static {
        below10.put(0, "");
        below10.put(1, "One");
        below10.put(2, "Two");
        below10.put(3, "Three");
        below10.put(4, "Four");
        below10.put(5, "Five");
        below10.put(6, "Six");
        below10.put(7, "Seven");
        below10.put(8, "Eight");
        below10.put(9, "Nine");

        below100.put(0, "");
        below100.put(2, "Twenty");
        below100.put(3, "Thirty");
        below100.put(4, "Forty");
        below100.put(5, "Fifty");
        below100.put(6, "Sixty");
        below100.put(7, "Seventy");
        below100.put(8, "Eighty");
        below100.put(9, "Ninety");

        below20.put(10, "Ten");
        below20.put(11, "Eleven");
        below20.put(12, "Twelve");
        below20.put(13, "Thirteen");
        below20.put(14, "Fourteen");
        below20.put(15, "Fifteen");
        below20.put(16, "Sixteen");
        below20.put(17, "Seventeen");
        below20.put(18, "Eighteen");
        below20.put(19, "Nineteen");
    }

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        return solve(num);
    }

    public String solve(int num) {
        if (num < 10)
            return below10.get(num);
        else if (num < 20)
            return below20.get(num);
        else if (num < 100)
            return below100.get(num / 10) + ((num % 10 != 0) ? " " + below10.get(num % 10) : "");
        else if (num < 1000)
            return solve(num / 100) + " Hundred" + ((num % 100 != 0) ? " " + solve(num % 100) : "");
        else if (num < 1000000)
            return solve(num / 1000) + " Thousand" + ((num % 1000 != 0) ? " " + solve(num % 1000) : "");
        else if (num < 1000000000)
            return solve(num / 1000000) + " Million" + ((num % 1000000 != 0) ? " " + solve(num % 1000000) : "");
        else
            return solve(num / 1000000000) + " Billion" + ((num % 1000000000 != 0) ? " " + solve(num % 1000000000) : "");
    }
}
