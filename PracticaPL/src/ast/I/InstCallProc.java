package ast.I;

import java.util.List;

import ast.E.E;
import ast.E.TipoE;

public class InstCallProc extends I {
	private String nombre_funcion;
	private List<E> argumentos;
	
	public InstCallProc(String iden, List<E> args) {
	       nombre_funcion = iden;
	       argumentos = args;
	}     
	public TipoI tipoInstruccion() {return TipoI.CALLPROC;}
	public String toString() {
		String aux = "{{_Call__}{" + nombre_funcion + "}{{_Args__}";
		for(E argumento : argumentos) aux += argumento.toString();		
		aux += "}}";
		return aux;
	}
	public String getNombre_funcion() {
		return nombre_funcion;
	}
	public List<E> getArgumentos() {
		return argumentos;
	}
}
