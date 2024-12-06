package btvn_buoi5_1;

public class ManageHospital {
    private Doctor doctor;
    private Patient patient;

    public ManageHospital(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public void showInfoALL() {
        System.out.println("Thong tin bac si: ");
        doctor.showInfo();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Thong tin benh nhan: ");
        patient.showInfo();
    }
}
