import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        String stringADevolver = "";
	//pruebas
        if (palabras.size() > 0){
            for (int i = 0; i < palabras.size() - 1; i++){
                for (int j = 0; j < palabras.size() - 1 - i; j++){
                    if (palabras.get(j).length() < palabras.get(j+1).length()){
                        palabras.add(j, palabras.get(j+1));
                        palabras.remove(j+2);
                    }
                }
            }

            for (int k = 0; k < palabras.size() - 1; k++){
                if (palabras.get(k).length() == palabras.get(k+1).length()){
                    palabras.add(k, palabras.get(k+1));
                    palabras.remove(k+2);
                }
                
                stringADevolver = stringADevolver + palabras.get(k) + ",";
            }

            stringADevolver = stringADevolver + palabras.get(palabras.size()-1);
        }
        
        return stringADevolver;
    }
}
