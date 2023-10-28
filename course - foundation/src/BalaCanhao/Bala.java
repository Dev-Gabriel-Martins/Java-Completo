package BalaCanhao;

public class Bala {
    public double x;
    public double y;

    public Bala(){
    }

    public Bala(double x , double y){
        this.x = x;
        this.y = y;
    }

    public void setPosicaoX(double x){
        this.x = x;
    }

    public void setPosicaoY(double y){
        this.y = y;
    }
    
    public double getPosicaoX(){
        return x;
    }

    public double getPosicaoY(){
        return y;
    }

}
