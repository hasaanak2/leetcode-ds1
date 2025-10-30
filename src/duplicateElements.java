import java.util.Arrays;

public class duplicateElements {

    public static int remove(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        Arrays.sort(a);

        int[] t = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                t[j++] = a[i];
            }
        }

        t[j++] = a[n-1];

        for (int i = 0; i < j; i++) {
            a[i] = t[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
        int n = a.length;

        n = remove(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}