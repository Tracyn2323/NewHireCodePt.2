import java.util.*;

public class FacilityCoordinator {

    public String scheduleTourDate;

    public String scheduleTourDate(String firstDayInOffice) {
        this.scheduleTourDate = firstDayInOffice;
        return this.scheduleTourDate;
    }
    public void createBadgeAccess(NewHire newHire1) {
        newHire1.grantBadgeAccess = true;
    }
}
