package enumStructure.ex04;

public class Ex04Main {
    public static void main(String[] args) {

        Aylar ay=Aylar.SUBAT;
        ay.getGunMiktari();
        System.out.println("secilen ayin gun sayisi :"+ay.days);
        System.out.println("ay :"+ay);

    }
}
