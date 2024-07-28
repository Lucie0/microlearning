package cz.mendelu.xpacako1.microlearning.domain.option;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.question.Question;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OptionResponse {
    private Long id;
    private String text;
    private boolean correctAnswer;
    private Long questionId;

    public OptionResponse(Option option){
        this.id = option.getId();
        this.text = option.getText();
        this.correctAnswer = option.isCorrectAnswer();
        this.questionId = option.getQuestion().getId();
    }
}
