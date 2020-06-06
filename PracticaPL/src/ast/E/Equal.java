package ast.E;

import ast.E.TipoE;

public class Equal extends EBin {
	public Equal(E opnd1, E opnd2) {
	     super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.EQUAL;}
	public String toString() {return "{{__EQ___}"+opnd1().toString() + opnd2().toString()+"}";}
}