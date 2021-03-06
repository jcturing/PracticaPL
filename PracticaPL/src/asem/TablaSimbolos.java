package asem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import errors.GestionErroresTiny;
import ast.SentenciaAbstracta;
public class TablaSimbolos {
	//guardo la informaci�n de que los identificadores en diferentes bloques correspondientes a los diferentes bloques diferentes donde se pueden declarar variables sin que haya error sem�ntico.
	private List<HashMap<String,SentenciaAbstracta>> bloques = new ArrayList<>();
	
	public void nuevaTablaSimbolos() {
		bloques.add(new HashMap<>());
	}
	public void eliminaTablaSimbolos() {
		bloques.remove(bloques.size()-1); //elimina la �ltima tabla de s�mbolos.
	}
	public void insertaSimbolo(String identificador, SentenciaAbstracta sentencia) {
		HashMap<String,SentenciaAbstracta> ultimoBloque = bloques.get(bloques.size()-1);
		if(ultimoBloque.containsKey(identificador)) {
			GestionErroresTiny.errorSemantico("ERROR. La variable " + identificador + " ya ha sido declarada.");
			//Falta lanzar excepci�n o algo
		}else {
			ultimoBloque.put(identificador,sentencia);
		}
	}
	public SentenciaAbstracta getSentenciaDeclaracion(String identificador) {
		for(int i = bloques.size()-1;i>-1;--i) {
			if(bloques.get(i).containsKey(identificador)) {
				return bloques.get(i).get(identificador);
			}
		}
		return null;
	}
}
