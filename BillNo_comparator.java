import java.util.*;

public class BillNo_comparator implements Comparator<Hospital> {

    @Override
    public int compare(Hospital o1, Hospital o2) {

        return o1.getBill_no()-o2.getBill_no();
    }
    
}
