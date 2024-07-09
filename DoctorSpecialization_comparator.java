import java.util.*;

 public class DoctorSpecialization_comparator implements Comparator<Hospital> {
    
    @Override
    public int compare(Hospital o1, Hospital o2) {

        return  o1.getSpecialization().compareTo(o2.getSpecialization());
    }
}
