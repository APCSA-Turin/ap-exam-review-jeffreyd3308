public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean isBonus;
    private int playCounter;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Game(Level level1, Level level2, Level level3, boolean isBonus) {
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
        this.isBonus = isBonus;
        playCounter = 0;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public boolean isBonus() {
        return isBonus;
    }

    public int getScore() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with GameTester
		int sumPoints = 0;
		if (levelOne.goalReached()) {
			sumPoints += levelOne.getPoints();
			if (levelTwo.goalReached()) {
				sumPoints += levelTwo.getPoints();
				if (levelThree.goalReached()) {
					sumPoints += levelThree.getPoints();
				}
			}
		}
		if (isBonus) {
			sumPoints *= 3;
		}
		return sumPoints;
    }

    public int playManyTimes(int num) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with GameTester
		int highest = 0;
		while (num > 0) {
            play();
			if (highest < getScore()) {
				highest = getScore();
			}
			num--;
		}
        return highest;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public void play() {
        if (playCounter == 0) {
            levelOne = new Level(true, 10);
            levelTwo = new Level(true, 20);
            levelThree = new Level(true, 45);
        } else if (playCounter == 1) {
            levelOne = new Level(true, 15);
            levelTwo = new Level(true, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 2) {
            levelOne = new Level(true, 90);
            levelTwo = new Level(false, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 3) {
            levelOne = new Level(true, 5);
            levelTwo = new Level(true, 5);
            levelThree = new Level(true, 10);
        } else if (playCounter == 4) {
            levelOne = new Level(true, 50);
            levelTwo = new Level(true, 15);
            levelThree = new Level(true, 35);
        } else if (playCounter == 5) {
            levelOne = new Level(true, 110);
            levelTwo = new Level(false, 50);
            levelThree = new Level(true, 10);
        }
        playCounter++;
    }
}
