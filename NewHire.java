import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class NewHire {
    public String newHireName;
    public double deskAssigned;
    public String firstDayInOffice;
    public boolean grantBadgeAccess;

    public NewHire (
            String newHireName,
            String firstDayInOffice) {
        this.newHireName = newHireName;
        this.firstDayInOffice = firstDayInOffice;
        this.grantBadgeAccess = false;
    }

    public String getFirstDayInOffice() {
        return this.firstDayInOffice;
    }
    public boolean doesThisNewHireHaveBadgeAccess() {
        return this.grantBadgeAccess;
    }
}
