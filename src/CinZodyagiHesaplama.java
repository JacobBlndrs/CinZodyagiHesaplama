import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumyili,zodDeger;
        String zodyag="";

        Scanner inp=new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz : ");
        dogumyili=inp.nextInt();
        zodDeger=dogumyili % 12 ;

        if (zodDeger==0){
            zodyag="Maymun";
        }else if ( zodDeger==1) {
            zodyag="Horoz";
        }else if (zodDeger == 2 ){
            zodyag="Kopek";
        } else if (zodDeger == 3 ) {
            zodyag="Domuz";
        } else if (zodDeger == 4) {
            zodyag="Fare";
        } else if (zodDeger == 5 ) {
            zodyag="Okuz";
        } else if (zodDeger== 6 ) {
            zodyag="Kaplan";
        } else if (zodDeger==7) {
            zodyag="Tavşan";
        } else if (zodDeger== 8) {
            zodyag="Ejdarha";
        } else if (zodDeger == 9) {
            zodyag="Yilan";
        } else if (zodDeger == 10) {
            zodyag="At";
        } else if (zodDeger == 11) {
            zodyag="Koyun";
        }

        System.out.println("Dogum Yiliniza Gore Cin Zodyaginiz : "+ zodyag);
    }
}
