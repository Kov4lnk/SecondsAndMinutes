public class Main {
    public static void main(String[] args) {

        System.out.println(SecondsAndMinutes.getDurationString(25, 45));
        System.out.println(SecondsAndMinutes.getDurationString(601, 01));
        System.out.println(SecondsAndMinutes.getDurationString(1));
        System.out.println(SecondsAndMinutes.getDurationString(666));
        System.out.println(SecondsAndMinutes.getDurationString(61, 0));
        System.out.println(SecondsAndMinutes.getDurationString(-36));

    }
}
