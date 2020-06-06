package ast.I;

import java.util.ArrayList;
import java.util.List;

import ast.E.E;
import ast.E.*;

public class InstDeclaracion extends I {
	private boolean constant;
	private String tipo;
	private E iden;
	private List<E> tam;
	private List<E> valor;
	
   public InstDeclaracion(boolean constant, String tipo, E iden, List<E> tam, List<E> valor) {
	    this.constant = constant;
		this.tipo = tipo;
	    this.iden = iden;
	    this.tam = tam;
	    this.valor = valor;
	}
   
   public TipoI tipo() {return TipoI.DECL;}
   
   public String toString() {
	   String aux = "{{_Decl__}";
	   if(constant) aux += "{Const}";
	   aux += "{" + tipo + "}" + iden.toString();
	   
	   if(tam.isEmpty()) { //Es una variable simple
		   if(valor != null) { //Esta inicializada
			   aux += valor.toString();
		   }
	   }
	   else { //Es una variable vector   
		   aux += "{{__Tam__}" + tam.toString() + "}";
		   if(valor != null) { //Esta inicializada
			   aux += "{{__Ini__}";
			   for(E v : valor) {
				   aux += v.toString();
			   }
			   aux += "}";
		   }
	   }
	   aux += "}";
	   return aux;
   }

}