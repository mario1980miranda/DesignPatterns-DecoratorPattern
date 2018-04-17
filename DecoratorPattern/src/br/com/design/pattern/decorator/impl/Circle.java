package br.com.design.pattern.decorator.impl;

import br.com.design.pattern.decorator.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("Shape: Circle.");
	}

}
