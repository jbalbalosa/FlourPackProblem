public class Main {
    public static void main(String[] args) {
        System.out.println("Flour Pack Problem!");
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 1, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(2, 7, 18));
        System.out.println(canPack(2, 10, 21));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(6, 2, 17));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result  = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

//        int total = 0;
//        bigCount *= 5;
//        if(bigCount == goal){
//            result  = true;
//        }
//        else if(bigCount < goal){
//            total = bigCount + smallCount;
//            result  = true;
//        }
//        else if(bigCount > goal){
//            result  = false;
//        }

        final int BIG_WEIGHT = 5;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if(totalBigWeight >= goal){
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining){
                result = true;
            }
        }else {
            if (smallCount >= goal-totalBigWeight){
                return true;
            }
        }

        return result ;
    }

}
