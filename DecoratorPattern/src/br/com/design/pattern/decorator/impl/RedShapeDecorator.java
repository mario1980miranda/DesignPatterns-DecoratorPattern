package br.com.design.pattern.decorator.impl;

import br.com.design.pattern.decorator.Shape;
import br.com.design.pattern.decorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(final Shape decoratedShape) {
		
		super(decoratedShape);
	}

	@Override
	public void draw() {
	
		super.decoratedShape.draw();
		this.setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(final Shape decoratedShape) {
		
		System.out.println("Border Color: Red.");
	}
}
