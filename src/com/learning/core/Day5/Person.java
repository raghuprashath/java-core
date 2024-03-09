package com.learning.core.day5;

import java.util.*;
class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person currentPerson = (Person) obj;
        return id == currentPerson.id;
    }
	public String toString() {
		return "id=" + id + ",name=" + name + ",age=" + age + ", salary=" + salary;
	}
    public String display() {
		return id + " " + name + " "  + salary;
    }
    
}