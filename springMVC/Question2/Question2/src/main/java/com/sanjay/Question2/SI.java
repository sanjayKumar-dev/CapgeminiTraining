package com.sanjay.Question2;

public class SI {
	private double p;
	private double t;
	private double r;
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double getInterest()
	{
		return (p*r*t)/100;
	}
	

}
