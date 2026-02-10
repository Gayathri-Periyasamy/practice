import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String d = LocalDate.of(year, month, day).getDayOfWeek().toString();
        return d.charAt(0) + d.substring(1).toLowerCase();
    }
}
