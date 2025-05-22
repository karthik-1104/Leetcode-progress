class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int maxWeight=getMaxWeight(weights);
        int sum=getSumOfWeights(weights);

        int low=maxWeight,high=sum;

        while(low<high){
            int mid=low+(high-low)/2;

            if(canShip(weights,days,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }

        return low;
    }

    public static boolean canShip(int[] weights,int days,int capacity){

        int currentLoad=0;
        int daysRequired=1;

        for(int weight:weights){

            if(currentLoad+weight>capacity){
                daysRequired++;
                currentLoad=0;
            }

            currentLoad+=weight;
        }

        if(daysRequired<=days)return true;

        return false;
    }

    public static int getMaxWeight(int[] weights){
        int maxWeight=weights[0];
        for(int weight: weights){
            maxWeight=Math.max(weight,maxWeight);
        }

        return maxWeight;
    }

    public static int getSumOfWeights(int[] weights){
        int sum=0;

        for(int weight: weights){
            sum+=weight;
        }

        return sum;
    }
}