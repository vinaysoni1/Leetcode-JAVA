import java.util.List;
class index{
 static String intToRoman(int x) {
      int[] base = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] sym = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
     
        StringBuilder res = new StringBuilder();
       int i = base.length - 1;
        while (x > 0) {
            int div = x / base[i];
            while (div > 0) {
                res.append(sym[i]);
                div--;
            }
            
            // Repeat the process for remainder
            x = x % base[i];
            i--;
        }

        return res.toString();
    }
    public static void main(String[] args) {
         int x = 15533;
        System.out.println(intToRoman(x));
    }
}