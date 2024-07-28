package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.option.Option;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class QuestionResponse {
    private Long id;
    private String text;
    private int points;
    private int number;
    private List<Long> optionIds;

    public QuestionResponse(Question question){
        this.id = question.getId();
        this.text = question.getText();
        this.points = question.getPoints();
        this.number = question.getNumber();
        this.optionIds = question.getOptions().stream().map(Option::getId).toList();
    }
}
