package main.java.cz.zoo.managers;

import main.java.cz.zoo.entities.AnimalEntity;


import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@ApplicationScoped
public class Manager {
	private HashMap<Integer, AnimalEntity> animals = new HashMap<>();

	public HashMap<Integer, AnimalEntity> getAll() {
		return animals;
	}

	public void create(AnimalEntity animal) {
		animals.put(animal.getIndex(), animal);
		animal.getIndex();
	}

	public void edit(Integer index, AnimalEntity animal) {
		animals.put(index, animal);
	}

	public void delete(Integer index) {
		animals.remove(index);
	}

	public AnimalEntity getOne(Integer index) {
		return animals.get(index);
	}

}
