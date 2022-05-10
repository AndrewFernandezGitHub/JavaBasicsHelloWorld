package com.syntax.class13;

public class HWScores {
	char studentGrade (int score) {
		if(score>90) {
			return'A';
		}else if (score >80 && score <=90) {
			return 'B';
		}else if (score >70 && score <=80) {
			return 'C';
		}else if (score>50 && score <=70) {
			return 'D';
		}else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		HWScores obj=new HWScores();
		System.out.println(obj.studentGrade(60));
		System.out.println(obj.studentGrade(73));
		System.out.println(obj.studentGrade(45));
		System.out.println(obj.studentGrade(98));

	}

}
