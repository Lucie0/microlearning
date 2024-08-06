package cz.mendelu.xpacako1.microlearning.domain.lesson;

//import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Type;

import java.sql.Clob;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @Column(columnDefinition = "text")
    private String content;

//    @OneToOne
//    private Node node;

    // todo pridat node do constructoru?
    public Lesson(String name, String content){
        this.name = name;
        this.content = content;
    }
}
