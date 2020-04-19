import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        NewHire firstNewHire = new NewHire("Jesse Pinkman", "April 1, 2020");

        Manager walterWhite = new Manager();

        FacilityCoordinator tracyNguyen = new FacilityCoordinator();

        String jessePinkManTourDate = tracyNguyen.scheduleTourDate(firstNewHire.getFirstDayInOffice());

        double jessePinkmanDeskNumber = firstNewHire.deskAssigned = walterWhite.getAvailableDesk();
        String deskNumber = "Desk number: ";

        System.out.println(firstNewHire.newHireName);

        System.out.println(jessePinkManTourDate);

        System.out.println(deskNumber + jessePinkmanDeskNumber);

        if (firstNewHire.doesThisNewHireHaveBadgeAccess() == false) {
            tracyNguyen.createBadgeAccess(firstNewHire);
        }
        String badgeAccessGranted = "Does New Hire have badge access? ";
        System.out.println(badgeAccessGranted + firstNewHire.grantBadgeAccess);

        NewHire secondNewHire = new NewHire("Jim Halpert", "April 6, 2020");


        FacilityCoordinator pamBeesly = new FacilityCoordinator();

        String jimHalpertTourDate = pamBeesly.scheduleTourDate(firstNewHire.getFirstDayInOffice());

        System.out.println(secondNewHire.newHireName);
        System.out.println(jimHalpertTourDate);

        double jimHalpertDeskNumber = secondNewHire.deskAssigned = walterWhite.getAvailableDesk();
        System.out.println(deskNumber + jimHalpertDeskNumber);

        if (secondNewHire.doesThisNewHireHaveBadgeAccess() == false) {
            pamBeesly.createBadgeAccess(secondNewHire);

            System.out.println(badgeAccessGranted + secondNewHire.grantBadgeAccess);


        }
    }
}
