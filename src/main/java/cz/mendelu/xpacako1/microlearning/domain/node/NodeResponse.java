package cz.mendelu.xpacako1.microlearning.domain.node;

import lombok.Data;

// todo predavat i nazev lekce a testu

@Data
public class NodeResponse {
    private Long id;
    private Long testId;
    private String testName;
    private Long lessonId;
    private String lessonName;
    private boolean walkThrough;
    private boolean successfullyCompleted;

    public NodeResponse(Node node){
        this.id = node.getId();

        // todo vyresit, pretest byva null
        if (node.getPretest() != null) {
            this.testId = node.getPretest().getId();
            this.testName = node.getPretest().getName();
        } else {
            this.testId = 0L;
            this.testName = "";
        }
//
//         todo vyresit
        if (node.getLesson() != null) {
            this.lessonId = node.getLesson().getId();
            this.lessonName = node.getLesson().getName();
        } else {
            this.lessonId = 0L;
            this.lessonName = "";
        }

        this.walkThrough = node.isWalkThrough();
        this.successfullyCompleted = node.isSuccessfullyCompleted();
    }
}
