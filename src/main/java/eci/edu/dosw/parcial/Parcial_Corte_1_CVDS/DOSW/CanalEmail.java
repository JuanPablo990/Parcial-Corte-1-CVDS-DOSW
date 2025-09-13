package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class CanalEmail implements CanalNotificacion {
    @Override
    public void envian(String mensaje) {
        System.out.println("Enviando mensaje por Email: " + mensaje);
    }
}