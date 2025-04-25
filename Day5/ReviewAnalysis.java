import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with ReviewTester
		double sum = 0.0;
		for (int i = 0; i < allReviews.length; i++) {
			sum += allReviews[i].getRating();
		}
		return sum / (allReviews.length);
    }

    public ArrayList<String> collectComments() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with ReviewTester
		ArrayList<String> commentList = new ArrayList<String>();
		for (int i = 0; i < allReviews.length; i++) {
			if (allReviews[i].getComment().indexOf("!") != -1) {
				if (!(allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals(".") || allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals("!"))) {
					commentList.add(i + "-" + allReviews[i].getComment() + ".");
				} else {
					commentList.add(i + "-" + allReviews[i].getComment());
				}
			}
		}
		return commentList;
    }
}
