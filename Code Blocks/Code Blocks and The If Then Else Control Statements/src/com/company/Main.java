package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;

//	    if(score < 5000 && score > 1000) {
//            System.out.println("Your score was 5000 but greather than 1000");
//        } else if(score < 1000){
//
//	    } else{
//			System.out.println("Got here");
//		}

		if(gameOver) {
			int score = 5000;
			int levelCompleted = 5;
			int bonus = 100;
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		if(gameOver) {
			int score = 10000;
			int levelCompleted = 8;
			int bonus = 200;
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

    }
}
