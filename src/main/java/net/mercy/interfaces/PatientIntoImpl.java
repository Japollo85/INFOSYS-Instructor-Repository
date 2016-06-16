package net.mercy.interfaces;

public class PatientIntoImpl implements PatientInfo{

	public Medications[] getCurrentMedications(int id) {
		Medications meds = new Medications();
		meds.setDosage("3");
		meds.setName("Lipitor");
		
		Medications[] medArray ={meds};
		
		return medArray;
		
	}

}
