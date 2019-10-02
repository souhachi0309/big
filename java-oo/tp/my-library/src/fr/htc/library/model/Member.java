package fr.htc.library.model;

public class Member {
	private static int MEMBER_SEQ = 100;
	private String matricule;
	private String firstName;
	private String lastName;
	private int age;

	public Member(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.matricule = generateMatricule();

	}

	@Override
	public String toString() {
		return "Member [matricule=" + matricule + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}

	/**
	 * 
	 * @return
	 */
	private String generateMatricule() {

		return (lastName.substring(0, 1) + firstName.substring(0, 1)).toUpperCase() + MEMBER_SEQ++;
	}

}
