import java.util.*;

public class CalenderEx01 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println("Calender Year " + today.get(Calendar.YEAR));
        System.out.println("Calender Month " + today.get(Calendar.MONTH));
        System.out.println("Calender week of year " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Calender week of month " + today.get(Calendar.WEEK_OF_MONTH));
        // DATE and DAY_OF_MONTH is same

        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나눔 (1hour = 60 * 60 second)
        System.out.println("Timezone(-12 ~ +12 : " + today.get(Calendar.ZONE_OFFSET) / (60*60*1000));
        System.out.println("Last day this month : " + today.getActualMaximum(Calendar.DATE));
    }
}