
public class string4 {

    public static void main(String[] args) {
        String s1 = "Raja";
        String s2 = "Rani";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = new String("Anu");
        String s5 = new String("Banu");
        String res = s4.concat(s5).concat("Rama").concat("Seema");
        System.out.println(res);
    }
}
