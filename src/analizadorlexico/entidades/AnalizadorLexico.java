package analizadorlexico.entidades;

/**
 *
 * @author Elvio Teófilo Contreras Martinez <elvicontreras02@gmail.com>
 */
public class AnalizadorLexico {

    private int numeroLinea;

    public AnalizadorLexico() {
        numeroLinea = 0;
    }
    
    public void error(String mensajeError){
        System.out.printf("Linea %d: Error Léxico. %s.\n", getNumeroLinea(), mensajeError);
    }
    
    public void siguienteLexema(){
        int i = 0;
        char c = 0;
        int acepto = 0;
        int estado = 0;
        String mensaje = "";
        Entrada entrada;
        
        while (true) {            
            switch (c) {
                case ' ':
                case '\t':
                    System.out.print(c);//Si es espacio en blanco o tabulador lo imprime y sigue continua con el siguiente caracter
                    break;
                case '\n':
                    System.out.println();
                    numeroLinea++;//Si es el fin de la línea incrementa el número de línea, lo imprime y sigue continua con el siguiente caracter
                    break;
                case '{':
                    break;
                case '}':
                    break;
                case '[':
                    break;
                case ']':
                    break;
                case ',':
                    break;
                case ':':
                    break;
                default:
                    break;
            }
        }
    }
    
    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }
    
}
