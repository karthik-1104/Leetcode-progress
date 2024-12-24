class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

       
        Arrays.sort(c);

        int len = c.length;

       
        if (len % 2 == 0)
            return (c[len / 2] + c[len / 2 - 1]) / 2.0;

       
        else
            return c[len / 2];
    }
}