//package cz.mendelu.xpacako1.microlearning.domain.node;
//
//import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
//import cz.mendelu.xpacako1.microlearning.domain.test.Test;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Node {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne(mappedBy = "node")
//    private Test pretest;
//
//    @OneToOne(mappedBy = "node")
//    private Lesson lesson;
//
//    // zaznam o tom, jestli byl uzel projity, neprojity, uspesne ci neuspesne absolvovan
//
//    @Column(name = "walk_through")
//    private boolean walkThrough = false;
//
//    @Column(name = "successfully_completed")
//    private boolean successfullyCompleted = false;
//
//
//    public Node(Test pretest, Lesson lesson){
//        this.pretest = pretest;
//        this.lesson = lesson;
//    }
//}
