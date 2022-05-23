package com.shape;

public class Square extends Shape implements ITwoDshape{
	

	public Square(int side) {
		this.side=side;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw2d() {
		int area=side*side;
		System.out.println("Area of a square is "+area);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
