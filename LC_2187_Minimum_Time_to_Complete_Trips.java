public class LC_2187_Minimum_Time_to_Complete_Trips {
    public long minimumTime(int[] time, int totalTrips){
        long left = 1;
        long min = time[0];
        for(int t : time){
            min = Math.min(min, t);
        }
        long right = totalTrips * min;
        while(left < right){
            long mid = left + (right - left) / 2;
            // How many trip we can do
            long total = totalTripInGivenTime(time, mid);
            // We can not reach totalTrips, means mid is too small 
            if(total < totalTrips){
                left = mid + 1;
            }
            else{
                right = mid;
            }
            // We can reach totalTrips, but we want right to be as small as possible
            // Therefore, we don't need to + 1
        }
        return left;
    }
    private long totalTripInGivenTime(int[] time, long givenTime){
        long totalTrips = 0l;
        for(int tripTime : time){
            totalTrips += ((long)givenTime) / tripTime;
        }
        return totalTrips;
    }
}
