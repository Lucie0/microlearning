package cz.mendelu.xpacako1.microlearning.domain.option;

import cz.mendelu.xpacako1.microlearning.domain.question.Question;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String text;

    @Column(name = "correct_answer")
    private boolean correctAnswer;

    // cislo skupiny, do ktere moznost nalezi pri otazce typu CLOZE
    // defaultne 0
    @NotNull
    @Column(name = "group_number")
    private int groupNumber;

    @ManyToOne
    private Question question;

    public Option(String text, boolean correctAnswer, int groupNumber, Question question){
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.groupNumber = groupNumber;
        this.question = question;
    }

    public Option(String text, boolean correctAnswer, Question question){
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.groupNumber = 0;
        this.question = question;
    }

    public String toString(){
        return " Option("+ this.id + "," + this.text + "," + this.correctAnswer + "," + this.groupNumber + ")";
    }

}
