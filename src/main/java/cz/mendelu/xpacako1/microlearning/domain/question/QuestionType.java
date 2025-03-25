package cz.mendelu.xpacako1.microlearning.domain.question;

public enum QuestionType {
    ONE_FROM_N, // 1zN,
    MORE_FROM_N, // MzN
    CLOZE, // doplnovacka casti do textu, otazka obsahuje vetu s misty k doplneni oznacene
    // dvema hr. zavorkami s cislem uvnitr
    OPEN // otevrena otazka
}
