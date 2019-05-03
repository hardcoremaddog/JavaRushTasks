package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;

import java.util.Arrays;

public class Controller {

	private Provider[] providers;

	public Controller(Provider... providers) {
		if (providers.length == 0) {
			throw new IllegalArgumentException();
		}

		this.providers = providers;
	}

	@Override
	public String toString() {
		return "Controller{" +
				"providers=" + Arrays.toString(providers) +
				'}';
	}


	public void scan() {
		int vacanciesCount = 0;

		if (providers != null) {
			for (Provider provider : providers) {
				vacanciesCount += provider.getJavaVacancies("Java Киев").size();
			}
		}
		System.out.println(vacanciesCount);
	}
}
