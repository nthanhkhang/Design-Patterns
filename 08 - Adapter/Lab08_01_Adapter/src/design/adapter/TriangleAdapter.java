package design.adapter;

import design.adapter.extra.Triangle;

public class TriangleAdapter extends Triangle implements Shape {

	public TriangleAdapter() {
	      super();
	}
	
	@Override
	public void draw() {
		this.drawShape();
	}

	@Override
	public void resize() {
		System.out.println("Triangle can't be resized. Please create new one with required values.");
	}

	@Override
	public String description() {
		return "Triangle object";
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}

}
