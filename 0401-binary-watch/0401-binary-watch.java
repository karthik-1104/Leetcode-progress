class Solution {
    List<String> res = new ArrayList<>();
    public void backtrack(int turnedOn,int index, int hour, int min){
        if(hour>11 || min>59) return;
        if(turnedOn==0){
            //we shifted all the bits to 0 and reduced turnedOnBits 
            res.add(String.format("%d:%02d",hour,min));
            return;
        }
        for(int i=index;i<10;i++){
            if(i<4)backtrack(turnedOn-1,i+1,hour+(1<<i),min);//hour
            else backtrack(turnedOn-1,i+1,hour,min+(1<<(i-4))); //min
        }
    }
    public List<String> readBinaryWatch(int turnedOn) {
      
        backtrack(turnedOn,0,0,0);
        //leds,indexofBits,hour,min
        return res;
    }
}