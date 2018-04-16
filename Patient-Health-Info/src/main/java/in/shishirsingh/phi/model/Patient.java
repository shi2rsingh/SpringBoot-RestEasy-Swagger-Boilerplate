package in.shishirsingh.phi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String id;
	String name;
	int age;
	int height;
	int weight;
	String[] pastMedication;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String[] getPastMedication() {
		return pastMedication;
	}
	public void setPastMedication(String[] pastMedication) {
		this.pastMedication = pastMedication;
	}
	
	
	
}
