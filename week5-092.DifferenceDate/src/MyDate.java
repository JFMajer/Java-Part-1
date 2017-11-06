
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        if (MyDate.this.year > comparedDate.year) {
            if (MyDate.this.month < comparedDate.month) {
                return MyDate.this.year - comparedDate.year - 1;
            } else if (MyDate.this.month > comparedDate.month) {
                return MyDate.this.year - comparedDate.year;
            } else if (MyDate.this.month == comparedDate.month) {
                if (MyDate.this.day >= comparedDate.day) {
                    return MyDate.this.year - comparedDate.year;
                } else if (MyDate.this.day < comparedDate.day) {
                    return MyDate.this.year - comparedDate.year - 1;
                }
            }
        } else if (MyDate.this.year < comparedDate.year) {
            if (MyDate.this.month > comparedDate.month) {
                return Math.abs(MyDate.this.year - comparedDate.year) - 1;
            } else if (MyDate.this.month < comparedDate.month) {
                return Math.abs(MyDate.this.year - comparedDate.year);
            } else if (MyDate.this.month == comparedDate.month) {
                if (MyDate.this.day > comparedDate.day) {
                   return Math.abs(MyDate.this.year - comparedDate.year)-1;
                } else if (MyDate.this.day < comparedDate.day) {
                    return Math.abs(MyDate.this.year - comparedDate.year);
                } else if (MyDate.this.day == comparedDate.day) {
                    return Math.abs(MyDate.this.year - comparedDate.year);
                }
            }
        } else if (MyDate.this.year == comparedDate.year && MyDate.this.month == comparedDate.month && MyDate.this.day == comparedDate.day) {
            return 0;
        }
        return 9999;
    }

}
