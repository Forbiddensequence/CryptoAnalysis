package StudyALG;

import java.math.BigInteger;

public class Alcorithme {

    public static int round(int Word,int k) {

        String word = new String();
        word = Integer.toBinaryString(Word);
        word = FeistelFunc.extentiontoTwoBytes(word);
        String RS = new String(word.substring(8,16));
        String LS = new String(word.substring(0,8));
        String NK = new String(Integer.toBinaryString(k));
        NK = FeistelFunc.extentiontoTwelveBits(NK);
        int  R = new BigInteger(RS,2).intValue();
        int  L = new BigInteger(LS,2).intValue();
        int Fei = FeistelFunc.feistel(R,k);
        int NR = FeistelFunc.xor(L,Fei);
        int NL = R;
        String NRS = new String(FeistelFunc.extentiontoByte(Integer.toBinaryString(NR)));
        String NLS = new String(FeistelFunc.extentiontoByte(Integer.toBinaryString(NL)));
        String Result=new String();
        Result=NLS.concat(NRS);
        int result =new BigInteger(Result,2).intValue();

        if (StudyAlgorithm.isPermissionToWrite()==true) {
            StudyAlgorithm.addStringinList("|-----------------------------| ");
            StudyAlgorithm.addStringinList("Входное слово раунда " + Word);
            StudyAlgorithm.addStringinList("Входное слово раунда " + word);
            StudyAlgorithm.addStringinList("Входной ключ "+ k);
            StudyAlgorithm.addStringinList("Левая половина слова " + LS);
            StudyAlgorithm.addStringinList("Правая половина слова "+ RS);
            StudyAlgorithm.addStringinList("Входной ключ для функции учебного алгоритма "+ NK);
            StudyAlgorithm.addStringinList("Резульльтат функции фейстеля " +Fei);
            StudyAlgorithm.addStringinList("Новая левая половина " +NLS);
            StudyAlgorithm.addStringinList("Новая правая половина " +NRS);
            StudyAlgorithm.addStringinList("Итоговое слово раунда " +result);
            StudyAlgorithm.addStringinList("|-----------------------------| ");
        }

        return result;
    }

    public static int studyalgorithme(int Word, int[] Key){
        String wordS=new String();
        wordS=Integer.toBinaryString(Word);
        wordS=FeistelFunc.extentiontoByte(wordS);
        int Round1;
        int Round2;
        int Round3;
        Round1=round(Word,Key[0]);
        Round2=round(Round1,Key[1]);
        Round3=round(Round2,Key[2]);
        Round3=FeistelFunc.swapString(Round3);
        int result=Round3;

        if (StudyAlgorithm.isPermissionToWrite()==true) {
            StudyAlgorithm.addStringinList("Слово перед работой алгоритма " + Word);
            StudyAlgorithm.addStringinList("Слово перед начальной перестановкой " + wordS);
            StudyAlgorithm.addStringinList("Слово после первого раунда " + Round1);
            StudyAlgorithm.addStringinList("Слово после второго раунда " + Round2);
            StudyAlgorithm.addStringinList("Слово после третьего раунда " + Round3);
            StudyAlgorithm.addStringinList("Слово после работы алгоритма " + result);
        }

        return result;
    }

/*
    public static int studyalgorithmeinversion(int Word, int[] Key){
        SDES.addStringinList("Слово перед работой обратного алгоритма " + Word);
        String wordS=new String();
        wordS=Integer.toBinaryString(Word);
        wordS=Feistel.extentiontoByte(wordS);
        SDES.addStringinList("Слово перед начальной перестановкой " + wordS);
        String wordIP=new String();
        wordIP=IP(wordS);
        SDES.addStringinList("Слово после начальной перестановки " + wordIP);
        //wordIP=Feistel.extentiontoByte(wordIP);
        int  PREV= new BigInteger(wordIP,2).intValue();
        int Round1;
        int Round2;
        Round1=round(PREV,Key[1]);
        //Round1=Feistel.swapString(Round1);
        SDES.addStringinList("Слово после первого раунда " + Round1);
        Round2=round(Round1,Key[0]);
        Round2=Feistel.swapString(Round2);
        SDES.addStringinList("Слово после второго раунда " + Round2);
        String wordIPprinv=new String();
        wordIPprinv=Integer.toBinaryString(Round2);
        wordIPprinv=Feistel.extentiontoByte(wordIPprinv);
        SDES.addStringinList("Слово перед конечной перестановкой " + wordIPprinv);
        String wordIPinv=new String();
        wordIPinv=IPinv(wordIPprinv);
        SDES.addStringinList("Слово после конечной перестановки " + wordIPinv);
        int result=new BigInteger(wordIPinv,2).intValue();
        SDES.addStringinList("Слово после работы обратного алгоритма " + result);
        return result;
    }
*/

    public static int[] selectKeysfromKey(int Key){
        int result[]={0,0,0};
        String KeyS=Integer.toBinaryString(Key);
        KeyS= extentiontoTwentyfourBits(KeyS);
        String L1=KeyS.substring(0,12);
        String M1=KeyS.substring(6,18);
        String R1=KeyS.substring(12,24);
        result[0]= new BigInteger(L1,2).intValue();
        result[1]= new BigInteger(M1,2).intValue();
        result[2]= new BigInteger(R1,2).intValue();
        return result;
    }

    public static String extentiontoTwentyfourBits(String result){
        while(result.length()<24){
            result="0".concat(result);
        }
        return result;
    }

    public static String Shift(String input, int number){
        String result=input;
        String dop=result.substring(1,input.length());
        while((number<0)||(number>=input.length())){
            if(number<0){
                number+=input.length();
            }
            if(number>=input.length()){
                number-=input.length();
            }
        }
        for(int i=0;i<number;i++){
            result=dop.concat(String.valueOf(result.charAt(0)));
            dop=result.substring(1,input.length());
        }
        return result;
    }



}
