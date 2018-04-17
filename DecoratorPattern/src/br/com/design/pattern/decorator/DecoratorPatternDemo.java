package br.com.design.pattern.decorator;

import br.com.design.pattern.decorator.impl.Circle;
import br.com.design.pattern.decorator.impl.Rectangle;
import br.com.design.pattern.decorator.impl.RedShapeDecorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {

		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border.");
		circle.draw();
		
		System.out.println("\nCircle of red border.");
		redCircle.draw();
		
		System.out.println("\nRectangle of red border.");
		redRectangle.draw();
		
	}

}
