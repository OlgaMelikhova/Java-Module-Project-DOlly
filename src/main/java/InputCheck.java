public class InputCheck {
    Float floatValue;
    String input;
    boolean correct;

     InputCheck(String InputPrice) {
        input = InputPrice;
        correct = isNumeric(InputPrice);
        if (correct) {
            floatValue = Float.parseFloat(input);
            if (floatValue < 0.01) {
                correct = false;
            }
        }

     }
    public static boolean isNumeric(String s) //введённое значение можно преобразовать в число?
    {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }


}
