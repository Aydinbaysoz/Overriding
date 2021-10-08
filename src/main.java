public class main {
    public static void main(String[] args) {

        Base [] base = new Base[]{new TeacherCredit(), new StudentCredit(), new FarmerCredit()};
        for (Base creditBase: base){
            System.out.println("Credits: " + creditBase.calculate(100000));
        }
    }
}
