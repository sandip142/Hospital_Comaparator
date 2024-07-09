public class Hospital{
   private int Patient_no;
   private String Patient_name;
   private String Doctor_name;
   private String Specialization;
   private int Bill_no;
   private double Bill_ammount;

   @Override
   public String toString() {
      return "Hospital [Patient_no=" + Patient_no + ", Patient_name=" + Patient_name + ", Doctor_name=" + Doctor_name
            + ", Specialization=" + Specialization + ", Bill_no=" + Bill_no + ", Bill_ammount=" + Bill_ammount + "]";
   }
   public Hospital(int patient_no, String patient_name, String doctor_name, String specialization, int bill_no,
         double bill_ammount) {
      Patient_no = patient_no;
      Patient_name = patient_name;
      Doctor_name = doctor_name;
      Specialization = specialization;
      Bill_no = bill_no;
      Bill_ammount = bill_ammount;
   }
   public int getPatient_no() {
      return Patient_no;
   }
   public void setPatient_no(int patient_no) {
      Patient_no = patient_no;
   }
   public String getPatient_name() {
      return Patient_name;
   }
   public void setPatient_name(String patient_name) {
      Patient_name = patient_name;
   }
   public String getDoctor_name() {
      return Doctor_name;
   }
   public void setDoctor_name(String doctor_name) {
      Doctor_name = doctor_name;
   }
   public String getSpecialization() {
      return Specialization;
   }
   public void setSpecialization(String specialization) {
      Specialization = specialization;
   }
   public int getBill_no() {
      return Bill_no;
   }
   public void setBill_no(int bill_no) {
      Bill_no = bill_no;
   }
   public double getBill_ammount() {
      return Bill_ammount;
   }
   public void setBill_ammount(double bill_ammount) {
      Bill_ammount = bill_ammount;
   }
   
}