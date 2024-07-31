
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;

    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1]; }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] =birdsPerDay[birdsPerDay.length-1]+1 ;

    }

    public boolean hasDayWithoutBirds() {
        for(int el:birdsPerDay){
            if(el==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        int count =0;
        for(int el:birdsPerDay){
            if(count == numberOfDays) break;
            sum+=el;count++;
        }
        return sum;

    }

    public int getBusyDays() {

        int count =0;
        for(int el:birdsPerDay){
            if(el>=5)count++;
        }
        return count;


    }
}
