package jaga.course;

enum lang{
    JAVA,JAVASCRIPT,PYTHON;
}



public class Main {

    public static void main(String[] args) {
	int value =10000;
    int mymaxvalue = Integer.MAX_VALUE;
    int myminvalue = Integer.MIN_VALUE;
        System.out.println("maximum value = " + (mymaxvalue +1));
        System.out.println("minimum value = " + (myminvalue-1));
        byte minvalue = Byte.MIN_VALUE;
        byte maxvalue = Byte.MAX_VALUE;
        System.out.println(maxvalue);
        System.out.println(minvalue);
        short minivalue = Short.MIN_VALUE;
        short maxivalue = Short.MAX_VALUE;
        System.out.println(maxivalue);
        System.out.println(minivalue);
        long minimvalue = Long.MIN_VALUE;
        long maximvalue = Long.MAX_VALUE;
        System.out.println(maximvalue);
        System.out.println(minimvalue);

        int total = (mymaxvalue / 2);
        byte newtotal = (byte)(maxvalue /2);
        short newmaxtotal = (short)(minivalue / 2);
        long newmaximtotal = (long)(maximvalue /2);
        System.out.println(total);
        System.out.println(newtotal);
        System.out.println(newmaxtotal);
        System.out.println(newmaximtotal);

        byte bytevalue =67;
        short shortvalue = 11115;
        int intvalue = 100;
        long longtotal = 10000L + 50L +(bytevalue+shortvalue+intvalue);
        System.out.println(longtotal);

        short shorttotal = (short) (10000+500+(bytevalue + shortvalue + intvalue ));
        System.out.println(shorttotal);

        float floatmaxvalue = Float.MAX_VALUE;
        float floatminvalue = Float.MIN_VALUE;
        System.out.println(floatmaxvalue);
        System.out.println(floatminvalue);

        double doublemaxvalue = Double.MAX_VALUE;
        double doubleminvalue =Double.MIN_VALUE;
        System.out.println(doublemaxvalue);
        System.out.println(doubleminvalue);

        double numberofpounds = 200d;
        double convertedkilo = numberofpounds * 0.45359273d;
        System.out.println(convertedkilo);

        char myunicodechar = '\u0041';
        System.out.println(myunicodechar);

        int result =1*2;
        System.out.println(result);

        ++result;
        System.out.println(result);

        boolean istopper=true;
        if(istopper=true){
            System.out.println("He is not a topper");
        }else{
            System.out.println("he is a topper");
        }

        lang l1 = lang.JAVA;
        System.out.println(l1);
        System.out.println(lang.values());
        System.out.println(lang.valueOf("JAVASCRIPT"));

        lang arr[] = lang.values();
        System.out.println(arr);

        for (lang ja:arr){
            System.out.println(ja + " at index " + ja.ordinal());
        }


    }
}
