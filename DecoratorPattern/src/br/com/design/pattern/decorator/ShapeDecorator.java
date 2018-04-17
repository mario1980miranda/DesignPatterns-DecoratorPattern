package br.com.design.pattern.decorator;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(final Shape decoratedShape) {
	
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {

		this.decoratedShape.draw();
	}

}
