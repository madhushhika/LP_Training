package com.madhushika.factory;

import java.util.*;

public abstract class Package {

	protected List<Photography> photographs = new ArrayList<Photography>();

	public Package() {
		createPackage();
	}

	protected abstract void createPackage();

	@Override
	public String toString() {

		return "Package {" + "photographs=" + photographs + '}';
	}
}
