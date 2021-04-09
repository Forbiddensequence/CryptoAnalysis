package StudyALG;

import java.awt.*;
import java.util.ArrayList;

public class Equation implements Cloneable{
    public int[] getX() {
        return X;
    }

    public int[] X;

    public String getXType() {
        return XType;
    }

    public String XType;
    public int[] Y;

    public int[] getY() {
        return Y;
    }

    public String YType;

    public String getYType() {
        return YType;
    }

    public int[] K;

    public int[] getK() {
        return K;
    }

    public String KType;

    public String getKType() {
        return KType;
    }

    public int[] C;

    public int[] getC() {
        return C;
    }

    public String CType;

    public String getCType() {
        return CType;
    }

    public int round;
    public double probability;

    public int getRound() {
        return round;
    }

    public Equation(int[] X, int[] K, int[] C, String Type){
        this.CType =Type;
        this.X=X;
        this.K=K;
        this.C=C;
        this.Y=new int[0];
        //Type это поле отвечающее за тип доп переменной в уравнении
        this.KType="K";
        this.YType="Y";
        this.XType="X";
    }

    public void setRound(int round) {
        this.round = round;
        int[] newX=new int[this.X.length];
        int[] newK=new int[this.K.length];
        for(int i=0;i<newK.length;i++){
            newK[i]=this.K[i];
        }
        for(int i=0;i<newX.length;i++){
            newX[i]=this.X[i];
        }
        this.K=newK;
        this.X=newX;
        for(int i=0;i<this.K.length;i++){
            this.K[i]+=(round-1)*6;
        }
        int shift=1;
        if(round==2){
            shift=0;
        }
        for(int i=0;i<X.length;i++){
            X[i]+=shift*8;
        }

        switch (round){
            case(1):
                this.KType="K";
                this.YType="Y";
                this.XType="X";
                break;
            case(2):
            //case(3):
                this.XType="B";
                break;
            case(3):
                this.XType="Y";
                /*
                this.Y=this.X;
                this.X=new int[0];
                break;
             */
        }
    }

    public void executeLSAinEquation(String[] LSA,double probability){
        int size=0;
        String alpha=LSA[0];
        String beta=LSA[1];
        for(int i=0;i<alpha.length();i++){
            if(String.valueOf(alpha.charAt(i)).equals("1")){
                size++;
            }
        }
        int[] Xarr =new  int[size];
        int[] Karr =new  int[size];
        for(int i=0, k=0;i<alpha.length();i++){
            if(String.valueOf(alpha.charAt(i)).equals("1")){
                Xarr[k]=this.X[i];
                Karr[k]=this.K[i];
                k++;
            }
        }
        size=0;
        for(int i=0;i<beta.length();i++){
            if(String.valueOf(beta.charAt(i)).equals("1")){
                size++;
            }
        }
        int[] Carr =new int[size];
        for(int i=0, k=0;i<beta.length();i++){
            if(String.valueOf(beta.charAt(i)).equals("1")){
                Carr[k]=this.C[i];
                k++;
            }
        }
        this.X=Xarr;
        this.K=Karr;
        this.C=Carr;
        this.probability=probability;
    }

    public void executeEquation(String[] LSA,int round,double probability){
        setRound(round);
        executeLSAinEquation(LSA,probability);
        //showequation();
        //simplilfyEquation();
        showequation();
    }

    public void simplilfyEquation(){
        switch (this.round){
            case(1):
                int[] Xnew=new int[X.length +C.length];
                int counter=0;
                for(int i=0;i<X.length;i++){
                    Xnew[counter]=X[i];
                    counter++;
                }
                for(int i=0;i<C.length;i++){
                    Xnew[counter]=C[i];
                    counter++;
                }
                this.X=Xnew;
                this.Y=Xnew;
                int[] Knew=new int[2*K.length];
                for(int i=0;i<K.length;i++){
                    Knew[2*i]=K[i];
                    Knew[2*i+1]=K[i]+12;
                }
                this.K=Knew;
                this.C=new int[0];
                this.probability=calcprobabilitymerge(this.probability,this.probability);
                break;
            case(2):

                break;
        }
    }

    /**
     * Equation объект из 1 раунда или из 3
     * @param rightEquation
     * @return
     */
    public Equation mergeEquationwithround1(Equation rightEquation){
        int[] B=this.getX();
        int[] Xnewarr=rightEquation.getX();
        int[] Knewarr=rightEquation.getK();
        int[] Xaddarr=this.getX();
        int[] Kaddarr=this.getK();
        int[] AddarrX=new int[Xnewarr.length+Xaddarr.length];
        int[] AddarrKey=new int[Knewarr.length+Kaddarr.length];
        for(int i=0;i<AddarrX.length;i++){
            if(i<Xnewarr.length){
                AddarrX[i]=Xnewarr[i];
            }
            else{
                AddarrX[i]=Xaddarr[i-Xnewarr.length];
            }
        }
        for(int i=0;i<AddarrKey.length;i++){
            if(i<Knewarr.length){
                AddarrKey[i]=Knewarr[i];
            }
            else{
                AddarrKey[i]=Kaddarr[i-Knewarr.length];
            }
        }
        this.X=AddarrX;
        int[] newarrX=this.X;
        this.X=newarrX;
        Xnewarr=this.getX();
        Xaddarr=this.getC();
        AddarrX=new int[Xnewarr.length+Xaddarr.length];
        int[] AddarrY=new int[Xaddarr.length];
        for(int i=0;i<AddarrX.length;i++){
            if(i<Xnewarr.length){
                AddarrX[i]=Xnewarr[i];
            }
            else{
                AddarrX[i]=Xaddarr[i-Xnewarr.length]+8;
                AddarrY[i-Xnewarr.length]=Xaddarr[i-Xnewarr.length]+8;
            }
        }
        this.X=AddarrX;
        this.Y=AddarrY;
        this.K=AddarrKey;
        this.XType="X";
        this.C=new int[0];
        this.probability=calcprobabilitymerge(this.probability,rightEquation.probability);
        return this;
    }

    public Equation mergeEquationwithround3(Equation rightEquation){
        int[] B=this.getX();
        int[] Xnewarr=rightEquation.getX();
        int[] Knewarr=rightEquation.getK();
        int[] Xaddarr=this.getX();
        int[] Kaddarr=this.getK();
        int[] AddarrX=new int[Xnewarr.length+Xaddarr.length];
        int[] AddarrKey=new int[Knewarr.length+Kaddarr.length];
        for(int i=0;i<AddarrX.length;i++){
            if(i<Xnewarr.length){
                AddarrX[i]=Xnewarr[i];
            }
            else{
                AddarrX[i]=Xaddarr[i-Xnewarr.length];
            }
        }
        for(int i=0;i<AddarrKey.length;i++){
            if(i<Knewarr.length){
                AddarrKey[i]=Knewarr[i]+12;
            }
            else{
                AddarrKey[i]=Kaddarr[i-Knewarr.length];
            }
        }
        this.Y=AddarrX;
        int[] newarrX=this.Y;
        this.Y=newarrX;
        Xnewarr=this.getY();
        Xaddarr=this.getC();
        AddarrX=new int[Xnewarr.length+Xaddarr.length];
        int[] AddarrY=new int[Xaddarr.length];
        for(int i=0;i<AddarrX.length;i++){
            if(i<Xnewarr.length){
                AddarrX[i]=Xnewarr[i];
            }
            else{
                AddarrX[i]=Xaddarr[i-Xnewarr.length]+8;
                AddarrY[i-Xnewarr.length]=Xaddarr[i-Xnewarr.length]+8;
            }
        }
        this.Y=AddarrX;
        this.X=AddarrY;
        this.K=AddarrKey;
        this.XType="X";
        this.C=new int[0];
        this.probability=calcprobabilitymerge(this.probability,rightEquation.probability);
        this.XType="X";
        return this;
    }
    public double calcprobabilitymerge(double p1, double p2){
        return (2*p1*p2+1-p1-p2);
    }

    public void showequation(){
        String result=new String();
        for (int i=0;i<X.length;i++){
            result=result.concat(this.XType+String.valueOf(X[i])+"\u2295");
        }
        for (int i=0;i<C.length;i++){
            result=result.concat(this.CType+String.valueOf(C[i])+"\u2295");
        }
        for (int i=0;i<Y.length;i++){
            result=result.concat(this.YType+String.valueOf(Y[i])+"\u2295");
        }
        result=result.substring(0,result.length()-1);
        result=result.concat(" = ");
        for (int i=0;i<K.length;i++){
            result=result.concat(this.KType+String.valueOf(K[i])+"\u2295");
        }
        result=result.substring(0,result.length()-1);
        System.out.println(result+" with p = "+this.probability);
    }

    public boolean isinC(int Cel){
        boolean ishere=false;
        for (int i=0;i<this.C.length;i++){
            if(this.C[i]==Cel) {
                ishere = true;
            }
        }
        return ishere;
    }

    public boolean isinC(int[] Cel){
        boolean ishere=false;
        for (int j=0;j<Cel.length;j++) {
            ishere=false;
            for (int i=0;i<this.C.length;i++){
                if(this.C[i]==Cel[j]) {
                    ishere = true;
                }
            }
            if(!ishere){
                break;
            }
        }
        for (int i=0;i<this.C.length;i++) {
            ishere=false;
            for (int j=0;j<Cel.length;j++){
                if(this.C[i]==Cel[j]) {
                    ishere = true;
                }
            }
            if(!ishere){
                break;
            }
        }
        return ishere;
    }
/*
    public Equation(Equation Eq1) throws CloneNotSupportedException{
        this(Eq1.getX(),Eq1.getK(),Eq1.getC(),Eq1.getCType());
        /*
        Eq1.X=this.X;
        Eq1.XType=this.XType;
        Eq1.Y=this.Y;
        Eq1.YType=this.YType;
        Eq1.K=this.K;
        Eq1.KType=this.KType;
        Eq1.C=this.C;
        Eq1.CType=this.CType;
        Eq1.round=this.round;

         */
        //return Eq1;
    //}

    public Equation copyEquation(Equation Eq) {
        int[] Xnew=new int[this.X.length];
        int[] Cnew=new int[this.C.length];
        int[] Ynew=new int[this.Y.length];
        int[] Knew=new int[this.K.length];
        for(int i=0;i<Xnew.length;i++){
            Xnew[i]=Eq.X[i];
        }
        for(int i=0;i<Cnew.length;i++){
            Cnew[i]=Eq.C[i];
        }
        for(int i=0;i<Ynew.length;i++){
            Ynew[i]=Eq.Y[i];
        }
        for(int i=0;i<Knew.length;i++){
            Knew[i]=Eq.K[i];
        }
        this.XType=Eq.XType;
        this.CType=Eq.CType;
        this.YType=Eq.YType;
        this.KType=Eq.KType;
        this.X=Xnew;
        this.Y=Ynew;
        this.C=Cnew;
        this.K=Knew;
        this.probability= Eq.probability;
        return this;
    }

    public void clear() {
        int counter=0;
        ArrayList<Integer> listofel=new ArrayList<Integer>();
        for(int i=0;i<this.X.length;i++){
            //тут

        }
    }
}
