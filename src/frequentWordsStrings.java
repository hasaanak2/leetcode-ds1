import java.util.HashMap;

public class frequentWordsStrings {

    static String smallestFreq(String S1,
                               String S2)
    {
        HashMap<String, Integer> banned = new HashMap<>();

        for (int i = 0; i < S2.length(); i++)
        {
            String s = "";
            while (i < S2.length() &&
                    S2.charAt(i) != ' ')
                s += S2.charAt(i++);

            banned.put(s, banned.get(s) == null ?
                    1 : banned.get(s) + 1);
        }

        HashMap<String,
                Integer> result = new HashMap<>();
        String ans = "";
        int freq = 0;

        for (int i = 0; i < S1.length(); i++)
        {
            String s = "";
            while (i < S1.length() &&
                    S1.charAt(i) != ' ')
                s += S1.charAt(i++);

            if (banned.get(s) == null)
            {
                result.put(s, result.get(s) == null ? 1 :
                        result.get(s) + 1);
                if (result.get(s) > freq ||
                        (result.get(s) == freq &&
                                s.compareTo(ans) < 0))
                {
                    ans = s;
                    freq = result.get(s);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        String S1 = "best place to learn";
        String S2 = "bad place";
        System.out.println(smallestFreq(S1, S2));
    }
}
