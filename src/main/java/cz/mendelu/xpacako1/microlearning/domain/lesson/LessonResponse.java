package cz.mendelu.xpacako1.microlearning.domain.lesson;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import cz.mendelu.xpacako1.microlearning.domain.question.QuestionResponse;
import cz.mendelu.xpacako1.microlearning.domain.topic.TopicResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ObjectResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

import java.sql.Clob;
import java.util.List;

@Data
public class LessonResponse {
    private Long id;
    private String name;

    private int ordinalNumber;
    private String content;

    private Long nodeId;
    private ArrayResponse<QuestionResponse> questions;
    private String topic;

    public LessonResponse(Lesson lesson){
        this.id = lesson.getId();
        this.name = lesson.getName();

        this.ordinalNumber = lesson.getOrdinalNumber();
        if (lesson.getNode() != null) {
            this.nodeId = lesson.getNode().getId(); //.stream().map(Node::getId).toList();
        } else {
            this.nodeId = 0L;
        }

        this.questions = ArrayResponse.of(lesson.getQuestions(), QuestionResponse::new);

        this.content = lesson.getContent();
        this.topic = lesson.getTopic().getName();
    }
}
