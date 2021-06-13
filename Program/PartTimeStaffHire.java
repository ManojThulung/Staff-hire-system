
public class PartTimeStaffHire extends StaffHire{
    //extends keywords inherits attributes and method from StaffHire class
    
    //instance variables
    //private = access restricted
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //PartTimeStaffHire is a constructor to initialize the newly created objects
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);//super keywords call the all parameter of parent class
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;

    }
    //getter to return the value of variables
    public int getWorkingHour(){
        return workingHour;
    } 

    public int getWagesPerHour(){
        return wagesPerHour;
    }

    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public String getShifts(){
        return shifts;
    }

    public boolean getJoined(){
        return joined;
    }

    public boolean getTerminated(){
        return terminated;
    }
    //setter method for shift to update the staff's shifts
    public void setShfit(String shifts){
        if(joined == true){
            this.shifts = shifts;
        }else{
            System.out.println("The staff is already hired so you can't set new shifts");
        }
    }
    //partTimeStaffHire method hire the staff
    public void partTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == true){
            System.out.println("The staff"+ getStaffName() +"is already appointed on" + joiningDate);
        }else{
            //initialize the loacl variables ot instances variable
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
            terminated = false;
        }
    }
    //setter method to set or update the value of variables
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }

    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }

    public void setJoined(boolean joined){
        this.joined = joined;
    }

    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }
    //terminatedTheStaffHire() method to terminated the staff
    public void terminatedTheStaff(){
        if (terminated == true){
            System.out.println("The staff is already terminated");
        }else{
            staffName = "";
            joiningDate = "";
            qualification = "";
            appointedBy = "";
            joined = false;
            terminated = true;
        }
    }
    //printDetails() method display all the updated values of instance variables
    public void printDetails(){
        super.printDetails();//to call the method printDetails() of parent class
        if ( joined == true){
            System.out.println("Staff name: " + getStaffName());
            System.out.println("Staff's wages per hour: " + getWagesPerHour());
            System.out.println("Staff's working our: " + getWorkingHour());
            System.out.println("Staff's joined date: " + getJoiningDate());
            System.out.println("Staff's qualification: " + getQualification());
            System.out.println("Staff is appointed by: " + getAppointedBy());
            System.out.println("Staff's income per day: " + getWagesPerHour() * getWorkingHour() + "\n");
        }
    }
}