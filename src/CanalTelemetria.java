public class CanalTelemetria {

    private int identificador;
    private String nombre;
    private double ultimoValor;
    private static int contadorCanales = 0;

    public CanalTelemetria(int identificador, String nombre) {
        if (identificador <= 0) {
            System.out.println("El identificador debe ser positivo.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede ser nulo o vacío");
        }
        this.identificador = identificador;
        this.nombre = nombre.trim();
        this.ultimoValor = -1.0;


        contadorCanales++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede ser nulo o vacío .");
        }
        this.nombre = nombre.trim();
    }


    public boolean registrarMedicion(double valor) {
        if (valor >= 0.0 && valor <= 100.0) {
            this.ultimoValor = valor;
            return true;
        }
        return false;
    }


    public String obtenerEstadoMedicion() {
        if (this.ultimoValor == -1.0) {
            return "Sin mediciones";
        }
        return "Última medición: " + this.ultimoValor;
    }

    public static int obtenerContadorCanales() {
        return contadorCanales;
    }
}















