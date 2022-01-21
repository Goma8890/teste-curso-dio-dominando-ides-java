package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String name;
	private String colour;
	private String age;

	public Gato(String name, String colour, String age) {
		this.name = name;
		this.colour = colour;
		this.age = age;
	}

	public Gato() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, colour, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(age, other.age) && Objects.equals(colour, other.colour)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Gato [name=" + name + ", colour=" + colour + ", age=" + age + "]";
	}

	/*
	 * public Gato(String name, String colour, String age) { this.name = name;
	 * this.colour = colour; this.age = age; }
	 */

}
