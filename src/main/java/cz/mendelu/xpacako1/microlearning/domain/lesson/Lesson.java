package cz.mendelu.xpacako1.microlearning.domain.lesson;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Type;

import java.sql.Clob;
import java.util.ArrayList;
import java.util.List;

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

//    @OneToOne(mappedBy = "lesson")
//    @ManyToOne//(mappedBy = "lesson")
//    private Node node;

    @OneToMany(mappedBy = "lesson")
    private List<Node> nodes = new ArrayList<>();

    public Lesson(String name, String content){
        this.name = name;
        this.content = content;
    }

    public Lesson(String name, String content, Node node){
        this.name = name;
        this.content = content;
        this.nodes.add(node);
    }
}
