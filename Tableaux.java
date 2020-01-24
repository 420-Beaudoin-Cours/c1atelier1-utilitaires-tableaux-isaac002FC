/**
 * @author France Beaudoin
 */
public class Tableaux {

    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab1){

        int imax;

        for(int i=0;i<tab1.length-1;i++){

            imax = i;

            for (int j = i+1;j<tab1.length;j++)

                if (tab1[j] > tab1[imax])
                    imax = j;

        if (i != imax)
            permute(tab1, imax, i);

        }

    }

    public static void print(int[] tab){

        for (int i=0; i<tab.length; i++)
            System.out.print("[" + tab[i] + "]");

    }

    public static int maximum(int[] tab){

        int imax = 0;

        for (int j=1;j<tab.length;j++)

            if(tab[j] > tab[imax])
                imax = j;

        return tab[imax];
    }

    public static int minimum(int[] tab){

        int imin = 0;

        for (int j=1;j<tab.length;j++)

            if(tab[j] < tab[imin])
                imin = j;

        return tab[imin];
    }


    public static int moyenne(int[] tab){

        int total = 0;

        for(int i = 0; i<tab.length; i++)
            total += tab[i];

        return total / tab.length;

    }

    public static int fouilleSeq(int[] tab, int cherche){

        int i = 0;
        boolean trouve = false;

        while(i<tab.length && !trouve){

            if(tab[i] == cherche)
                trouve = true;
            else
                i++;

        }

        if (trouve)
            return i;
        else
            return -1;
    }

    public static void trierDecroissantSSS(String[] tab1){

        int imax;

        for(int i=0;i<tab1.length-1;i++){

            imax = i;

            for (int j = i+1;j<tab1.length;j++)

                if (Integer.parseInt(tab1[j]) > Integer.parseInt(tab1[imax]))
                    imax = j;

            if (i != imax)
                permute(tab1, imax, i);

        }

    }

    public static void print(String[] tab){

        for (int i=0; i<tab.length; i++)
            System.out.print("[" + tab[i] + "]");

    }

    public static int maximum(String[] tab){

        int imax = 0;

        for (int j=1;j<tab.length;j++)

            if(Integer.parseInt(tab[j]) > Integer.parseInt(tab[imax]))
                imax = j;

        return Integer.parseInt(tab[imax]);
    }

    public static int minimum(String[] tab){

        int imin = 0;

        for (int j=1;j<tab.length;j++)

            if(Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                imin = j;

        return Integer.parseInt(tab[imin]);
    }


    public static int moyenne(String[] tab){

        int total = 0;

        for(int i = 0; i<tab.length; i++)
            total += Integer.parseInt(tab[i]);

        return total / tab.length;

    }

    public static int fouilleSeq(String[] tab, String cherche){

        int i = 0;
        boolean trouve = false;

        while(i<tab.length && !trouve){

            if(tab[i].equals(cherche))
                trouve = true;
            else
                i++;

        }

        if (trouve)
            return i;
        else
            return -1;
    }

}
