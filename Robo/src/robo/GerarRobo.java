/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robo;
import java.util.Date;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerarRobo {
    
    private String nome, dtFab;
    private int bateria;

   
    public GerarRobo(){
        nome = "C3PO";
        dtFab = "23/10/1997";
        bateria = 5;
    }
   
    public String getNome(){
        return nome;
    }
    
    public String getData(){
        return dtFab;
    }
    
   public double Soma(double n1, double n2) {
       return n1 + n2;
   }
   
  public double Subt(double n1, double n2){
      return n1 - n2;
  }

  public double Mult(double n1, double n2){
      return n1 * n2;
  }
  
  public double Div(double n1, double n2){
      if(n2>0){
        return n1 / n2;
      }
      else
          return 0;
              
  }
  
  public int getBateria(){
      return bateria;
  }
  
  public void setBateria(int x, int op){
      if(op == 1)
       bateria = x - 1;
      if(op == 2)
          bateria = 5;
  }
  
 
  
}
