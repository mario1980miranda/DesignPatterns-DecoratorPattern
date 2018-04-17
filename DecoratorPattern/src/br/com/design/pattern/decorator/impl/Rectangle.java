package br.com.design.pattern.decorator.impl;

import br.com.design.pattern.decorator.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle.");
	}

}
