package com.yash.oops.program2;

/**
 * 
 * @author sourabh.tank
 *Here we are taking one base vertex of a triangle and one height
 * due to triangle property it has one base & one height i.e AB = height & BC = base
 * So, here we are consider only two vertex. 
 * 
 */
public class Triangle implements Shape {
	
	private double vertex_AB;
	private double vertex_BC;
	private double vertex_AC;
	
	public Triangle(double vertex_AB,double vertex_BC,double vertex_AC) {
		this.vertex_AB = vertex_AB;
		this.vertex_AC = vertex_AC;
		this.vertex_BC = vertex_BC;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ( vertex_AB * vertex_BC) / 2 ;
	}
	
	        
	public double printArea() {
		//As per the Maths Formula
		//Perimeter of a Triangle is (side1 + side2 + side3);
		return (vertex_AB + vertex_BC + vertex_AC);
	}
	
	@Override
	public String toString() {
		return "Area of a Triangle ABC is " + area()+ " sqrm \nAnd print area of Triangle ABC is " + printArea() + " m";
	}

	

}
