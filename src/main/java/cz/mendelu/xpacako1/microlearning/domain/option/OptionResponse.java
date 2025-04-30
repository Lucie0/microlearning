package cz.mendelu.xpacako1.microlearning.domain.option;

import lombok.Data;

@Data
public class OptionResponse {
    private Long id;
    private String text;
    private boolean correctAnswer;
    private int groupNumber;
    private Long questionId;

    public OptionResponse(Option option){
        this.id = option.getId();
        this.text = option.getText();
        this.correctAnswer = option.isCorrectAnswer();
        this.groupNumber = option.getGroupNumber();
        this.questionId = option.getQuestion().getId();
    }
}
