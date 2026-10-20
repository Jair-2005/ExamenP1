//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n Telemetria ");


        CanalTelemetria canal1 = new CanalTelemetria(1, "Temperatura");
        System.out.println("Crear canal\nTempertura: " + canal1.obtenerEstadoMedicion());


        boolean res1 = canal1.registrarMedicion(45.0);
        System.out.println("Registrar 45.0 " + res1);


        System.out.println("Consultar estado: " + canal1.obtenerEstadoMedicion());


        boolean res2 = canal1.registrarMedicion(120.0);
        System.out.println("Registrar 120.0 " + res2 + "; conserva " + canal1.obtenerEstadoMedicion());


        boolean res3 = canal1.registrarMedicion(0.0);
        System.out.println("Registrar 0.0 " + res3 + "; actualiza a " + canal1.obtenerEstadoMedicion());


        System.out.println("Consultar estado nuevamente " + canal1.obtenerEstadoMedicion());


        System.out.println("Total de canales creados exitosamente: " + CanalTelemetria.obtenerContadorCanales());
    }
}