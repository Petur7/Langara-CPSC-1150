import java.util.Scanner;


public class DisplayWeekTempStat {
    public static double average(int[] weekTemp) {
        double sum = 0;
        for (double temp : weekTemp)
            sum += temp;
        return sum/weekTemp.length;
    }

    public static int max(int[] weekTemp) {
        int max = weekTemp[0];
        for (int temp : weekTemp) 
            if (temp > max) max = temp;
        return max;
    }


    public static int min(int[] weekTemp) {
        int min = weekTemp[0];
        for (int temp : weekTemp) 
            if (temp < min) min = temp;
        return min;
    }


    public static int[] searchTemp(int[] weekTemp, int temp) {
        int[] found = new int[weekTemp.length];
        for (int i=0; i < weekTemp.length; i++) {
            if (weekTemp[i] == temp) {
                found[i] = 1;
            }
        }
        return found;
    }


    public static String getDay(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid day";
        }
    }


    public static String getDayList(int[] days) {
        String dayList = "";
        for (int i=0; i < days.length; i++) {
            if (days[i] == 1) {
                if (dayList.length() > 0) dayList += ", ";
                dayList += getDay(i);
            }
        }
        return dayList;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] weekTemp = new int[7];
        System.out.println("Please enter the highest temperature for each day of the week (start with Sunday):");
        for (int i = 0; i < 7; i++) {
            weekTemp[i] = input.nextInt();
        }

        System.out.printf("The average temperature is %.2f\n", average(weekTemp));
        System.out.println("The highest temperature is " + max(weekTemp));
        System.out.println("The lowest temperature is " + min(weekTemp));

        int[] hottestDays = searchTemp(weekTemp, max(weekTemp));
        System.out.println("The hottest days are " + getDayList(hottestDays));
        
        int[] coldestDays = searchTemp(weekTemp, min(weekTemp));
        System.out.println("The coldest days are " + getDayList(coldestDays));
    }
}
