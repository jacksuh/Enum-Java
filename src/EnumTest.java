public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case SEGUNDA:
                System.out.println("Mondays are bad.");
                break;

            case SEXTA:
                System.out.println("Fridays are better.");
                break;

            case SÁBADO: case DOMINGO:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }

}
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.DOMINGO);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.QUARTA);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.SEXTA);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SÁBADO);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.DOMINGO);
        seventhDay.tellItLikeItIs();
    }
}
