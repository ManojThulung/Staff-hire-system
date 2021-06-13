public class StaffHire{

    //instance variables
    //private = access restricted
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //method Staffhire is a constructor to initialize the newly created objects 
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
    //getter to return the value of variables
    public int getVacancyNumber(){
        return vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }

    public String getJobType(){
        return jobType;
    }

    //setter to set the value of variables
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber; 
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setJobType(String jobType){
        this.jobType = jobType;
    }
    //printDetails() method display all the updated values of instance variable
    public void printDetails(){
        System.out.println("Vacancy number: " + getVacancyNumber());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Job type: " + getJobType());
    }
}