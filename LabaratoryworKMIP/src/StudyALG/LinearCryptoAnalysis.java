package StudyALG;

import java.security.Key;

public class LinearCryptoAnalysis {
    public static String[][] AnalysingCipherText={{"10101010","10011111","10110010","10110000"},
            {"00010111","00101100","10000010","01000100"},
            {"01101110","11000010","01001101","11111111"},
            {"10101110","11011111","01001100","01001101"},
            {"01011000","11110110","11100100","10101110"},
            {"11011010","00110001","01010100","01010000"},
            {"11011101","01000011","10001001","10101111"},
            {"00001011","10101001","11111001","00000010"},
            {"11111110","00001100","11001101","00100011"},
            {"11111100","10000010","01001001","11011010"},
            {"10100010","01100110","01010010","11111111"},
            {"01110111","10001000","01010100","10110101"},
            {"10011100","10000101","01001110","00011100"},
            {"11001000","00101111","00010011","10011111"},
            {"11100101","01100010","10100001","10011100"},
            {"00001101","00100001","11011111","10111000"},
            {"11110010","11010010","10100110","00010111"},
            {"11100101","10011001","01101001","11100001"},
            {"00111110","10100011","00011111","10000101"},
            {"00111010","01000011","00011001","01111100"},
            {"01100001","10010001","10110011","00100011"},
            {"00100101","10010100","01100011","01011010"},
            {"01011001","00001101","00101111","11100011"},
            {"00011010","10101110","10011101","11001111"},
            {"11010111","00111010","10001000","11100100"},
            {"11101110","01011100","11011111","01101000"},
            {"10101111","10010011","00111000","11100000"},
            {"01011111","10110001","01000111","10011100"},
            {"11010000","00011100","00110010","10100111"},
            {"00101001","01010011","00101000","01000111"},
            {"01001101","00011011","10000110","10111001"},
            {"11010011","10001101","11110000","10011011"},
            {"01100111","10101011","01101101","10100110"},
            {"11000111","10010100","00110111","00001101"},
            {"10101010","10110110","10011001","10011001"},
            {"01011011","10110110","11010101","11111100"},
            {"01110101","00011110","11110000","01001111"},
            {"11010110","01010100","11110111","01110010"},
            {"10010010","00100100","01101011","10010100"},
            {"10011101","11011001","00000011","10101010"},
            {"10111100","01011010","11110001","10001111"},
            {"00100001","00010101","01011110","11010010"},
            {"00011011","10101000","11001001","00110001"},
            {"00100010","10110010","11000010","00010000"},
            {"00101111","00110011","11111101","10101000"},
            {"01101000","10100011","10101000","00011000"},
            {"10101101","00110001","11011011","11110100"},
            {"00010110","10111101","01100000","01010011"},
            {"00111001","11110111","10010101","10010110"},
            {"00100000","11101100","10100111","10001111"},
            {"00010111","11001101","01110011","00000001"},
            {"10010101","10101001","00100010","11101010"},
            {"00100011","01001110","01010101","10001001"},
            {"11000111","10011101","00010101","00000110"},
            {"10111110","01101110","10111111","01111010"},
            {"10000001","10100100","10001001","10110000"},
            {"10000000","01100011","00000101","00011001"},
            {"11001001","10010100","11110011","10010010"},
            {"11001100","00000011","10010011","11011101"},
            {"11110100","01110110","11010101","01010010"},
            {"10101011","01100110","01100000","11000110"},
            {"11110100","00100011","10011011","11011111"},
            {"01111011","11011000","10001001","01110001"},
            {"00110110","01101000","11100110","11000001"},
            {"01011100","01011001","10011110","11010010"},
            {"01110110","00100010","10011111","10000000"},
            {"01101110","01010000","10100111","11000000"},
            {"01001101","11111110","00101001","00011011"},
            {"01000010","00101001","01101000","00010100"},
            {"01111001","11001100","11010101","10000100"},
            {"00010110","11101011","00101110","11110110"},
            {"00010101","10000010","00100100","10011111"},
            {"10110110","00100010","11010010","11000101"},
            {"01000000","01110101","00111111","10011011"},
            {"00101010","10010110","10111111","11010101"},
            {"11101110","01011011","10111000","10000101"},
            {"01111010","10100111","11011101","11011111"},
            {"11011110","00001101","11000110","00001001"},
            {"00110010","01010110","01100110","10010011"},
            {"11110100","00111010","10101001","11010100"},
            {"10000101","01000100","10110100","01011011"},
            {"01110101","01101011","10001100","11011001"},
            {"00011000","00111100","01000101","11111001"},
            {"11010001","00001111","00100011","10100100"},
            {"11101000","00001000","01011111","01001011"},
            {"00010000","01110011","00000001","01011110"},
            {"11010101","10101010","01110000","11100000"},
            {"00001111","11010111","01001001","00011001"},
            {"10111010","00110100","01110011","10100100"},
            {"00000011","00001001","00001011","00011101"},
            {"00100110","11100110","01010000","00001010"},
            {"00001110","00110011","11110101","10110011"},
            {"00010111","00111001","11010111","10000000"},
            {"11011011","11001101","11001000","11010010"},
            {"01010010","00000111","00010100","11001001"},
            {"01110111","11010001","01010100","11000111"},
            {"00110010","00000011","00111000","00001100"},
            {"11101011","10110001","10101101","01010110"},
            {"00001000","00100000","00001011","00000100"}
    };

    public static void startLinearCryptoAnalysis() {
        System.out.println("УРа я люблю линнии");
        Equation[] EquationsforAnalysis=findinglinearstatisticanalog();
        Expression[] Expressions=findingExpressions(AnalysingCipherText,EquationsforAnalysis);
        lookupkeywithoutanalysis(AnalysingCipherText);

    }

    private static Expression[] findingExpressions(String[][] analysingCipherText, Equation[] equationsforAnalysis) {
        Expression[] Expressions=new Expression[equationsforAnalysis.length];
        String[][] text=analysingCipherText;
        for(int i=0;i<equationsforAnalysis.length;i++){
            int result=0;
            Equation eq=equationsforAnalysis[i];
            int counter=0;
            for(int j=0;j<text.length;j++){
                result=0;
                for(int x=0;x<eq.X.length;x++){
                    String a=new String();
                    if(eq.X[x]<=8){
                        a=text[j][0].substring(eq.X[x]-1,eq.X[x]);

                    }else{
                        a=text[j][1].substring(eq.X[x]-1-8,eq.X[x]-8);
                    }
                    result^=Integer.parseInt(a);
                }
                for(int y=0;y<eq.Y.length;y++){
                    String a=new String();
                    if(eq.Y[y]<=8){
                        a=text[j][2].substring(eq.Y[y]-1,eq.Y[y]);

                    }else{
                        a=text[j][3].substring(eq.Y[y]-1-8,eq.Y[y]-8);
                    }
                    result^=Integer.parseInt(a);
                }
                if(result==0){
                    counter++;
                }
            }
            double numberofrighttexts=((float)counter)/(text.length);
            int invofres=0;
            if(numberofrighttexts>0.5){
                invofres=0;
            }else {
                invofres=1;
            }
            if(eq.probability>0.5){
                result=invofres^0;
            }
            else {
                result=invofres^1;
            }
            int[] Knew=new int[eq.K.length];
            for(int j=0;j<Knew.length;j++){
                Knew[j]=eq.K[j];
            }

            Expression exp=new Expression(Knew,numberofrighttexts,result);
            Expressions[i]=exp;
            exp.showExpression();
        }
        return new Expression[0];
    }

    public static Equation[] findinglinearstatisticanalog(){
        String result=new String(" ");

        String[][] resultS1=tablework(StudyAlgorithm.S1,1);
        String[][] resultS2=tablework(StudyAlgorithm.S2,2);
        String[][] resultS3=tablework(StudyAlgorithm.S3,3);
        System.out.println("Possible variants of linear statistic analogs for S1");
        for (int i=0;i<resultS1.length;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultS1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Possible variants of linear statistic analogs for S2");
        for (int i=0;i<resultS2.length;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultS2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Possible variants of linear statistic analogs for S3");
        for (int i=0;i<resultS3.length;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultS3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //Недоделано тут
        int size=resultS1.length+resultS2.length+resultS3.length;
        int[] XP=new int[8];
        int[] X=new int[12];
        int[] K=new int[12];
        int[] C=new int[8];
        Equation[] Eqmasround1=new Equation[size];
        Equation[] Eqs=new Equation[size];
        int ctr=0;
        fillingKandXandC(1,0,K,X,C,XP);
        fillingEquation(Eqmasround1,1,size,resultS1,resultS2,resultS3);
        Equation[] Eqmasround21=new Equation[size];
        Equation[] Eqmasround23=new Equation[size];
        fillingEquation(Eqmasround21,2,size,resultS1,resultS2,resultS3);
        fillingEquation(Eqmasround23,3,size,resultS1,resultS2,resultS3);
        /*for(int i=0;i<3;i++) {
            int lowboundaryup = i * 4;
            int lowboundarydown = i * 3;
            int highboundaryup = (i + 1) * 4;
            int highboundarydown = (i + 1) * 3;
            int size1 = 4;
            int size2 = 3;
            int[] Xarr = new int[size1];
            int[] Karr = new int[size1];

            for (int j = lowboundaryup, k = 0; j < highboundaryup; j++, k++) {
                Xarr[k] = X[j];
                Karr[k] = K[j];
            }
            if (i == 2) {
                size2 = 2;
                highboundarydown--;
            }
            int[] Carr = new int[size2];
            for (int j = lowboundarydown, k = 0; j < highboundarydown; j++, k++) {
                Carr[k] = C[j];
            }
            switch (i) {
                case (0):
                    for (int j = 0; j < resultS1.length; j++) {
                        Eqmasround1[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
                case (1):
                    for (int j = 0; j < resultS2.length; j++) {
                        Eqmasround1[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
                case (2):
                    for (int j = 0; j < resultS3.length; j++) {
                        Eqmasround1[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
            }
            Eqs[i] = new Equation(Xarr, Karr, Carr, "C");
        }

        int counter=0;
        for(int i=0;i<resultS1.length;i++){
            Eqmasround1[counter].executeEquation(resultS1[i],1,p(resultS1[i],1));
            counter++;
            //System.out.println(counter);
        }
        for(int i=0;i<resultS2.length;i++){
            Eqmasround1[counter].executeEquation(resultS2[i],1,p(resultS2[i],2));
            counter++;
            //System.out.println(counter);
        }
        for(int i=0;i<resultS3.length;i++){
            Eqmasround1[counter].executeEquation(resultS3[i],1,p(resultS3[i],3));
            counter++;
            //System.out.println(counter);
        }

         */
        for(int i=0;i<Eqmasround21.length;i++){
            Equation Eqtemp=Eqmasround21[i];
            boolean isexists=false;
            /*for(int j=0;j<Eqtemp.X.length;j++){
                for(int k=0;k<Eqmasround1.length&&Eqtemp.XType.equals("B");k++){
                    boolean ishere=false;
                    isexists=false;
                    for (int t=0;t<Eqmasround1[k].C.length;t++){
                        if(Eqtemp.X[j]==Eqmasround1[k].C[t]){
                            ishere&=true;
                        }
                        else{
                            ishere&=false;
                        }
                    }
                    int[] Xadd=new int[0];
                    if(ishere){
                        //метод для обработки и упрощения B
                        Eqmasround21[i].mergeEquations(Eqmasround1[k]);
                    }
                    //флаг ishere говорит что тут есть совпадение хотя бы один раз между С из 1 раунда и B из второго
                    //флаг isexist говорит о том что есть совпадение с
                    if(Eqmasround1[k].C.length>1){
                        break;
                    }

                    for (int t=0;t<Eqmasround1[k].C.length;t++){

                    }
                }
            }
             */
            Eqmasround23[i]=Eqmasround23[i].copyEquation(Eqmasround21[i]);
            for(int j=0;j<Eqmasround1.length;j++){
                if(Eqmasround1[j].isinC(Eqmasround21[i].getX())){
                    Eqmasround21[i]=Eqmasround21[i].mergeEquationwithround1(Eqmasround1[j]);
                    Eqmasround23[i]=Eqmasround23[i].mergeEquationwithround3(Eqmasround1[j]);
                }
            }
        }
        System.out.println();
        System.out.println("After simplify");
        System.out.println();

        for(int i=0;i<Eqmasround1.length;i++){
            Eqmasround1[i].simplilfyEquation();
            Eqmasround1[i].showequation();
        }
        for(int i=0;i<Eqmasround21.length;i++){
            Eqmasround21[i].showequation();
        }

        for(int i=0;i<Eqmasround23.length;i++){
            Eqmasround23[i].showequation();
        }
        /*
        for(int i=0;i<resultS1.length;i++){
            for(int j=0;j<resultS2.length;j++){
                for(int k=0;k<resultS3.length;k++){
                    Eqmasround1[counter][0].executeEquation(resultS1[i],1);
                    Eqmasround1[counter][1].executeEquation(resultS2[j],1);
                    Eqmasround1[counter][2].executeEquation(resultS3[k],1);
                    counter++;
                    System.out.println(counter);
                }
            }
        }
         */

        ctr=0;
        size=0;
        for(int i=0;i<Eqmasround1.length;i++){
            Equation eq=Eqmasround1[i];
            if(eq.C.length==0&&(!(eq.XType.equals("B")))){
                size++;
            }
        }
        for(int i=0;i<Eqmasround21.length;i++){
            Equation eq=Eqmasround21[i];
            if(eq.C.length==0&&!(eq.XType.equals("B"))){
                size++;
            }
        }


        for(int i=0;i<Eqmasround23.length;i++){
            Equation eq=Eqmasround23[i];
            if(eq.C.length==0&&!(eq.XType.equals("B"))){
                size++;
            }
        }

        Equation[] resultEquations=new  Equation[size];

        for(int i=0;i<Eqmasround1.length;i++){
            Equation eq=Eqmasround1[i];
            if(eq.C.length==0&&(!(eq.XType.equals("B")))){
                resultEquations[ctr]=eq;
                ctr++;
            }
        }
        for(int i=0;i<Eqmasround21.length;i++){
            Equation eq=Eqmasround21[i];
            if(eq.C.length==0&&!(eq.XType.equals("B"))){
                resultEquations[ctr]=eq;
                ctr++;
            }
        }


        for(int i=0;i<Eqmasround23.length;i++){
            Equation eq=Eqmasround23[i];
            if(eq.C.length==0&&!(eq.XType.equals("B"))){
                resultEquations[ctr]=eq;
                ctr++;
            }
        }

        System.out.println();
        System.out.println("After selection");
        System.out.println();
        for(int i=0;i<resultEquations.length;i++){
           resultEquations[i].showequation();
        }
        return resultEquations;
    }

    public static String[][] tablework(int[] S,int num) {
        int size=0;
        int bitnum=0;

        if(num<3){
            size=8;
            bitnum=3;
        }
        else{
            size=4;
            bitnum=2;
        }
        String[][] temptable1=new String[16][3];
        double[][] tableS=new double[S.length][size];
        double[][] tablepostS=new double[S.length][size];
        for(int i=0;i<16;i++){
            temptable1[i][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
            switch (num){
                case (1):
                    temptable1[i][1]=FeistelFunc.S1(temptable1[i][0]);
                    break;
                case (2):
                    temptable1[i][1]=FeistelFunc.S2(temptable1[i][0]);
                    break;
                case (3):
                    temptable1[i][1]=FeistelFunc.S3(temptable1[i][0]);
                    break;
            }
        }

        for(int i=1;i<16;i++){
            for(int j=1;j<size;j++){
                String alpha=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
                String beta=FeistelFunc.extentiontoNBit(FeistelFunc.toBinar(j),bitnum);
                int ctr=0;
                for(int k=0;k<16;k++){
                    int Q=calculatinglenearstatisticanalog(temptable1[k][0],alpha)^calculatinglenearstatisticanalog(temptable1[k][1],beta);
                    if (Q==0){
                        ctr++;
                    }
                    temptable1[k][2]=LSAtoString(Q);
                }
                tableS[i][j]=ctr/16.0;
                tablepostS[i][j]=abs(1-2*tableS[i][j]);
                /*
                System.out.printf("Linear statistic table for %s and %s equals ",alpha,beta);
                System.out.println();
                for (int y=0;y<16;y++) {
                    for (int k = 0; k < 3; k++) {
                        System.out.printf("%s ",temptable1[y][k]);
                    }
                    System.out.println();
                }
                System.out.println();
                 */
            }
        }

        System.out.println("Linear statistic table for S"+num+" equals ");
        for (int i=0;i<16;i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%.3f;",tableS[i][j]);
            }
            System.out.println();
        }
        System.out.println("Linear post statistic table for S"+num+" equals ");
        for (int i=0;i<16;i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%.3f;",tablepostS[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int numberofanalogs=0;
        double localmax=0;
        double localmaxminusone=0;
        for(int i=1;i<16;i++){
            for(int j=1;j<size;j++){
                if(tablepostS[i][j]>=localmax){
                    localmaxminusone=localmax;
                    localmax=tablepostS[i][j];
                    localmaxminusone=localmax; // Если что тут надо поменять чтобы выбирали не только максимум, но и близкое к максимуму
                }
            }
        }
        for(int i=1;i<16;i++){
            for(int j=1;j<size;j++){
                if(tablepostS[i][j]>=localmaxminusone){
                    numberofanalogs++;
                }
            }
        }
        String[][] tableofanalogs=new String[numberofanalogs][2];
        int ctr=0;
        for(int i=1;i<16;i++){
            for(int j=1;j<size;j++){
                if(tablepostS[i][j]>=localmaxminusone){
                    tableofanalogs[ctr][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
                    tableofanalogs[ctr][1]=FeistelFunc.extentiontoNBit(FeistelFunc.toBinar(j),bitnum);
                    ctr++;
                }
            }
        }
        return tableofanalogs;


    }

    /**
     * Calculates linear statistic analog for X and Y
     * @param X string X in binary
     * @param Y string Y in binary
     * @return Q Linear statistic analog
     */
    public static int calculatinglenearstatisticanalog(String X, String Y){
        int counter=0;
        for(int i=0;i<X.length();i++){
            String a=X.substring(i,i+1);
            String b=Y.substring(i,i+1);
            counter^=Integer.parseInt(a)&Integer.parseInt(b);

        }
        int result=counter;
        return result;
    }

    public static String LSAtoString(int num){
        return Integer.toBinaryString(num);
    }

    public static int abs(int num){
        if(num<=0){
            num*=-1;
        }
        return num;
    }

    public static double abs(double num){
        if(num<0){
            num*=-1;
        }
        return num;
    }

    public static double p(String[] LSA,int num){
        double result=0;
        String[][] temptable1=new String[16][3];
        int counter=0;
        for(int i=0;i<16;i++){
            temptable1[i][0]=FeistelFunc.extentiontoFourBits(FeistelFunc.toBinar(i));
            switch (num){
                case (1):
                    temptable1[i][1]=FeistelFunc.S1(temptable1[i][0]);
                    break;
                case (2):
                    temptable1[i][1]=FeistelFunc.S2(temptable1[i][0]);
                    break;
                case (3):
                    temptable1[i][1]=FeistelFunc.S3(temptable1[i][0]);
                    break;
            }
            int Q=calculatinglenearstatisticanalog(temptable1[i][0],LSA[0])^calculatinglenearstatisticanalog(temptable1[i][1],LSA[1]);
            temptable1[i][2]=Integer.toBinaryString(Q);
            if(Q==0){
                counter++;
            }
        }
        result=counter/16.0;
        return result;
    }

    public static double poftwoLSA(double p1,double p2){
        double result=result=1-p1-p1+2*p1*p2;
        return result;
    }

    public static void fillingKandXandC(int round,int Kb,int[] K,int X[],int[] C,int[] XP){
        for (int i=0;i<XP.length;i++) {
            XP[i]=i+1;
        }
        for (int i=0;i<K.length;i++) {
            K[i]=i+Kb+1;
        }
        for (int i=0;i<C.length;i++) {
            C[i]=i+1;
        }
        int [] N=FeistelFunc.EandP(XP);
        for(int i=0;i<X.length;i++){
            X[i]=N[i];
        }
        int[] CN=FeistelFunc.invP(C);
        for(int i=0;i<CN.length;i++){
            C[i]=CN[i];
        }
    }

    public static void fillingEquation(Equation[] eqmasinround,int round,int size,String[][] resultS1,String[][] resultS2,String[][] resultS3){
        int[] XP=new int[8];
        int[] X=new int[12];
        int[] K=new int[12];
        int[] C=new int[8];
        Equation[] Eqmasround1=new Equation[size];
        Equation[] Eqs=new Equation[size];
        int ctr=0;
        fillingKandXandC(1,0,K,X,C,XP);
        for(int i=0;i<3;i++) {
            int lowboundaryup = i * 4;
            int lowboundarydown = i * 3;
            int highboundaryup = (i + 1) * 4;
            int highboundarydown = (i + 1) * 3;
            int size1 = 4;
            int size2 = 3;
            int[] Xarr = new int[size1];
            int[] Karr = new int[size1];
            for (int j = lowboundaryup, k = 0; j < highboundaryup; j++, k++) {
                Xarr[k] = X[j];
                Karr[k] = K[j];
            }
            if (i == 2) {
                size2 = 2;
                highboundarydown--;
            }
            int[] Carr = new int[size2];
            for (int j = lowboundarydown, k = 0; j < highboundarydown; j++, k++) {
                Carr[k] = C[j];
            }
            switch (i) {
                case (0):
                    for (int j = 0; j < resultS1.length; j++) {
                        eqmasinround[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
                case (1):
                    for (int j = 0; j < resultS2.length; j++) {
                        eqmasinround[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
                case (2):
                    for (int j = 0; j < resultS3.length; j++) {
                        eqmasinround[ctr] = new Equation(Xarr, Karr, Carr, "C");
                        ctr++;
                    }
                    break;
            }
            Eqs[i] = new Equation(Xarr, Karr, Carr, "C");
        }

        int counter=0;
        for(int i=0;i<resultS1.length;i++){
            eqmasinround[counter].executeEquation(resultS1[i],round,p(resultS1[i],1));
            counter++;
            //System.out.println(counter);
        }
        for(int i=0;i<resultS2.length;i++){
            eqmasinround[counter].executeEquation(resultS2[i],round,p(resultS2[i],2));
            counter++;
            //System.out.println(counter);
        }
        for(int i=0;i<resultS3.length;i++){
            eqmasinround[counter].executeEquation(resultS3[i],round,p(resultS3[i],3));
            counter++;
            //System.out.println(counter);
        }
    }


}
