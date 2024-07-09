import java.util.*;

public class DoctorName_comparator implements Comparator<Hospital> {

    @Override
    public int compare(Hospital o1, Hospital o2) {
        return o1.getDoctor_name().compareTo(o2.getDoctor_name());
    }
    
}
