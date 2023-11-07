public class Application {

    //DATA MEMEBETS IN THE APPLICATION CLASS 
    String userName;
    boolean accountType;
    int userID;
    int followers;
    int following;
    String contentType;
    boolean accountMonitized;
    String dateOfBirth;


    // CONSTRUCTOR DECLARATION - DEFAULT CONSTRUCTOR IN ACTION 
    public Application () {
    }

    //CONSTRUCTOR DECLARATION  - PARAMETERIZED CONSTRUCTOR IN ACTION
    public Application( String userName, boolean accountType, int userID, int followers, int following, String dateOfBirth )  {
        this.userID = userID;
        this.accountType = accountType;
        this.userName = userName;
        this.followers = followers;
        this.following = following;
        this.dateOfBirth = dateOfBirth;
    }

    //CONSTRUCTOR DECLARATION - OVERLOADING IN ACTION 
    public Application ( String contentType ) {
        this.contentType = contentType;
    }

    //CONSTRUCTOR DECLARATION - OVERLOADING IN ACTION 
    public Application ( boolean accountMonitized ) {
        this.accountMonitized = accountMonitized;
    }

    // METHOD -  DISPLAY ALL OF THE DATA 
    public void getUserDetails() {
        System.out.println("---------- -> " + userID + " <- ----------");
        System.out.println("USERNAME -> " + userName);
        System.out.println("THE USERID -> " + userID);
        System.out.println("THE DATE OF BIRTH -> " + dateOfBirth);
        System.out.println("ACCOUNTTYPE OPEN -> " + accountType);
        System.out.println("ACCOUNT FOLLOWERS -> " + followers);
        System.out.println("ACCOUNT FOLLOWING -> " + following);
        System.out.println("CONTENTTYPE -> " + contentType);
        System.out.println("ACCOUNT MONITIZED -> " + accountMonitized);
        System.out.println("-----------------------------------");

    }

    // METHOD - DYNAMIC FOLLOWERS 
    public void updateFollowers( int count , boolean type ) {
        System.out.println("---------- -> " + userID + " <- ----------");
        if ( type == true ) {
            System.out.println("UPDATED FOLLOWERS OF " + userName + " IS -> " + (followers + count));
        } else {
            System.out.println("UPDATED FOLLOWERS OF " + userName + " IS -> " + (followers - count));
        }
        System.out.println("-----------------------------------------");
    }

    // METHOD - DYNAMIC FOLLOWING 
    public void updateFollowing ( int count, boolean type ) {
        System.out.println("---------- -> " + userID + " <- ----------");
        if ( type == true ) {
            System.out.println("UPDATED FOLLOWING OF " + userID + " IS -> " + (following + count));
        } else {
            System.out.println("UPDATED FOLLOWING OF " + userID + " IS -> " + (following - count));
        }
        System.out.println("-----------------------------------------");
    }
    

    //METHOD OVERLOADING 
    public void getData ( int userID ) {
        System.out.println("THE USER NAME FOR THE FOLLOWING USER ID  ->" + userName);
    }

    public void getData ( String userName ) {
        System.out.println("THE USER DATE OF BIRTH FOR THE FOLLOWING USERNAME -> " + dateOfBirth);
    }

    public void getData ( boolean accountMonitized, int followers) {
        if ( followers > 200 ) {
            System.out.println("THE ACCOUNT IS MONITIZED");
        } else {
            System.out.println("THE ACCOUNT IS NOT MONITIZED");
        }
    }

    public static void main(String[] args) throws Exception {

        //CREATING USERS OF THE CLASS APPLICATION 
        // USER - A 
        Application userA = new Application("hello@Subham100", true, 123456789, 455, 900, "15-11-2002");
        userA.contentType = "PERSONAL";
        userA.accountMonitized = true;

        // USER - B 
        Application userB = new Application();

        // COMMON METHOD CALLING 
        userA.getUserDetails();
        userB.getUserDetails();

        // UPDATING FOLLOWERS FOR USER A
        userA.updateFollowers(56, false);
        userA.updateFollowing(78, true);

    }
}
