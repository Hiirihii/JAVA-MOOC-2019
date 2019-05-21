
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class Piilo<T> {

    private ArrayList<T> piilotettu = new ArrayList<>();

    public void laitaPiiloon(T piilotettava) {
         boolean arvo = this.piilotettu.isEmpty();
          if (arvo == true){
           this.piilotettu.add(piilotettava);   
          }  else{
              this.piilotettu.remove(0);
              this.piilotettu.add(piilotettava);
          }
    

    }

    public T otaPiilosta() {
        
        if (this.piilotettu.size() > 0) {
            T arvo = this.piilotettu.remove(0);
            return arvo;
        }
      return null;
    }

    public boolean onkoPiilossa() {
        
        boolean arvo = this.piilotettu.isEmpty();
          if (arvo == true){
            return false; 
          }  else{
              
               return true;         
          }
            
    }   

    
}
