import java.util.*;;

public class PatientName_comparator implements Comparator<Hospital> {
    
    @Override
    public int compare(Hospital o1, Hospital o2) {

        return o1.getPatient_name().compareTo(o2.getPatient_name());
        
        // To 
    }
}
