/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Jose G Garcia A
 */
public class Operaciones {
    float num, num2;
    
    public Operaciones(float num, float num2){
        this.num = num; 
        this.num2 = num2;
    }
    
    public float sumar(){
        return (this.num + this.num2);
    }
    
    public float restar(){
        return (this.num - this.num2);
    }
    
    public float multiplicar(){
        return (this.num * this.num2);
    } 
    
    public float dividir(){
        return (this.num / this.num2);
    }
}
