import java.util.*;

public class BillAmount_comparator implements Comparator<Hospital>{

    @Override
    public int compare(Hospital o1, Hospital o2) {
        return Double.compare(o1.getBill_ammount(),o2.getBill_ammount());
    }   
}
