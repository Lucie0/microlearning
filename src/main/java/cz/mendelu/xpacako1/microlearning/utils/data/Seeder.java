package cz.mendelu.xpacako1.microlearning.utils.data;

import cz.mendelu.xpacako1.microlearning.domain.lesson.LessonService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Seeder {

    private final LessonService lessonService;

    // constructor
    @Autowired
    public Seeder(LessonService lessonService){
        this.lessonService = lessonService;
    }

    private boolean shouldSeedData() {
        // return
        return lessonService.getAllLessons().isEmpty();
    }

    @PostConstruct
    public void seedDefaultData() {
        if (!shouldSeedData()) {
            log.info("--- Default data already seeded ---");
            return;
        }

        // else
//        Subject s1 = new Subject("sub1", "EBC-SUB1");
//        subjectService.createSubject(s1);
//        Subject s2 = new Subject("sub2", "EBC-SUB2");
//        subjectService.createSubject(s2);
//        Subject s3 = new Subject("sub3", "EBC-SUB3");
//        subjectService.createSubject(s3);
//        Subject s4 = new Subject("sub4", "EBC-SUB4");
//        subjectService.createSubject(s4);
//
////        Teacher t1 = Teacher.builder().firstName("Aaa").lastName("Aaaa").build();
//        Teacher t1 = new Teacher("Aaa", "Aaaa");
//        teacherService.createTeacher(t1);
//        Teacher t2 = new Teacher("BBB", "bbb");
//        teacherService.createTeacher(t2);
//        Teacher t3 = new Teacher("ccc", "bbb");
//        teacherService.createTeacher(t3);
//        Teacher t4 = new Teacher("ddd", "DDd");
//        teacherService.createTeacher(t4);
//
//        Type type1 = new Type("Posluchárna velká");
//        typeService.createType(type1);
//        Type type2 = new Type("Učebna počítačová");
//        typeService.createType(type2);
//        Type type3 = new Type("Laboratoř");
//        typeService.createType(type3);
//        Type type4 = new Type("Učebna, cvičebna, malá posluchárna");
//        typeService.createType(type4);
//        Type type5 = new Type("Učebna specializovaná");
//        typeService.createType(type5);
//        Type type6 = new Type("Zasedací a společenská místnost");
//        typeService.createType(type6);
//
//        Purpose p1 = new Purpose("101 - Posluchárna");
//        purposeService.createPurpose(p1);
//        Purpose p2 = new Purpose("102 - Cvičebna");
//        purposeService.createPurpose(p2);
//        Purpose p3 = new Purpose("103 - Laboratoř");
//        purposeService.createPurpose(p3);
//        Purpose p4 = new Purpose("110 - Zasedací místnost pedagogů");
//        purposeService.createPurpose(p4);
//        Purpose p5 = new Purpose("116 - Zasedací místnost zaměstnanců");
//        purposeService.createPurpose(p5);
//        Purpose p6 = new Purpose("134 - Knihovna");
//        purposeService.createPurpose(p6);
//
//        Classroom c1 = new Classroom("Q01", 361, type1, p1);
//        Classroom c2 = new Classroom("Q02", 170, type1, p1);
//        Classroom c3 = new Classroom("Q03", 170, type1, p1);
//        Classroom c4 = new Classroom("Q16", 80, null, p1);
//        Classroom c5 = new Classroom("Q01.84", 0, type5, p1);
//        Classroom c6 = new Classroom("Q112", 22, type2, p2);
//        Classroom c7 = new Classroom("Q113", 16, type2, p2);
//        Classroom c8 = new Classroom("Q111", 22, type4, p2);
//        Classroom c9 = new Classroom("Q13", 0, null, p2);
//        Classroom c10 = new Classroom("Q14", 30, null, p2);
//        Classroom c11 = new Classroom("Q110", 24, type4, p2);
//        Classroom c12 = new Classroom("Q17", 42, type4, p2);
//        Classroom c13 = new Classroom("Q12", 19, null, p2);
//        Classroom c14 = new Classroom("Q15", 48, null, p2);
//        Classroom c15 = new Classroom("Q19", 36, type4, p2);
//        Classroom c16 = new Classroom("Q18", 28, type5, p2);
//        Classroom c17 = new Classroom("Q11", 19, type3, p2);
//        Classroom c18 = new Classroom("Q24", 24, type2, p2);
//        Classroom c19 = new Classroom("Q25", 30, null, p2);
//        Classroom c20 = new Classroom("Q23", 48, null, p2);
//        Classroom c21 = new Classroom("Q26", 20, type2, p2);
//        Classroom c22 = new Classroom("Q22", 74, null, p2);
//        Classroom c23 = new Classroom("Q27", 20, type2, p2);
//        Classroom c24 = new Classroom("Q21", 20, null, p2);
//        Classroom c25 = new Classroom("Q28", 30, null, p2);
//        Classroom c26 = new Classroom("Q34", 24, type2, p2);
//        Classroom c27 = new Classroom("Q35", 25, type2, p2);
//        Classroom c28 = new Classroom("Q33", 48, null, p2);
//        Classroom c29 = new Classroom("Q36", 20, type2, p2);
//        Classroom c30 = new Classroom("Q32", 58, null, p2);
//        Classroom c31 = new Classroom("Q37", 20, type2, p2);
//        Classroom c32 = new Classroom("Q31", 30, null, p2);
//        Classroom c33 = new Classroom("Q38", 41, null, p2);
//        Classroom c34 = new Classroom("Q44", 30, null, p2);
//        Classroom c35 = new Classroom("Q45", 30, null, p2);
//        Classroom c36 = new Classroom("Q43", 60, null, p2);
//        Classroom c37 = new Classroom("Q46", 30, null, p2);
//        Classroom c38 = new Classroom("Q42", 74, null, p2);
//        Classroom c39 = new Classroom("Q47", 20, null, p2);
//        Classroom c40 = new Classroom("Q41", 30, null, p2);
//        Classroom c41 = new Classroom("Q48", 30, null, p2);
//        Classroom c42 = new Classroom("virtuální - druhá", 1000, type5, p2);
//        Classroom c43 = new Classroom("virtuální - 3", 1000, type5, p2);
//        Classroom c44 = new Classroom("Virtuální učebna", 1000, type5, p2);
//        Classroom c45 = new Classroom("Q-LVR", 8, type3, p2);
//        Classroom c46 = new Classroom("Q09", 20, type2, p3);
//        Classroom c47 = new Classroom("Q08", 20, type2, p3);
//        Classroom c48 = new Classroom("Q07", 20, type2, p3);
//        Classroom c49 = new Classroom("Q06", 20, type3, p3);
//        Classroom c50 = new Classroom("Q05", 20, type2, p3);
//        Classroom c51 = new Classroom("Q-LCNA", 12, null, p3);
//        Classroom c52 = new Classroom("Q04", 30, type2, p3);
//        Classroom c53 = new Classroom("Q01.01", 20, type3, p3);
//        Classroom c54 = new Classroom("Q01.02", 20, type5, p3);
//        Classroom c55 = new Classroom("Q01.06", 24, type5, p3);
//        Classroom c56 = new Classroom("Q01.29", 20, type4, p3);
//        Classroom c57 = new Classroom("Q01.39", 10, type3, p3);
//        Classroom c58 = new Classroom("Q01.43", 10, type3, p3);
//        Classroom c59 = new Classroom("Q01.48", 22, type4, p3);
//        Classroom c60 = new Classroom("Q01.53", 12, type3, p3);
//        Classroom c61 = new Classroom("Q01.58", 12, type3, p3);
//        Classroom c62 = new Classroom("Q01.66", 12, type3, p3);
//        Classroom c63 = new Classroom("Q01.70", 28, type4, p3);
//        Classroom c64 = new Classroom("Velká zasedačka PEF", 30, null, p4);
//        Classroom c65 = new Classroom("Q2.32", 15, null, p4);
//        Classroom c66 = new Classroom("Q2.51", 15, null, p4);
//        Classroom c67 = new Classroom("Q3.57", 20, type6, p4);
//        Classroom c68 = new Classroom("Q3.76", 20, null, p4);
//        Classroom c69 = new Classroom("Q4.49", 20, type6, p4);
//        Classroom c70 = new Classroom("Q4.55", 20, null, p4);
//        Classroom c71 = new Classroom("Q4.74", 15, null, p4);
//        Classroom c72 = new Classroom("Q5.16", 30, null, p4);
//        Classroom c73 = new Classroom("Q5.35", 30, type4, p4);
//        Classroom c74 = new Classroom("Q6.01", 20, null, p4);
//        Classroom c75 = new Classroom("Q6.19", 20, null, p4);
//        Classroom c76 = new Classroom("Malá zasedačka PEF", 10, null, p5);
//        Classroom c77 = new Classroom("Q1.07", 12, null, p6);
//        Classroom c78 = new Classroom("Studovna PEF", 81, null, p6);
//
//        classroomService.createClassroom(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11,
//                c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28,
//                c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45,
//                c46, c47, c48, c49, c50, c51, c52, c53, c54, c55, c56, c57, c58, c59, c60, c61, c62,
//                c63, c64, c65, c66, c67, c68, c69, c70, c71, c72, c73, c74, c75, c76, c77, c78));
//
//        ScheduleAction sa1 = new ScheduleAction(t1, s1, c1, LocalTime.of(8,0),LocalTime.of(8,45),1);
//        scheduleActionService.createScheduleAction(sa1);

        log.info("--- Default data seeded ---");
    }

}
