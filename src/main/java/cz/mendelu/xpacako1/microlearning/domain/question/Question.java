package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.option.Option;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private QuestionType questionType;

    @NotNull
    private String text;

    @NotNull
    private int points;

    @Column(name = "ordinal_number")
    @NotNull
    private int ordinalNumber;

    @OneToMany(mappedBy = "question")
    private List<Option> options = new ArrayList<>();

    // todo manytoone folder

    public void addOption(Option option){
        this.options.add(option);
    }

    public void addOptions(List<Option> options){
        this.options.addAll(options);
    }

    public Question(String text, int points, int ordinalNumber, List<Option> options){
        this.text = text;
        this.points = points;
        this.ordinalNumber = ordinalNumber;
        this.options = options;
    }

}
