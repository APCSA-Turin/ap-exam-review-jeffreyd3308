public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        // TYPE UP YOUR PART A CODE HERE
        // then test with WordMatchTester
		int numOccurences = 0;
		for (int i = 0; i <= secret.length() - guess.length(); i++) {
			if (secret.substring(i, i+guess.length()).equals(guess)) {
				numOccurences++;
			}
		}
		return (numOccurences * guess.length() * guess.length());
    }

    public String findBetterGuess(String guess1, String guess2) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with WordMatchTester
		if (scoreGuess(guess1) > scoreGuess(guess2)) {
			return guess1;
		} else if (scoreGuess(guess1) < scoreGuess(guess2)) {
			return guess2;
		} else {
			if (guess1.compareTo(guess2) > 0) {
				return guess1;
			} else {
				return guess2;
			}
		}
    }
}
