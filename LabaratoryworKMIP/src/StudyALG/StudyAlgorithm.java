package StudyALG;

import java.util.ArrayList;


public class StudyAlgorithm{

    public static int Data=55203;
    public static int Key=1760619;
    public static int[] EandP={7,4,5,3,1,6,2,8,1,6,5,4};
    public static int[] P={8,7,3,2,5,4,1,6};
    public static int[] S1={0,6,3,5,7,4,4,7,
                            5,6,3,0,2,1,1,2};
    public static int[] S2={2,2,1,1,5,5,6,6,
                            7,4,7,4,0,3,3,0};
    public static int[] S3={2,2,3,3,
                            2,2,3,3,
                            0,0,1,1,
                            0,0,1,1};
    public static String[] resultDocument;
    public static ArrayList<String> list;

    private static boolean permissionToWrite=false;


    public static boolean isPermissionToWrite() {
        return permissionToWrite;
    }

    public static void setPermissionToWrite(boolean permissionToWrite) {
        StudyAlgorithm.permissionToWrite = permissionToWrite;
    }

    public static int StudyAlgorithm(){
        int[] K;
        int promkey=Key;
        int word=Data;
        list=new ArrayList<String>();
        K = Alcorithme.selectKeysfromKey(promkey);

        if (isPermissionToWrite()==true) {
            addStringinList("Данные для шифрования  "+ word+" - "+FeistelFunc.extentiontoByte(FeistelFunc.toBinar(word)));
            addStringinList("Ключ из которого извлекаем раундовые "+promkey+" - "+Alcorithme.extentiontoTwentyfourBits(FeistelFunc.toBinar(promkey)));
            addStringinList("1 раундовый ключ "+K[0]+" - "+FeistelFunc.extentiontoTwelveBits(FeistelFunc.toBinar(K[0])));
            addStringinList("2 раундовый ключ "+K[1]+" - "+FeistelFunc.extentiontoTwelveBits(FeistelFunc.toBinar(K[1])));
            addStringinList("3 раундовый ключ "+K[2]+" - "+FeistelFunc.extentiontoTwelveBits(FeistelFunc.toBinar(K[2])));
        }

        int res = Alcorithme.studyalgorithme(word,K);

        StudyAlgorithm.resultDocument=new String[list.size()];
        for(int i=0;i<list.size();i++){
            StudyAlgorithm.resultDocument[i]=list.get(i);
        }

        /*
        int res2= AlCorithme.sdesinv(res,K);

        addStringinList("Результат алгоритма S-DES "+res+ " - "+Feistel.extentiontoByte(Feistel.toBinar(res)));

        addStringinList("Результат расшифровки алгоритма S-DES "+res2+ " - "+Feistel.extentiontoByte(Feistel.toBinar(res2)));
         */
        return res;
    }

    public static void addStringinList(String input){
        list.add(input);
    }

/*
    public static void addarrayinDec(int[] arr){
        String res=new String();
        for(int i=0;i<arr.length;i++){
            res=res.concat(String.valueOf(arr[i]).concat(" "));
        }
        list.add(res);
    };

    public static void addarrayinBin(int[] arr){
        String res=new String();
        for(int i=0;i<arr.length;i++){
            res=res.concat(Feistel.toBinar(arr[i]).concat(" "));
        }
        list.add(res);
    };


 */

}



