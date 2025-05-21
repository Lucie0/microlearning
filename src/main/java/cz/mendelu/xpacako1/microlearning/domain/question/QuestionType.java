package cz.mendelu.xpacako1.microlearning.domain.question;

public enum QuestionType {
    OPEN, // otevrena otazka     0
    ONE_FROM_N, // 1zN,         1
    CLOZE, // doplnovacka casti do textu, otazka obsahuje vetu s misty k doplneni oznacene      2
    // dvema hr. zavorkami s cislem uvnitr

    MORE_FROM_N, // MzN         3
}
