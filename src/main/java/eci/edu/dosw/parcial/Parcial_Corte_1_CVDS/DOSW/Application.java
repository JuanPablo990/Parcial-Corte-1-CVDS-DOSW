package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class Application {
    public static void main(String[] args) {
        ServicioNotificacion servicio = new ServicioNotificacion();
        Punto5 punto5 = new Punto5(servicio);
        punto5.run(args);
    }
}