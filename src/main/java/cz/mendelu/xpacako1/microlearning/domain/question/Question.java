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
    private String text;

    @NotNull
    private int points;

    @NotNull
    private int number;

    @OneToMany(mappedBy = "question")
    private List<Option> options = new ArrayList<>();

    // todo manytoone folder

    public void addOption(Option option){
        this.options.add(option);
    }

    public void addOption(List<Option> options){
        this.options.addAll(options);
    }

    public Question(String text, int points, int number, List<Option> options){
        this.text = text;
        this.points = points;
        this.number = number;
        this.options = options;
    }

}
