class Solution {
    public boolean checkStraightLine(int[][] c) {
        int x0=c[0][0],y0=c[0][1], 
            x1=c[1][0],y1=c[1][1];
        int dx=x1-x0,dy=y1-y0;
        for (int[]co:c) {
            int x=co[0],y=co[1];
            if (dx*(y-y1)!=dy*(x-x1))
                return false;
        }
        return true;
    }
}