package juegocartas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class Jugador {

    public int TOTAL_CARTAS = 10;
    private Random r = new Random();

    private Carta[] cartas;
    boolean[] marcadas = new boolean[TOTAL_CARTAS];
    

    public void repartir() {
        cartas = new Carta[TOTAL_CARTAS];
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        for (int i = 0; i < cartas.length; i++) {
            cartas[i].mostrar(pnl, 5 + i * 40, 5);
        }
        pnl.repaint();
    }

    public String getGruposPorNombre() {
        
        boolean [] marcadas = {false,false,false,false,false,false,false,false,false,false};
        String mensaje = "No hay grupos";
        int[] contadores = new int[NombreCarta.values().length];
        for (int i = 0; i < cartas.length; i++) {
            
            if(contadores[cartas[i].getNombre().ordinal()]==0){
                contadores[cartas[i].getNombre().ordinal()]++;
            }
            else if(contadores[cartas[i].getNombre().ordinal()]>0){
                for(int j=0; j<cartas.length;j++){
                    if(cartas[i].getNombre().ordinal()==cartas[j].getNombre().ordinal()){
                        marcadas[i]= true;
                        marcadas[j]= true;
                    }
                }
                contadores[cartas[i].getNombre().ordinal()]++;
            }
        }
        //for(int i= 0; i<marcadas.length; i++){
        //    JOptionPane.showMessageDialog(null,marcadas[i]);
        //}
        
        
        int totalGrupos = 0;
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] >= 2) {
                totalGrupos++;
            }
        }
        if (totalGrupos > 0) {
            mensaje = "Los grupos encontrados fueron:\n";

            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    
                
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                }
            }
        }
        return mensaje;
    }

    public void ordenar() {
        for (int i = 0; i < cartas.length - 1; i++) {
            for (int j = i + 1; j < cartas.length; j++) {
                if (cartas[i].getIndice() > cartas[j].getIndice()) {
                    Carta ct = cartas[i];
                    cartas[i] = cartas[j];
                    cartas[j] = ct;
                }
            }
        }
    }

    public String getGruposPorEscalera() {
        boolean [] marcadas = {false,false,false,false,false,false,false,false,false,false};
        String mensaje = "No se encontraron escaleras";
        int[] contador = new int[]{1,1,1,1};
        int totalGrupos = 0;

        for (int i = 0; i < cartas.length - 1; i++) {
            int j = i + 1;
            int valor_indice_i = cartas[i].getIndice();
            int valor_indice_j = cartas[j].getIndice();
            String pinta_indice_i = String.valueOf(cartas[i].getPinta());
            String pinta_indice_j = String.valueOf(cartas[j].getPinta());
            
            if ((valor_indice_j==valor_indice_i+1)&&(pinta_indice_i.equals(pinta_indice_j))){
                switch(pinta_indice_i){
                    case "TREBOL":
                        contador[0]++;
                        marcadas[i]= true;
                        marcadas[j]= true;
                        break;
                    case "PICA":
                        contador[1]++;
                        marcadas[i]= true;
                        marcadas[j]= true;
                        break; 
                    case "CORAZON":
                        contador[2]++;
                        marcadas[i]= true;
                        marcadas[j]= true;
                        break;
                    case "DIAMANTE":
                        contador[3]++;
                        marcadas[i]= true;
                        marcadas[j]= true;
                        break;
                }
            }  
        }
        
        for(int i= 0; i<marcadas.length; i++){
            JOptionPane.showMessageDialog(null,marcadas[i]);
        }
        
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] >= 2) {
                totalGrupos++;
            }
        }
        
        if(totalGrupos>0){
            mensaje = "Las escaleras encontradas fueron:\n";
            for(int i = 0; i < contador.length; i++){
                if (contador[i] >= 2){
                    mensaje += Grupo.values()[contador[i]] + " de " + Pinta.values()[i] + "\n";
                }    
            }
        }
        
        return mensaje;
    }
}