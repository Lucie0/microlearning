package cz.mendelu.xpacako1.microlearning.domain.option;

import cz.mendelu.xpacako1.microlearning.domain.question.Question;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToOne
    private Question question;

    public Option(String text, boolean correctAnswer, Question question){
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public String toString(){
        return " Option("+ this.id + "," + this.text + "," + this.correctAnswer + ")";
    }

}
