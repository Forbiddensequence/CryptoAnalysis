package StudyALG;

public class Expression {
    int[] K;
    double probability;
    int result;
    Expression(int[] K,double probability,int result){
        this.K=K;
        this.probability=probability;
        this.result=result;
    }

    public void showExpression(){
        String resultS=new String();
        for (int i=0;i<K.length;i++){
            resultS=resultS.concat("K"+String.valueOf(K[i])+"\u2295");
        }
        resultS=resultS.substring(0,resultS.length()-1);
        resultS=resultS.concat(" = ");
        resultS=resultS.concat(String.valueOf(this.result));
        System.out.println(resultS+" with p = "+this.probability);
    }
}
