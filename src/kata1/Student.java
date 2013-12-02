package kata1;

// Ctrl+E borrar linea completa
// Ctrl+Shift tecla abajo
// Ctrl+W Cerrar pestaña

import java.util.Date;

public class Student {
    private final static double DAYS_PER_YEAR=365.25;
    private final static long HOURS_PER_YEAR=(long)(24*DAYS_PER_YEAR);
    private final static long MINUTES_PER_YEAR=60*HOURS_PER_YEAR;
    private final static long SECONDS_PER_YEAR=60*MINUTES_PER_YEAR;
    private final static long MILLISECONDS_PER_YEAR=1000*SECONDS_PER_YEAR;

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