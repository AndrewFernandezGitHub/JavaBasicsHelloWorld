package com.syntax.GitHub;

public class GitHubCode {

	public static void main(String[] args) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print("$");
				if(i==2&&j==2) {
					System.out.println("1");
				}
			}
			System.out.println("a");
		}
		
}}
