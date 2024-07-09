import java.util.*;

public class Hospital_dataList {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Hospital> list = new LinkedList<Hospital>();
        list.add(new Hospital(1, "Bhushan", "Sagar", "Ophthalmology:", 1010, 5000));
        list.add(new Hospital(8, "Riddhesh", "Hrishikesh", "Cardiology:", 1019, 9000));
        list.add(new Hospital(4, "Mahesh", "Rohan", "Endocrinology:", 1005, 400));
        list.add(new Hospital(3, "Rahul", "Parag", "Gastroenterology:", 1008, 8000));
        list.add(new Hospital(7, "MahedraSingh", "Virat", "Oncology:", 1003, 700));
        list.add(new Hospital(2, "Dhoni", "Gambhir", "EkChackaNeWorldcup:", 10101, 1100));

        // Decending Order Sorting

        // System.out.println(list.toString());

        System.out.println("Decending Order Sorting");
        System.out.println("====================================================================================");
        System.out.println("sorted by patient number in decending order");
        System.out.println();
        Collections.sort(list, new PatientNo_comparator());
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by patient Name in decending order");
        System.out.println();
        Collections.sort(list, new PatientName_comparator());
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Doctor name in decending order");
        System.out.println();
        Collections.sort(list, new DoctorName_comparator());
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Specialization in decending order");
        System.out.println();
        Collections.sort(list, new DoctorSpecialization_comparator());
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Bill Id in decending order");
        System.out.println();
        Collections.sort(list, new BillNo_comparator());
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Bill Amount in decending order");
        System.out.println();
        Collections.sort(list, new BillAmount_comparator());
        PrintTable(list);
        Thread.sleep(3000);

        // Ascending order

        
        System.out.println("====================================================================================");
        System.out.println("====================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Sorting of Hospita Object in Acsending Order");
        System.out.println("====================================================================================");
        System.out.println("sorted by by patient no in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return h2.getPatient_no() - h1.getPatient_no();
            }
        });
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Patient Name  in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return h2.getPatient_name().compareTo(h1.getPatient_name());
            }
        });
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Doctor Name in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return h2.getDoctor_name().compareTo(h1.getDoctor_name());
            }
        });
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by Specialization no in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return h2.getSpecialization().compareTo(h1.getSpecialization());
            }
        });
        PrintTable(list);
        Thread.sleep(1000);


        System.out.println("====================================================================================");
        System.out.println("sorted by Bill no in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return h2.getBill_no() - h1.getBill_no();
            }
        });
        PrintTable(list);
        Thread.sleep(1000);

        System.out.println("====================================================================================");
        System.out.println("sorted by by Bill Ammount in Ascending order");
        System.out.println();
        Collections.sort(list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital h1, Hospital h2) {
                return Double.compare(h2.getBill_ammount(), h1.getBill_ammount());
            }
        });
        PrintTable(list);   
        System.out.println("====================================================================================");


    }

    public static void PrintTable(List<Hospital> list) throws InterruptedException {
        System.out.printf("%-12s %-15s %-15s %-20s %-10s %-15s%n", "Patient No", "Patient Name", "Doctor Name",
                "Specialization", "Bill No", "Bill Amount");

        // Print table rows
        for (Hospital hos : list) {
            System.out.printf("%-12d %-15s %-15s %-20s %-10d %-15.2f%n",
                    hos.getPatient_no(),
                    hos.getPatient_name(),
                    hos.getDoctor_name(),
                    hos.getSpecialization(),
                    hos.getBill_no(),
                    hos.getBill_ammount());
                    Thread.sleep(1000);
        }
    }
}
