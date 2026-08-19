class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp=new double[2];
        double K=celsius+273.15;
        double F=celsius*1.80+32.00;
        temp[0]=K;
        temp[1]=F;
        return temp;
    }
}