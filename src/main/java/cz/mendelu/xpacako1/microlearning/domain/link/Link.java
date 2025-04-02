package cz.mendelu.xpacako1.microlearning.domain.link;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "actual_node")
    @ManyToOne
    private Node actualNode;

    @JoinColumn(name = "next_node")
    @ManyToOne
    private Node nextNode;

}
