package cz.mendelu.xpacako1.microlearning.domain.node;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class NodeResponse {
    private Long id;

    //  smazat
//    private Long testId;
//    private String testName;

    private Long lessonId;
    private String lessonName;
    private int lessonOrdinalNumber;

    private int level;

    private int questionDepth;
    private int levelDepth;

    private boolean walkThrough;
    private boolean successfullyCompleted;

    public NodeResponse(Node node){
        this.id = node.getId();
        this.level = node.getLevel();

//        if (node.getPretest() != null) {
//            this.testId = node.getPretest().getId();
//            this.testName = node.getPretest().getName();
//        } else {
//            this.testId = 0L;
//            this.testName = "";
//        }
//
        // todo vyresit?
        if (node.getLesson() != null) {
            this.lessonId = node.getLesson().getId();
            this.lessonName = node.getLesson().getName();
            this.lessonOrdinalNumber = node.getLesson().getOrdinalNumber();
        } else {
            this.lessonId = 0L;
            this.lessonName = "";
            this.lessonOrdinalNumber = 0;
        }

        this.levelDepth = node.getLevelDepth();
        this.questionDepth = node.getQuestionDepth();
        this.walkThrough = node.isWalkThrough();
        this.successfullyCompleted = node.isSuccessfullyCompleted();
    }
}
