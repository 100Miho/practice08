package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Add add = new Add();
    	Sub sub = new Sub();
    	Mul mul = new Mul();
    	Div div = new Div();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
    		String input = sc.nextLine();
    		String[] inputArr = input.split(" ");
    		
    		if(input.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		switch(inputArr[1]) {
    		case "+":
    			add.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[2]));
    			System.out.println(">> " + add.calculate());
    			break;
    		case "-":
    			sub.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[2]));
    			System.out.println(">> " + sub.calculate());
    			break;
    		case "*":
    			mul.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[2]));
    			System.out.println(">> " + mul.calculate());
    			break;
    		case "/":
    			div.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[2]));
    			System.out.println(">> " + div.calculate());
    			break;
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    			break;
    		}
    	}
    }
}