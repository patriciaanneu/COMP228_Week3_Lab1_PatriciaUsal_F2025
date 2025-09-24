package com.pu.week4.lab2;

import java.math.BigDecimal;

public class Interest {
	
	private double principal;
	private double rate;
	private int time;
	
	
	private BigDecimal bdPrincipal;
	private BigDecimal bdRate;
	private BigDecimal bdTime;
	
	
	public Interest(double principal, double rate, int time) {
		
		if (principal <= 0 || rate <= 0 || time <= 0) {
			throw new IllegalArgumentException("Principal, rate, and time must be positive (greater than zero).");
		}
		
		if (principal % 1.0 == 0 || rate % 1.0 == 0) {
			throw new IllegalArgumentException("Principal and rate must have a decimal part.");
		}
		
		
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		
		
		double doubleValueP = this.principal;
		this.bdPrincipal = BigDecimal.valueOf(doubleValueP);
		
		double doubleValueR = this.rate;
		this.bdRate = BigDecimal.valueOf(doubleValueR);
		
		double doubleValueT = this.time;
		this.bdTime = BigDecimal.valueOf(doubleValueT);
	}

		
		
		static double SimpleInterest(double principal, double rate, int time) {
			double doubleValueP = principal;
			BigDecimal p = BigDecimal.valueOf(doubleValueP);
			
			double doubleValueR = rate;
			BigDecimal r = BigDecimal.valueOf(doubleValueR).divide(BigDecimal.valueOf(100));
			
			double doubleValueT = time;
			BigDecimal t = BigDecimal.valueOf(doubleValueT);
			
			BigDecimal si = p.multiply(r).multiply(t);
			return si.doubleValue();
		}
		
		
		static double CompoundInterest(double principal, double rate, int time) {
			double doubleValueP = principal;
			BigDecimal p = BigDecimal.valueOf(doubleValueP);
			
			double doubleValueR = rate;
			BigDecimal rDecimal = BigDecimal.valueOf(doubleValueR).divide(BigDecimal.valueOf(100));
			
			double doubleValueT = time;
			BigDecimal t = BigDecimal.valueOf(doubleValueT);
			
			BigDecimal one = BigDecimal.ONE;
			BigDecimal factor = one.add(rDecimal).pow(t.intValue());
			BigDecimal ci = p.multiply(factor);
			return ci.doubleValue();
		}
	}
			
