import java.util.ArrayList;

class FeedBack {
    String name;
    String feedback;
    int rating;

    FeedBack(String customerName, String feedbackText, int customerRating) {
        name = customerName;
        feedback = feedbackText;
        rating = customerRating;
    }
}

public class Feedback {
    public static void main(String[] args) {
        FeedBack bob = new FeedBack("Bob", "good", 8);
        FeedBack sam = new FeedBack("sam", "very good", 10);
        FeedBack mike = new FeedBack("mike", "good", 7);
        FeedBack jake = new FeedBack("jake", "bad", 3);
        FeedBack lana = new FeedBack("lana", "good", 8);
        FeedBack logan = new FeedBack("logan", "bad", 2);
        FeedBack aman = new FeedBack("aman", "good", 8);

        ArrayList<FeedBack> feedbackList = new ArrayList<FeedBack>();
        feedbackList.add(bob);
        feedbackList.add(sam);
        feedbackList.add(mike);
        feedbackList.add(jake);
        feedbackList.add(lana);
        feedbackList.add(logan);
        feedbackList.add(aman);

        displayFeedback(feedbackList);
    }

    public static void displayFeedback(ArrayList<FeedBack> fblist) {
        float avgRating;
        int sumRating = 0;
        for (FeedBack fBack : fblist) {
            sumRating += fBack.rating;
            System.out.println("NAME : " + fBack.name);
            System.out.println("FEEDBACK : " + fBack.feedback);
            System.out.println("RATING : " + fBack.rating);
            System.out.println("----------------------");
        }
        avgRating = sumRating / fblist.size();
        System.out.println("Average customer rating : " + avgRating);

    }
}
