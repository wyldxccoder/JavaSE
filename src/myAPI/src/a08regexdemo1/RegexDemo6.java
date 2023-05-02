package a08regexdemo1;
//s.replaceAll  替换    s.split   剪切
public class RegexDemo6 {
    public static void main(String[] args) {
        String s="畅畅dhuwhduwhaudhwau4545龙龙";
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
