package com.shape;

public interface ITwoDshape {
	public void draw2d();
	public default void message() {
		System.out.println("well come to interface");
	}

}
