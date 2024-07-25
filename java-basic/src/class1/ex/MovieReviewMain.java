package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃 타임";
        abouttime.review = " 인생 시간 영화";

        MovieReview inturn = new MovieReview();
        inturn.title = "인턴";
        inturn.review = "내 인생 영화";

        MovieReview[] movies = {inception, abouttime, inturn};

        for (MovieReview m : movies) {
            System.out.println("영화 제목: "+m.title+", 리뷰: "+m.review);
        }

    }
}
