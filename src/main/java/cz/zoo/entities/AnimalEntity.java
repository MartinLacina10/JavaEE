package main.java.cz.zoo.entities;


public class AnimalEntity {
	private Integer index;
	private String name;
	private String age;


	public void setIndex(int index) {
		this.index = index;
	}

	public Integer getIndex() {
		return index;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
