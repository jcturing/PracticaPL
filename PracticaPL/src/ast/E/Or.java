package ast.E;

import ast.E.TipoE;

public class Or extends EBin {
   public Or(E opnd1, E opnd2) {
	     super(opnd1,opnd2);  
   }     
   public TipoE tipo() {return TipoE.OR;}
   public String toString() {return "{{__OR___}"+opnd1().toString()+opnd2().toString()+"}";}
}
