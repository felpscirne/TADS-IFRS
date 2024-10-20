import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int horaFim = 0,minFim = 0,horaInicio = 0,minInicio = 0, totalHora = 0, duracaoHora = 0, totalMin = 0;

        while(true){

            System.out.println("DIGITE A HORA DE INICIO DO EXPEDIENTE HH:MM");
            horaInicio = scan.nextInt();
            
            if (horaInicio == -1) {
                break;
             }

            minInicio = scan.nextInt();

            System.out.println("DIGITE A HORA DO FIM DO EXPEDIENTE HH:MM");
            horaFim = scan.nextInt();
            minFim = scan.nextInt();
              
            if (horaFim <= horaInicio) {
                horaFim = horaFim + 24;    
            }

            if (minFim <= minInicio) {
                minFim = minFim + 60;
            }

            duracaoHora = horaFim - horaInicio;
            totalHora = totalHora + duracaoHora;
            totalMin = minFim - minInicio;
        }

        totalHora = totalHora + (totalMin / 60);
        totalMin = totalMin % 60;
        
        System.out.println("TEMPO TOTAL TRABALHADO: " + totalHora + ":" + totalMin + "H");
            
        
    }
}
