// Definición de la clase Politico para representar la entidad seleccionada
public class Politico {
    // Atributo 1: Nombre completo del político
    private String nombre;
    // Atributo 2: Partido político al que pertenece
    private String partido;
    // Atributo 3: Cargo público actual que desempeña
    private String cargo;
    // Atributo 4: Edad en años
    private int edad;
    // Atributo 5: Años de experiencia en el ámbito público
    private int anosExperiencia;
    // Atributo 6: Indica si el político se encuentra actualmente en funciones
    private boolean enActivo;

    // Constructor que inicializa los 6 atributos de la clase al crear un objeto
    public Politico(String nombre, String partido, String cargo, int edad, int anosExperiencia, boolean enActivo) {
        // Asigna el parámetro nombre al atributo de la instancia
        this.nombre = nombre;
        // Asigna el parámetro partido al atributo de la instancia
        this.partido = partido;
        // Asigna el parámetro cargo al atributo de la instancia
        this.cargo = cargo;
        // Asigna el parámetro edad al atributo de la instancia
        this.edad = edad;
        // Asigna el parámetro anosExperiencia al atributo de la instancia
        this.anosExperiencia = anosExperiencia;
        // Asigna el parámetro enActivo al atributo de la instancia
        this.enActivo = enActivo;
    }

    // Acción 1: Simula la presentación de una propuesta legislativa o gubernamental
    public void presentarPropuesta(String propuesta) {
        // Imprime en consola la propuesta presentada por el político
        System.out.println(this.nombre + " ha presentado la propuesta: " + propuesta);
    }

    // Acción 2: Simula el proceso de votación sobre un proyecto o ley
    public void votarProyecto(String proyecto, boolean aFavor) {
        // Determina el sentido del voto según la variable booleana recibida
        String sentido = aFavor ? "A FAVOR" : "EN CONTRA";
        // Imprime en consola la decisión de voto tomada por el político
        System.out.println(this.nombre + " voto " + sentido + " en el proyecto: " + proyecto);
    }

    // Acción 3: Simula la participación del político en un debate público
    public void participarEnDebate(String tema) {
        // Imprime el mensaje indicando el tema sobre el cual está debatiendo
        System.out.println(this.nombre + " está participando en un debate sobre: " + tema);
    }

    // Acción 4: Cambia el estado del atributo enActivo a falso simulando un retiro
    public void retirarDeCargo() {
        // Modifica el estado de actividad del político
        this.enActivo = false;
        // Notifica en consola que el político se ha retirado
        System.out.println(this.nombre + " ha finalizado sus funciones y pasa a estar inactivo.");
    }

    // Acción 5: Incrementa en un año los años de experiencia del político
    public void cumplirAnoDeGestion() {
        // Incrementa la variable de experiencia en una unidad
        this.anosExperiencia++;
        // Notifica el nuevo total de años acumulados de experiencia
        System.out.println(this.nombre + " ha cumplido un año más de gestión. Experiencia total: " + this.anosExperiencia + " años.");
    }

    // Métodos Getter para acceder a los atributos desde la clase gestora de la tabla
    public String getNombre() { return nombre; }
    public String getPartido() { return partido; }
    public String getCargo() { return cargo; }
    public int getEdad() { return edad; }
    public int getAnosExperiencia() { return anosExperiencia; }
    public boolean isEnActivo() { return enActivo; }
}