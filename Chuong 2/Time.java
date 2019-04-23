
class Time {
    public static void main(String[] args) {
        Integer hour = 12;
        Integer minute = 30;
        Integer second = 0;
        Integer totalSecondInADay = 24 * 60 * 60;

        Integer totalTimeSinceMidnightInSecond = hour * 60 * 60 + minute * 60 + second;
        System.out.println(totalTimeSinceMidnightInSecond + " second");

        Integer remainingDayInSecond = totalSecondInADay - totalTimeSinceMidnightInSecond;
        System.out.println(remainingDayInSecond + " second");

        
        Double passedDayPercentage = 100 * (double)totalTimeSinceMidnightInSecond / (double)totalSecondInADay;
        
        System.out.println(passedDayPercentage + " %");

    }
}