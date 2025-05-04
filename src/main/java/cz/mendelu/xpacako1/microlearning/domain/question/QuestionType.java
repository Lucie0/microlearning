package cz.mendelu.xpacako1.microlearning.domain.question;

public enum QuestionType {
    ONE_FROM_N, // 1zN,         0
    CLOZE, // doplnovacka casti do textu, otazka obsahuje vetu s misty k doplneni oznacene      1
    // dvema hr. zavorkami s cislem uvnitr
    OPEN, // otevrena otazka     2
    MORE_FROM_N, // MzN         3
    }
