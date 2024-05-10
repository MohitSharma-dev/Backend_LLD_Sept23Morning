package IntroToOOP;

public class Exam {
    int exam_id;
    int exam_score;
    ReattemptExam reattemptExam;

    Exam(int exam_id, int exam_score) {
        this.exam_id = exam_id;
        this.exam_score = exam_score;
        this.reattemptExam = new ReattemptExam(1, 50);
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.exam_score = other.exam_score;
        this.reattemptExam = new ReattemptExam(other.reattemptExam);
    }
}
