import java.util.List;

public class TypeInferanceRunner {
    public static void main(String[] args) {
        List<String> l1 = List.of("A","B");
        List<String> l2 = List.of("C","D");
        var typeList = List.of(l1, l2);
        typeList.stream().forEach(System.out::println);
        System.out.println(findDayOfWeekWithSwitchExpression(1));
    }
    public static String findDayOfWeek(int day){
        String str = "";
        switch(day) {
            case 0:str = "Sunday";break;
            case 1:str = "Monday";break;
            default:str = "None";
        };
        return str;
    }
    public static String findDayOfWeekWithSwitchExpression(int day){

        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> {
//                System.out.print("Do some process");
                yield "Monday";
            }
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        return dayOfWeek;
    }
}
