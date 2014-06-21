package resume;

/**
 * Created by 1 on 21.06.2014.
 */
public class Date {

    short year;
    byte month;

    public Date(short year, byte month) {
        this.year = year;
        this.month = month;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }
}
