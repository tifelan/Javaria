package KalakutaKresent;

public class Questionnaire {
    public static void main(String[] args) {
        String questionOne = "Which one of these describes you best\nA: expend, energy\nB: enjoy groups";
        String questionTwo = "Which one of these describes you best\nA: interpret, literally\nB: look for meaning and possibilities";
        String questionThree = "Which one of these describes you best\nA: logical, thinking, questioning\nB: empathetic, feeling, accommodating";
        String questionFour = "Which one of these describes you best\nA: organised, orderly\nB: flexible, adaptable";
        String questionFive = "Which one of these describes you best\nA: more outgoing, think out loud\nB: more reserved, think to yourself";
        String questionSix = "Which one of these describes you best\nA: practical, realistic, experiential\nB: imaginative, innovative, theoretical";
        String questionSeven = "Which one of these describes you best\nA: candid, straight forward, frank\nB: tactful, kind, encouraging,";
        String questionEight = "Which one of these describes you best\nA: plan, schedule.\nB: unplanned, spontaneous";
        String questionNine = "Which one of these describes you best\nA: seek many tasks, public activities, interaction with others.\nB: seek private, solitary activities with quiet to concentrate";
        String questionTen = "Which one of these describes you best\nA: standard, usual, conventional.\nB: different, novel, unique";
        String questionEleven = "Which one of these describes you best\nA: firm, tend to criticise, hold the line.\nB. gentle, tend to to conciliate";
        String questionTwelve = "Which one of these describes you best\nA: regulated, structured\nB: easygoing.\"live\" and let \"live\"";
        String questionThirteen = "Which one of these describes you best\nA: external, communicative, express yourself.\nB: internal, reticent, keep to yourself";
        String questionFourteen = "Which one of these describes you best\nA: focus on here-and-now\nB: look into the future, global perspective,\"big picture\"";
        String questionFifteen = "Which one of these describes you best\nA: tough minded, just\nB: tender-hearted, merciful";
        String questionSixteen = "Which one of these describes you best\nA: preparation, plan ahead\nB: go with the flow, adapt as you go";
        String questionSeventeen = "Which one of these describes you best\nA: active initiate\nB: reflective, deliberate";
        String questionEighteen = "Which one of these describes you best\nA: facts, things, \" what is\"\nB: ideas. dreams, \"what could be\", philosophical";
        String questionNineteen = "Which one of these describes you best\nA: matter of fact, issue-oriented\nB: sensitive, people-oriented, compassionate";
        String questionTwenty = "Which one of these describes you best\nA: control, govern.\nB: latitude, freedom";

        Questions[] questionEI = {
                new Questions(questionOne, "A", "B",""),
                new Questions(questionFive, "A", "B",""),
                new Questions(questionNine, "A", "B",""),
                new Questions(questionThirteen, "A", "B",""),
                new Questions(questionSeventeen, "A", "B",""),};

        Questions[] questionSI = {
                new Questions(questionTwo, "A", "B",""),
                new Questions(questionSix, "A", "B",""),
                new Questions(questionTen, "A", "B",""),
                new Questions(questionFourteen, "A", "B",""),
                new Questions(questionEighteen, "A", "B",""),};

        Questions[] questionTF = {
                new Questions(questionThree, "A", "B",""),
                new Questions(questionSeven, "A", "B",""),
                new Questions(questionEleven, "A", "B",""),
                new Questions(questionFifteen, "A", "B",""),
                new Questions(questionNineteen, "A", "B",""),};

        Questions[] questionsJP = {
                new Questions(questionFour, "A", "B",""),
                new Questions(questionEight, "A", "B",""),
                new Questions(questionTwelve, "A", "B",""),
                new Questions(questionSixteen, "A", "B",""),
                new Questions(questionTwenty, "A", "B",""),};

        Questions.takeEITest(questionEI);
        Questions.takeSITest(questionSI);
        Questions.takeTFTest(questionTF);
        Questions.takeJPTest(questionsJP);
        Questions.printAnswers(questionEI,questionSI,questionTF,questionsJP);

        }
    }
