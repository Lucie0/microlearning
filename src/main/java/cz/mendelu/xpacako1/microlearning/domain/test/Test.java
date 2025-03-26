package cz.mendelu.xpacako1.microlearning.domain.test;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// todo tridu Folder na otazky

// todo
//  do db budu ukladat ID testu,
//  id slozky, ze ktere ma brat otazky,
//  a pocet otazek, ktere z ni ma brat

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // date of creation, date of modification, ...

    // todo one to many slozky k testu, folders to test

    public Test(String name){
        this.name = name;
    }

//    @OneToMany
//    private List<Question> questions;
//
//    @OneToOne(mappedBy = "pretest")
    @ManyToOne//(mappedBy = "pretest")
    private Node node;



//    public Test(List<Question> questions, Node node){
//        this.questions = new ArrayList<>(questions);
//        this.node = node;
//    }
}
