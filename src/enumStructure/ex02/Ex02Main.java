package enumStructure.ex02;

public class Ex02Main {
    public static void main(String[] args) {

        User kullanici=new User();
        kullanici.name="said";
      //  kullanici.role=1;
      //  kullanici.status=3;
        kullanici.yetkisi=Role.ADMIN;
        kullanici.durum=Status.LOGIN;


        User kullanici1=new User();
        kullanici.name="oner";
        kullanici1.yetkisi=Role.CUSTOMER;
        kullanici1.durum=Status.ACTIVE;


        if (kullanici.yetkisi==Role.CUSTOMER){
            System.out.println("silme yetkiniz yok");
        }
    }
}
