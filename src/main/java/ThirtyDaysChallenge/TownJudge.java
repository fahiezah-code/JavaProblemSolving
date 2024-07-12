package ThirtyDaysChallenge;

public class TownJudge {

    public static void main(String[] args) {

        int[][] trust = {{1,3},{2,3}};
        //[1,3]
        //[2,3]
        System.out.println(checkTownJudge(3,trust));


    }
    public static int checkTownJudge(int n, int[][] trust){
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];
        for(int i=0; i< trust.length; i++){
            inDegree[trust[i][1]]++;
            outDegree[trust[i][0]]++;
        }

        // loop till (i=1,i<=n)
        //check inDegree = (n-1) && outDegree = 0 ?
        for(int i=1; i<=n; i++){
            if(inDegree[i]==n-1 && outDegree[i] == 0){
                return i;
            }
        }
        return -1;

    }
}
