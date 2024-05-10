package IntroToOOP;

public class ReattemptExam {
    int reattempt_exam_id;
    int reattempt_exam_score;

    ReattemptExam(int reattempt_exam_id, int reattempt_exam_score) {
        this.reattempt_exam_id = reattempt_exam_id;
        this.reattempt_exam_score = reattempt_exam_score;
    }

    ReattemptExam(ReattemptExam other) {
        this.reattempt_exam_id = other.reattempt_exam_id;
        this.reattempt_exam_score = other.reattempt_exam_score;
    }
}
