package pattern_Problems;

public class Pattern3 {

	public static void main(String[] args) {
		int n= 5;
		//star1
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//star2
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//*
//**
//***
//****
//*****
//****
//***
//**
//*

