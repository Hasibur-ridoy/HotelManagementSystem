public class Staff {

    private int staffID;
    private String staffName;
    private String jobTitle;

    //constructor
    public Staff(int staffID, String staffName, String jobTitle){
        this.staffID = staffID;
        this.staffName = staffName;
        this.jobTitle = jobTitle;
    }

    public int getStaffID() {return staffID;}

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {return staffName;}

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getJobTitle() {return jobTitle;}

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // method to manipulate
    public void displayStaffDetails(){
        System.out.println("Staff ID: " + staffID);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Job Title: " + jobTitle);
    }
}
