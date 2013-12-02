package kata1;

import java.util.Date;

public class Student {

    private String name;
    private Date birthDate;
    
    public Student(String name, Date birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    
    public String name(){
        return name;
    }
    
    public Date getBirthDate(){
        return birthDate;
    }
 
    public int getAge(){
        Date today=new Date();
        long millisecondsFromBirthDate= today.getTime()-birthDate.getTime();
        return millisecondsPerYear(millisecondsFromBirthDate);
    }
    
    public int millisecondsPerYear(long millisecondsFromBirthDate){
        return (int) (millisecondsFromBirthDate / (365.25 * 24 * 60 * 60 * 1000));        
    }
}