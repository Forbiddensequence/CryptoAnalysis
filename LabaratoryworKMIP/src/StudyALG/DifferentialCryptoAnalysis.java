package StudyALG;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DifferentialCryptoAnalysis {


    public static String[][][] AnalysingCipherText={    {{"01111101","10100101","01111000","00101010"},
                                                        {"10001011","00100001","11101110","10101110"},
                                                        {"11110110","10000100","10010110","10000100"},
                                                },{
                                                        {"11111011","00010010","10101011","01000001"},
                                                        {"00001101","10010110","11100100","11000101"},
                                                        {"11110110","10000100","01001111","10000100"},
                                                },{
                                                        {"00110110","10001101","11100010","01101111"},
                                                        {"11000000","00001001","11000100","11101011"},
                                                        {"11110110","10000100","00100110","10000100"},
                                                },{
                                                        {"10100101","10110110","01111100","00100011"},
                                                        {"01010011","00110010","10111010","10100111"},
                                                        {"11110110","10000100","11000110","10000100"},
                                                },{
                                                        {"11100010","01000101","00010001","01100011"},
                                                        {"00010100","11000001","11010111","11100111"},
                                                        {"11110110","10000100","11000110","10000100"},
                                                },{
                                                        {"10001110","11110110","00011110","10110011"},
                                                        {"01111000","01110010","00011101","00110111"},
                                                        {"11110110","10000100","00000011","10000100"},
                                                },{
                                                        {"11110010","01000001","00101011","11011001"},
                                                        {"00000100","11000101","01011101","01011101"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"01011111","11110110","10111001","10001000"},
                                                        {"10101001","01110010","01100110","00001100"},
                                                        {"11110110","10000100","11011111","10000100"},
                                                },{
                                                        {"00111101","10000101","10011010","00001011"},
                                                        {"11001011","00000001","01101100","10001111"},
                                                        {"11110110","10000100","11110110","10000100"},
                                                },{
                                                        {"00011110","00110010","10011011","10010100"},
                                                        {"11101000","10110110","01011101","00010000"},
                                                        {"11110110","10000100","11000110","10000100"},
                                                },{
                                                        {"11101000","10000101","11000100","00110010"},
                                                        {"00011110","00000001","01100111","10110110"},
                                                        {"11110110","10000100","10100011","10000100"},
                                                },{
                                                        {"10110110","00000001","00111000","01100101"},
                                                        {"01000000","10000101","01110111","11100001"},
                                                        {"11110110","10000100","01001111","10000100"},
                                                },{
                                                        {"11110010","01000001","00101011","11011001"},
                                                        {"00000100","11000101","01011101","01011101"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"00100111","00010010","11000110","00011101"},
                                                        {"11010001","10010110","10110000","10011001"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"10101001","10000101","10010111","11111100"},
                                                        {"01011111","00000001","01100001","01111000"},
                                                        {"11110110","10000100","11110110","10000100"},
                                                },{
                                                        {"11000001","00110010","00101001","11101111"},
                                                        {"00110111","10110110","11011111","01101011"},
                                                        {"11110110","10000100","11110110","10000100"},
                                                },{
                                                        {"00010100","01010010","10000010","10011001"},
                                                        {"11100010","11010110","11110100","00011101"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"01101110","11010110","01111111","00011110"},
                                                        {"10011000","01010010","00101100","10011010"},
                                                        {"11110110","10000100","01010011","10000100"},
                                                },{
                                                        {"00011101","01010010","00100010","01101011"},
                                                        {"11101011","11010110","11010100","11101111"},
                                                        {"11110110","10000100","11110110","10000100"},
                                                },{
                                                        {"00101100","01000101","01010110","10110001"},
                                                        {"11011010","11000001","00010000","00110101"},
                                                        {"11110110","10000100","01000110","10000100"},
                                                },{
                                                        {"10010111","11000001","00101010","11111001"},
                                                        {"01100001","01000101","01011100","01111101"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"10001110","10000001","10100101","10001101"},
                                                        {"01111000","00000101","11011010","00001001"},
                                                        {"11110110","10000100","01111111","10000100"},
                                                },{
                                                        {"10111101","01000101","01001011","11111110"},
                                                        {"01001011","11000001","11111000","01111010"},
                                                        {"11110110","10000100","10110011","10000100"},
                                                },{
                                                        {"10011100","01110010","00000101","11101010"},
                                                        {"01101010","11110110","01110011","01101110"},
                                                        {"11110110","10000100","01110110","10000100"},
                                                },{
                                                        {"00000101","10010110","00101001","11000111"},
                                                        {"11110011","00010010","11101111","01000011"},
                                                        {"11110110","10000100","11000110","10000100"},
                                                },{
                                                        {"00010000","01000001","10100001","01100110"},
                                                        {"11100110","11000101","11000111","11100010"},
                                                        {"11110110","10000100","01100110","10000100"},
                                                },{
                                                        {"00010000","10010110","01011110","01111010"},
                                                        {"11100110","00010010","11101101","11111110"},
                                                        {"11110110","10000100","10110011","10000100"},
                                                },{
                                                        {"01111101","10000101","01111000","00001010"},
                                                        {"10001011","00000001","11101110","10001110"},
                                                        {"11110110","10000100","10010110","10000100"},
                                                },{
                                                        {"01010101","11000001","10101100","01110100"},
                                                        {"10100011","01000101","01001010","11110000"},
                                                        {"11110110","10000100","11100110","10000100"},
                                                },{
                                                        {"00101010","11010110","10001101","01110000"},
                                                        {"11011100","01010010","01101011","11110100"},
                                                        {"11110110","10000100","11100110","10000100"},
                                                }};

    public static String KeyTRUE="";

    public static String[][] findingdAanddC(){
        int[] S1=StudyAlgorithm.S1;
        int[] S2=StudyAlgorithm.S2;
        int[] S3=StudyAlgorithm.S3;

        String[][] resultA1=tablework(S1,1);
        String[][] resultA2=tablework(S2,2);
        String[][] resultA3=tablework(S3,3);

        System.out.println("Possible variants are ");
        for(int i=0;i<resultA1.length;i++){
            for(int j=0;j<resultA1[0].length;j++){
                System.out.print(resultA1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Possible variants are ");
        for(int i=0;i<resultA2.length;i++){
            for(int j=0;j<resultA2[0].length;j++){
                System.out.print(resultA2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Possible variants are ");
        for(int i=0;i<resultA3.length;i++){
            for(int j=0;j<resultA3[0].length;j++){
                System.out.print(resultA3[i][j]+" ");
            }
            System.out.println();
        }
        String[] possiblevariants=new String[resultA1.length*resultA2.length*resultA3.length];
        int iter=0;
        for(int i=0;i<resultA1.length;i++){
            for(int j=0;j<resultA2.length;j++){
                for(int k=0;k<resultA3.length;k++){
                    possiblevariants[iter]=resultA1[i][0].concat(resultA2[j][0].concat(resultA3[k][0]));
                    iter++;
                }
            }
        }

        System.out.println("Potential variants are ");
        for(int j=0;j<possiblevariants.length;j++){
            System.out.println(possiblevariants[j]);
        }
        String[] checkedVariants;
        checkedVariants=checkEandP(possiblevariants);

        System.out.println("Checked variants are ");
        for(int j=0;j<checkedVariants.length;j++){
            System.out.println(checkedVariants[j]);
        }
        if(checkedVariants.length==0){
            return null;
        }
        String[][] readypairs=new String[checkedVariants.length][2];
        for(int i=0;i<checkedVariants.length;i++){
            String A1=new String(checkedVariants[i].substring(0,4));
            String A2=new String(checkedVariants[i].substring(4,8));
            String A3=new String(checkedVariants[i].substring(8,12));
            String C1=new String();
            String C2=new String();
            String C3=new String();
            for(int j=0;j<resultA1.length;j++){
                if(resultA1[j][0].equals(A1)){
                    C1=resultA1[j][1];
                }
            }
            for(int j=0;j<resultA2.length;j++){
                if(resultA2[j][0].equals(A2)){
                    C2=resultA2[j][1];
                }
            }
            for(int j=0;j<resultA3.length;j++){
                if(resultA3[j][0].equals(A3)){
                    C3=resultA3[j][1];
                }
            }
            String C=C1.concat(C2.concat(C3));
            readypairs[i][0]=checkedVariants[i];
            readypairs[i][1]=C;
        }
        System.out.println("Ready pairs are ");
        for(int j=0;j<readypairs.length;j++){
            System.out.println("\u0394A = "+readypairs[j][0]+" \u0394C = "+readypairs[j][1]);
        }


        return readypairs;
    }

    private static String[] checkEandP(String[] variants) {
        ArrayList<String> list=new ArrayList<String>();
        for (int k=0;k<variants.length;k++) {
            boolean isOkey=true;
            for (int i=0;i<StudyAlgorithm.EandP.length;i++){
                for(int j=i;j<StudyAlgorithm.EandP.length;j++){
                    if(StudyAlgorithm.EandP[i]==StudyAlgorithm.EandP[j]){
                        if(!(variants[k].charAt(i)==(variants[k].charAt(j)))){
                            isOkey=false;
                        }

                    }
                }
            }

            if(isOkey==true){
                list.add(variants[k]);
            }
        }
        String[] result=new String[list.size()];

        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public static String[][] findingdXanddY(String[][] dAanddC){

        String[][] result=new String[dAanddC.length][2];
        for(int i=0;i<dAanddC.length;i++){
            String dA=dAanddC[i][0];
            String dC=dAanddC[i][1];
            String dX=FeistelFunc.extentiontoByte(FeistelFunc.toBinar(0));
            String dY=FeistelFunc.extentiontoByte(FeistelFunc.toBinar(0));
            dX=invEandP(dA);
            dY=FeistelFunc.P(dC);
            result[i][0]=dX;
            result[i][1]=dY;
        }
        System.out.println("Result of Function analysis is ");
        for(int i=0;i<dAanddC.length;i++){
            System.out.println("\u0394X = "+result[i][0]+" \u0394Y = "+result[i][1]);
            System.out.println("\u0394XL = "+result[i][1]+" \u0394XR = "+result[i][0]);
        }
        return result;
    }

    public static String[][] tablework(int[] S,int num){
        int size=0;
        if(num<3){
            size=8;
        }
        else{
            size=4;
        }
        String[][] temptable1=new String[16][5];
        int[][] tableS=new int[S.length][size];
        double[][] tableprobS=new double[S.length][size];
        for(int i=0;i<16;i++){
            temptable1[i][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
            switch (num){
                case (1):
                    temptable1[i][2]=FeistelFunc.S1(temptable1[i][0]);
                    break;
                case (2):
                    temptable1[i][2]=FeistelFunc.S2(temptable1[i][0]);
                    break;
                case (3):
                    temptable1[i][2]=FeistelFunc.S3(temptable1[i][0]);
                    break;
            }
        }
        for(int i=0;i<16;i++){
            String dA=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
            for(int j=0;j<16;j++){
                temptable1[j][1]=FeistelFunc.extentiontoFourBits(FeistelFunc.xor(temptable1[j][0],dA));
                switch (num){
                    case (1):
                        temptable1[j][3]=FeistelFunc.S1(temptable1[j][1]);
                        temptable1[j][4]=FeistelFunc.extentiontoThreeBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                        break;
                    case (2):
                        temptable1[j][3]=FeistelFunc.S2(temptable1[j][1]);
                        temptable1[j][4]=FeistelFunc.extentiontoThreeBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                        break;
                    case (3):
                        temptable1[j][3]=FeistelFunc.S3(temptable1[j][1]);
                        temptable1[j][4]=FeistelFunc.extentiontoTwoBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                        break;
                }
            }
            for(int j=0;j<size;j++){
                int counter=0;
                String comparation=new String();
                switch (num){
                    case (1):
                    case (2):
                        comparation=FeistelFunc.extentiontoThreeBits(FeistelFunc.toBinar(j));
                        break;
                    case (3):
                        comparation=FeistelFunc.extentiontoTwoBits(FeistelFunc.toBinar(j));
                        break;
                }
                for(int k=0;k<16;k++){
                    if(temptable1[k][4].equals(comparation)){
                        counter++;
                    }
                }
                tableS[i][j]=counter;
                tableprobS[i][j]=counter/16.0;
            }
            /*
            System.out.println("dA equals "+dA);
            for (int y=0;y<16;y++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(temptable1[y][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            */
        }
        System.out.println("Table for S"+num);
        for (int i=0;i<16;i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%.3f;",tableprobS[i][j]);
            }

            System.out.println();
        }
        System.out.println();
        int localmax=0;
        int localmaxminusone=0;
        int numberofelements=0;
        for (int i=1;i<16;i++) {
            for (int j = 0; j < size; j++) {
                if (tableS[i][j] > localmax) {
                    localmaxminusone=localmax;
                    localmax = tableS[i][j];
                    //localmaxminusone=localmax;
                }
            }
        }
        for (int i=1;i<16;i++) {
            for (int j = 0; j < size; j++) {
                if (tableS[i][j] >= localmaxminusone) {
                    numberofelements++;
                }
            }
        }

        String[][] result = new String[numberofelements][2];
        int k=0;
        for (int i=1;i<16;i++) {
            for (int j = 0; j < size; j++) {
                if (tableS[i][j] >= localmaxminusone) {
                    result[k][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
                    switch (num){
                        case (1):
                        case (2):
                            result[k][1]=FeistelFunc.extentiontoThreeBits(FeistelFunc.toBinar(j));
                            break;
                        case (3):
                            result[k][1]=FeistelFunc.extentiontoTwoBits(FeistelFunc.toBinar(j));
                            break;
                    }
                    k++;
                }
            }
        }



        return result;
    }

    public static String[] analysisofcipher(String[][][] XLXRYLYR){
        String[][] round1=new String[XLXRYLYR.length][3];
        String[][] round3=new String[XLXRYLYR.length][3];
        for(int i=0;i<XLXRYLYR.length;i++){
            round1[i][0]=XLXRYLYR[i][2][0];
            round3[i][0]=XLXRYLYR[i][2][2];
            round1[i][1]=XLXRYLYR[i][2][1];
            round3[i][1]=XLXRYLYR[i][2][3];
            round1[i][2]=XLXRYLYR[i][0][1];
            round3[i][2]=XLXRYLYR[i][0][3];
        }
        String[] K1=analysisofTextsinround(round1);
        String[] K2=analysisofTextsinround(round3);

        String[] K= new String[K1.length*K2.length];
        int coounter=0;
        System.out.println("Number of possible variants of finish key is "+ K.length);
        System.out.println("Possible variants of finish key");
        for(int i=0;i<K1.length;i++){
            for(int j=0;j<K2.length;j++){
                String tmp=K1[i].concat(K2[j]);
                K[coounter]=tmp;
                System.out.println(K[coounter]);
                coounter++;
            }
        }
        return K;
    }

    public static String[] analysisofTextsinround(String[][] round){

        int[][] keymatrix=new int[16][3];
        int[][][] keyparts=new int[3][round.length][16];
        for (int i=0;i<round.length;i++) {
            String dA=FeistelFunc.EandP(round[i][1]);
            String dC=invP(round[i][0]);
            String A=FeistelFunc.EandP(round[i][2]);
            String[] possiblevariantsofKey1=possiblevariantsofKey(StudyAlgorithm.S1,1,dA.substring(0,4),dC.substring(0,3),A.substring(0,4));
            String[] possiblevariantsofKey2=possiblevariantsofKey(StudyAlgorithm.S2,2,dA.substring(4,8),dC.substring(3,6),A.substring(4,8));
            String[] possiblevariantsofKey3=possiblevariantsofKey(StudyAlgorithm.S3,3,dA.substring(8,12),dC.substring(6,8),A.substring(8,12));
            for(int j=0;j<possiblevariantsofKey1.length;j++){
                keymatrix[FeistelFunc.toInt(possiblevariantsofKey1[j])][0]++;
                keyparts[0][i][FeistelFunc.toInt(possiblevariantsofKey1[j])]=1;
            }
            for(int j=0;j<possiblevariantsofKey2.length;j++){
                keymatrix[FeistelFunc.toInt(possiblevariantsofKey2[j])][1]++;
                keyparts[1][i][FeistelFunc.toInt(possiblevariantsofKey2[j])]=1;
            }
            for(int j=0;j<possiblevariantsofKey3.length;j++){
                keymatrix[FeistelFunc.toInt(possiblevariantsofKey3[j])][2]++;
                keyparts[2][i][FeistelFunc.toInt(possiblevariantsofKey3[j])]=1;
            }

        }

        for (int i=0;i<keyparts.length;i++){
            System.out.println("Table for Existing Key parts in K"+(i+1));
            for (int j=0;j<keyparts[0].length;j++){
                for (int k=0;k<keyparts[0][0].length;k++){
                    System.out.printf("%d;",keyparts[i][j][k]);
                }
                System.out.println();
            }
        }

        String[] K1=fillingpossiblevariants(keymatrix,1);
        String[] K2=fillingpossiblevariants(keymatrix,2);
        String[] K3=fillingpossiblevariants(keymatrix,3);

        System.out.println("Variants of K1");
        for(String e : K1){
            System.out.println(e);
        }
        System.out.println("Variants of K2");
        for(String e : K2){
            System.out.println(e);
        }
        System.out.println("Variants of K3");
        for(String e : K3){
            System.out.println(e);
        }
        String[] result= new String[K1.length*K2.length*K3.length];
        if(result.length==0){
            return null;
        }
        int coounter=0;
        for(int i=0;i<K1.length;i++){
            for(int j=0;j<K2.length;j++){
                for(int k=0;k<K3.length;k++){
                    String K=K1[i].concat(K2[j].concat(K3[k]));
                    result[coounter]=K;
                    coounter++;
                }
            }
        }

        System.out.println("Matrix of possible variants is equal");
        for(int i=0;i<keymatrix.length;i++){
            for(int j=0;j<keymatrix[0].length;j++){
                System.out.print(new DecimalFormat( "00" ).format(keymatrix[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Number of possible variants of Key is equal "+ result.length);

        System.out.println("Possible variants of Key are equal");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }


        /*
        for(int i=0;i<keymatrix.length;i++){
            for(int j=0;j<keymatrix[0].length;j++){
                for(int k=0;k<keymatrix[0].length;k++){
                    System.out.print(keymatrix[i][j]+" ");
                }
            }
            System.out.println();
        }

         */
        return result;
    }

    public static String[] fillingpossiblevariants(int[][] keymatrix,int num){
        int localmax=0;
        int numberofelements=0;
        int localmaxminusone=0;
        num--;

        for(int j=0;j<keymatrix.length;j++){
            if(keymatrix[j][num]>=localmax){
                localmaxminusone=localmax;
                localmax=keymatrix[j][num];
                localmaxminusone=localmax;
            }
        }
        ArrayList<String> list=new ArrayList<String>();
        for(int j=0;j<keymatrix.length;j++){
            if(keymatrix[j][num]>=localmaxminusone){
                numberofelements++;
                list.add(FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(j)));
            }
        }
        String[] result=new String[numberofelements];
        for(int j=0;j<result.length;j++){
            result[j]=list.get(j);
        }
        return result;
    }

    public static String invEandP(String B){
        String dB=B;
        StringBuilder sb=new StringBuilder(FeistelFunc.extentiontoByte(FeistelFunc.toBinar(0)));
        for(int j=0;j<StudyAlgorithm.EandP.length;j++){
            sb.deleteCharAt(StudyAlgorithm.EandP[j]-1);
            sb.insert(StudyAlgorithm.EandP[j]-1,dB.charAt(j));
        }
        String dA=sb.toString();
        return dA;
    }

    public static String invP(String D){
        String dD=D;
        StringBuilder sb=new StringBuilder(FeistelFunc.extentiontoByte(FeistelFunc.toBinar(0)));
        for(int j=0;j<StudyAlgorithm.P.length;j++){
            sb.deleteCharAt(StudyAlgorithm.P[j]-1);
            sb.insert(StudyAlgorithm.P[j]-1,dD.charAt(j));
        }
        String dC=sb.toString();
        return dC;
    }

    public static String[] possiblevariantsofKey(int S[],int tablenumber,String dA,String dC,String A){

        String[][] temptable1=new String[16][5];
        for(int i=0;i<16;i++){
            temptable1[i][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
            switch (tablenumber){
                case (1):
                    temptable1[i][2]=FeistelFunc.S1(temptable1[i][0]);
                    break;
                case (2):
                    temptable1[i][2]=FeistelFunc.S2(temptable1[i][0]);
                    break;
                case (3):
                    temptable1[i][2]=FeistelFunc.S3(temptable1[i][0]);
                    break;
            }
        }
        for(int j=0;j<16;j++){
            temptable1[j][1]=FeistelFunc.extentiontoFourBits(FeistelFunc.xor(temptable1[j][0],dA));
            switch (tablenumber){
                case (1):
                    temptable1[j][3]=FeistelFunc.S1(temptable1[j][1]);
                    temptable1[j][4]=FeistelFunc.extentiontoThreeBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                    break;
                case (2):
                    temptable1[j][3]=FeistelFunc.S2(temptable1[j][1]);
                    temptable1[j][4]=FeistelFunc.extentiontoThreeBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                    break;
                case (3):
                    temptable1[j][3]=FeistelFunc.S3(temptable1[j][1]);
                    temptable1[j][4]=FeistelFunc.extentiontoTwoBits(FeistelFunc.xor(temptable1[j][2],temptable1[j][3]));
                    break;
            }
        }
        /*
        System.out.println("Table for \u0394A = "+dA);
        for (int i=0;i<temptable1.length;i++) {
            for (int j=0;j<temptable1[0].length;j++) {
                System.out.print(temptable1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

         */

        ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<16;i++){
            String keypossiblevar=new String();
            if(dC.equals(temptable1[i][4])){
                keypossiblevar=FeistelFunc.extentiontoFourBits(FeistelFunc.xor(temptable1[i][0],A));
                list.add(keypossiblevar);
            }
        }
        String[] result =new String[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }

        /*
        System.out.println("Possible variants of key "+tablenumber+" are equal ");
        for (int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
        System.out.println();

         */

        return result;
    }

    public static String lookupKeywithAnalysis(String[] KeyArray){
        String result=null;

        int Data=FeistelFunc.toInt(DifferentialCryptoAnalysis.AnalysingCipherText[0][0][0]+ DifferentialCryptoAnalysis.AnalysingCipherText[0][0][1]);
        StudyAlgorithm.Data=Data;
        for(int i=0;i<KeyArray.length;i++){
            int TestKey=FeistelFunc.toInt(KeyArray[i]);

            StudyAlgorithm.Key=TestKey;

            int ciphertext=StudyAlgorithm.StudyAlgorithm();
            if(FeistelFunc.toInt(DifferentialCryptoAnalysis.AnalysingCipherText[0][0][2]+ DifferentialCryptoAnalysis.AnalysingCipherText[0][0][3])==ciphertext){
                result=KeyArray[i];
            }
        }
        return result;
    }

    public static String lookupKeywithoutAnalysis(){
        String result=null;
        int Data=0;

        StudyAlgorithm.Data=Data;
        int boundary=FeistelFunc.toInt("1000000000000000000000000");
        for(int i=0;i<boundary;i++){
            String Key=FeistelFunc.extentiontoNBit(FeistelFunc.toBinar(i),24);
            int TestKey=i;
            StudyAlgorithm.Key=TestKey;
            boolean isKey=true;
            for (int j = 0; j< DifferentialCryptoAnalysis.AnalysingCipherText.length; j++){
                Data=FeistelFunc.toInt(DifferentialCryptoAnalysis.AnalysingCipherText[j][0][0]+ DifferentialCryptoAnalysis.AnalysingCipherText[j][0][1]);
                StudyAlgorithm.Data=Data;
                int ciphertext=StudyAlgorithm.StudyAlgorithm();
                int rs=FeistelFunc.toInt(DifferentialCryptoAnalysis.AnalysingCipherText[j][0][2]+ DifferentialCryptoAnalysis.AnalysingCipherText[j][0][3]);
                if(rs==ciphertext){
                   continue;
                }
                else{
                    isKey=false;
                    break;
                }
            }
            if(isKey){
                result=Key;
                break;
            }
            //System.out.println("TestKey is equal to "+Key);
        }
        return result;
    }

    public static void showS(){}

    public static void startDifferentialCryptoanalysis(){

        String[][] dAdC=findingdAanddC();
        String[][] dXdY=findingdXanddY(dAdC);
        String[] PossibleKeys = analysisofcipher(AnalysingCipherText);
        System.out.println(lookupKeywithAnalysis(PossibleKeys));
        System.out.println(lookupKeywithoutAnalysis());
    }
}
