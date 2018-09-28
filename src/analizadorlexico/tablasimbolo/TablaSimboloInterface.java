package analizadorlexico.tablasimbolo;

import analizadorlexico.entidades.Entrada;

/**
 *
 * @author Elvio Teófilo Contreras Martinez <elvicontreras02@gmail.com>
 */
public interface TablaSimboloInterface {

    public void insertar(Entrada e);

    public Entrada buscar(String key);

    public void initTabla();

    public void initTablaSimbolo();

}
