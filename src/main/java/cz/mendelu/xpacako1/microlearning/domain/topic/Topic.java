package cz.mendelu.xpacako1.microlearning.domain.topic;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import cz.mendelu.xpacako1.microlearning.domain.test.Test;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


// todo controller
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(name = "first_node")
    private Long firstNode;

    @OneToMany(mappedBy = "topic")
    private List<Lesson> lessons;


}
