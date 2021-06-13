public class FullTimeStaffHire extends StaffHire{
    //extends keywords inherits attributes and method from StaffHire class

    //instance variables
    //private = access restricted
    private int salary;
    private int  workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //method FulltimeStaffHire is a constructor to initialize the newly created objects
    public FullTimeStaffHire(int vacancyNumber,String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType); //super keywords call the all parameter of parent class
        this.salary = salary;
        this.workingHour = workingHour;
        staffName = "";
        joiningDate = ""; 
        qualification = "";
        appointedBy = "";
        joined = false;
    }
    //getter to return the value of variables
    public int getSalary(){
        return salary;
    }
    
    public int getWorkingHour(){
        return workingHour;
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

    public boolean getJoined(){
        return joined;
    }

    //setter method for salary to update the salary
    public void setSalary(int salary){

        if (joined == false){   
            this.salary = salary;
        }else{
            System.out.println("The staff is not appointed so it is not possible to change the salary");
        }
    }
    //setter method to set or update the value of variables
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
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
    //fullTimeStaffHire method hire the staff 
    public void fullTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == true){
            System.out.println("The staff" + getStaffName() + "is already appointed on" + getJoiningDate());
        }else{
            //initialize the loacl variables ot instances variable
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
        }
    }
    //printDetails() method display all the updated values of instance variables
    public void printDetails(){
        super.printDetails();//to call the method printDetails of parent class
        if(joined == true){
            System.out.println("Staff name: " + getStaffName());
            System.out.println("Salary of staff: " + getSalary());
            System.out.println("Staff's working hour: " + getWorkingHour());
            System.out.println("Staff's joined date: " + getJoiningDate());
            System.out.println("Staff's Qualification: " + getQualification());
            System.out.println("Staff appointed by: " + getAppointedBy() + "\n");
        }
    }
}