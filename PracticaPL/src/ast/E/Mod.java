package ast.E;

public class Mod extends EBin {
	public Mod(E opnd1, E opnd2) {
		     super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.ELEV;}
	public String toString() {return "{{__Mod__}" + opnd1().toString() + opnd2().toString() + "}";}
}
