package StudyALG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class FeistelFunc{

    /**
     * Function F in study algorithm
     * @param R0int 8 bits number
     * @param Kint 12 bits key
     * @return f(R0,K)
     */
    public static int feistel(int R0int, int Kint) {
        String X=new String();
        String K=new String();
        String A=new String();
        String B=new String();
        String C1=new String();
        String C2=new String();
        String C3=new String();
        String C=new String();
        String Y=new String();
        X = toBinar(R0int);
        K = toBinar(Kint);
        X = extentiontoByte(X);
        K=extentiontoTwelveBits(K);
        A=EandP(X);

        B=extentiontoTwelveBits(xor(A,K));

        String A3=new String(B.substring(8,12));
        String A2=new String(B.substring(4,8));
        String A1=new String(B.substring(0,4));

        C1=S1(A1);
        C2=S2(A2);
        C3=S3(A3);
        C=C1.concat(C2.concat(C3));
        Y=P(C);

        int  result= new BigInteger(Y,2).intValue();

        if (StudyAlgorithm.isPermissionToWrite()==true) {
            StudyAlgorithm.addStringinList("<-----------------------------> ");
            StudyAlgorithm.addStringinList("Половина для пребразования функцией Фейстеля "+R0int);
            StudyAlgorithm.addStringinList("Ключ для функции Фейстеля  "+Kint);
            StudyAlgorithm.addStringinList("Двоичное число для шифрования "+X);
            StudyAlgorithm.addStringinList("Двоичный ключ для шифрования "+K);
            StudyAlgorithm.addStringinList("Результат расширения и перестановки "+A);
            StudyAlgorithm.addStringinList("Результат взаимного исключения с Ключом "+B);
            StudyAlgorithm.addStringinList("Левая половина прошлого шага "+A1);
            StudyAlgorithm.addStringinList("Средняя половина прошлого шага "+A2);
            StudyAlgorithm.addStringinList("Правая половина прошлого шага "+A3);
            StudyAlgorithm.addStringinList("Левая половина после преобразования "+C1);
            StudyAlgorithm.addStringinList("Средняя половина после преобразования "+C2);
            StudyAlgorithm.addStringinList("Правая половина после преобразования "+C3);
            StudyAlgorithm.addStringinList("Результат конкатенации двух половин "+C);
            StudyAlgorithm.addStringinList("Результат конечной перестановки "+Y);
            StudyAlgorithm.addStringinList("<-----------------------------> ");
        }
        return result;
    }

    public static String EandP(String R0){
        int[] E;
        E=StudyAlgorithm.EandP;
        String ER=new String();
        for (int i=0;i<12;i++){
            ER=ER.concat(String.valueOf(R0.charAt(E[i]-1)));
        }
        ER=extentiontoTwelveBits(ER);
        return ER;
    }

    public static int[] EandP(int[] R0){
        int[] E;
        E=StudyAlgorithm.EandP;
        int[] ER=new int[E.length];
        for (int i=0;i<12;i++){
            ER[i]=R0[E[i]-1];
        }
        return ER;
    }

    public static String S1(String L1){
        int[] E;
        E=StudyAlgorithm.S1;
        String result=new String();
        result=extentiontoThreeBits(toBinar(E[new BigInteger(L1,2).intValue()]));
        return result;
    }
    /*
    public static int[] S1(int[] L1){
        int[] S;
        S=StudyAlgorithm.S1;
        int[] result=new int[S.length];
        result=extentiontoThreeBits(toBinar(E[new BigInteger(L1,2).intValue()]));
        return result;
    }
    */

    public static String S2(String M1){
        int[] E;
        E=StudyAlgorithm.S2;
        String result=new String();
        result=extentiontoThreeBits(toBinar(E[new BigInteger(M1,2).intValue()]));
        return result;
    }

    public static String S3(String R1){

        int[] E;

        E=StudyAlgorithm.S3;
        String result=new String();

        int[] D={
                0,3,1,2
        };

        String DOP=new String();
        for(int i=0;i<4;i++){
            DOP=DOP.concat(String.valueOf(R1.charAt(D[i])));
        }
        int  R1int= new BigInteger(DOP,2).intValue();
        result=toBinar(E[R1int]);
        result= extentiontoTwoBits(result);
        return result;
    }

    public static String P(String str){
        int[] E;
        E=StudyAlgorithm.P;
        String result=new String();
        for(int i=0;i<8;i++){
            result=result.concat(String.valueOf(str.charAt(E[i]-1)));
        }

        return result;
    }

    public static int[] P(int[] C){
        int[] P;
        P=StudyAlgorithm.P;
        int[] result=new int[P.length];
        for(int i=0;i<8;i++){
            result[i]=C[P[i]-1];
        }
        return result;
    }

    public static int[] invP(int[] C){
        int[] P;
        P=StudyAlgorithm.P;
        int[] result=new int[P.length];
        for(int i=0;i<8;i++){
            result[P[i]-1]=C[i];
        }
        return result;
    }

    public static String xor(String x,String y){
        int  X= new BigInteger(x,2).intValue();
        int  Y= new BigInteger(y,2).intValue();
        int result=X^Y;
        return toBinar(result);
    }

    public static int xor(int x,int y){
        return x^y;
    }

    public static int  swapString(int str){
        int a=str/256;
        int b=str%256;
        int result=b*256+a;
        return result;
    }

    public static String swapString(String str){
        String a=str.substring(0,8);
        String b=str.substring(8,16);
        String result =b.concat(a);
        return result;
    }

    public static String extentiontoByte(String result){

        while(result.length()<8){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoTwoBytes(String result){

        while(result.length()<16){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoThreeBits(String result){

        while(result.length()<3){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoFourBits(String result){

        while(result.length()<4){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoTwoBits(String result){

        while(result.length()<2){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoTenBits(String result){

        while(result.length()<10){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoTwelveBits(String result){

        while(result.length()<12){
            result="0".concat(result);
        }
        return result;
    }

    public static String extentiontoNBit(String result, int N){

        while(result.length()<N){
            result="0".concat(result);
        }
        return result;
    }

    public static int[] transfertoarray(String input){
        String[] sr= input.split(" ");
        int[] E=new int[sr.length];
        for(int i=0;i<sr.length;i++){
            E[i]= new BigInteger(sr[i]).intValue();
        }
        return E;
    }

    public static String toBinar(int number){
        return Integer.toBinaryString(number);
    }

    /**
     *
     * @param str binarystring
     * @return integer number
     */
    public static int toInt(String str){
        int res=new BigInteger(str,2).intValue();
        return res;
    }
}
