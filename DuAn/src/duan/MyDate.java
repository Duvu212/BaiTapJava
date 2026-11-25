package duan;
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    public MyDate(int year, int month, int day) {
        if (validDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Ngay thang nam khong hop le!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (validDate(this.year, this.month, day)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Ngay khong hop le!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (validDate(this.year, month, this.day)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Thang khong hop le!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (validDate(year, this.month, this.day)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Nam khong hop le!");
        }
    }

    private boolean validDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDays = getMaxDaysInMonth(year, month);
        return day <= maxDays;
    }

    private int getMaxDaysInMonth(int year, int month) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int compareTo(MyDate other) {
        if (this.year != other.year) return Integer.compare(this.year, other.year);
        if (this.month != other.month) return Integer.compare(this.month, other.month);
        return Integer.compare(this.day, other.day);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
