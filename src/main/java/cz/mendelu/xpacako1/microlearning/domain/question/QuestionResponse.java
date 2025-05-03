package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.option.OptionResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import lombok.Data;

@Data
public class QuestionResponse {
    private Long id;
    private String questionType;
    private String text;
    private int points;
    private int ordinalNumber;
//    private List<Long> optionIds;
    private ArrayResponse<OptionResponse> options;

    public QuestionResponse(Question question){
        this.id = question.getId();
        this.questionType = question.getQuestionType().name();
        this.text = question.getText();
        this.points = question.getPoints();
        this.ordinalNumber = question.getOrdinalNumber();
//        this.optionIds = question.getOptions().stream().map(Option::getId).toList();
        this.options = ArrayResponse.of(question.getOptions(), OptionResponse::new);
    }
}
