package BalaCanhao;

public class Canhao {

    public Bala bala = new Bala();

    
    public void disparar( double veloInit , double angulo ){
    //X = Vo^2 . Sen (2 . Ângulo) / g 
        double anguloRadianos = Math.toRadians(angulo) * 2 ;

        double x =  (veloInit * veloInit)  * (Math.sin(anguloRadianos) ) / 10;
        bala.setPosicaoX(x);
    }

    public double getAlcanceMaximo(){
        
        return bala.getPosicaoX();
    }

    public void setBala(){
        bala.setPosicaoX(0);
        bala.setPosicaoY(0);
    }
    
}
