import java.util.*;

public class PatientNo_comparator implements Comparator<Hospital> {
    
    @Override
    public int compare(Hospital o1, Hospital o2) {

        return o1.getPatient_no() -o2.getPatient_no();
    }
}
