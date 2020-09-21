import java.util.Random;
public class Bingo {

    public static void main(String[] args) {
        int i, j;
        int[][] c1 = new int[5][5];//Card 1
        int[][] c2 = new int[5][5];//Card 2
        Random rand = new Random();
        System.out.println("Card 1");
        CardMaker(c1);//makes card 1
        System.out.println();
        System.out.println("Card 2");
        CardMaker(c2);//makes card 2
        System.out.println();
        BINGO(c1,c2);
    }
    //makes the card
    public static void CardMaker(int [][]a){
        int i, j, r=0, n=0;
        Random rand = new Random();
        for(i=0;i<5;i++){//first column
            for(j=0;j<1;j++){
                a[i][j] = rand.nextInt(15)+1;
            }
        }
        for(i=0;i<5;i++){//second column
            for(j=1;j<2;j++){
                a[i][j] = rand.nextInt(15)+16;
            }
        }
        for(i=0;i<5;i++){//third column
            for(j=2;j<3;j++){
                a[i][j] = rand.nextInt(15)+31;
            }
        }
        for(i=0;i<5;i++){//fourth column
            for(j=3;j<4;j++){
                a[i][j] = rand.nextInt(15)+46;
            }
        }
        for(i=0;i<5;i++){//last column
            for(j=4;j<5;j++){
                a[i][j] = rand.nextInt(15)+61;
            }
        }
        ifRepeat(a);//checks if any repeat of one number and fixes it
        for(i=0;i<5;i++){//shows card
            for(j=0;j<5;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //long method for rid repeats (hard coded but works)
    public static void ifRepeat(int [][]a){
        int i, j;
        Random rand = new Random();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(j==0){
                    if(i==1){
                        while(a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+1;
                    }
                    if(i==2){
                        while(a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+1;
                    }
                    if(i==3){
                        while(a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+1;
                    }
                    if(i==4){
                        while(a[i][j]==a[3][j] || a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+1;
                    }
                }
                if(j==1){
                    if(i==1){
                        while(a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+16;
                    }
                    if(i==2){
                        while(a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+16;
                    }
                    if(i==3){
                        while(a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+16;
                    }
                    if(i==4){
                        while(a[i][j]==a[3][j] || a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+16;
                    }
                }
                if(j==2){
                    if(i==1){
                        while(a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+31;
                    }
                    if(i==2){
                        while(a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+31;
                    }
                    if(i==3){
                        while(a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+31;
                    }
                    if(i==4){
                        while(a[i][j]==a[3][j] || a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+31;
                    }
                }
                if(j==3){
                    if(i==1){
                        while(a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+46;
                    }
                    if(i==2){
                        while(a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+46;
                    }
                    if(i==3){
                        while(a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+46;
                    }
                    if(i==4){
                        while(a[i][j]==a[3][j] || a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+46;
                    }
                }
                if(j==4){
                    if(i==1){
                        while(a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+61;
                    }
                    if(i==2){
                        while(a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+61;
                    }
                    if(i==3){
                        while(a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+61;
                    }
                    if(i==4){
                        while(a[i][j]==a[3][j] || a[i][j]==a[2][j] || a[i][j]==a[1][j] || a[i][j]==a[0][j])
                            a[i][j] = rand.nextInt(15)+61;
                    }
                }
            }
        }

    }
    //does bingo
    public static void BINGO(int [][]c1, int [][]c2){
        Random rand = new Random();
        int i, j, ra;
        boolean ch1=false, ch2=false;
        while(ch1==false && ch2==false){
            ra = rand.nextInt(75)+1;//calls random number
            for(i=0;i<5;i++){
                for(j=0;j<5;j++){
                    if(c1[i][j]==ra){//if first card has random number
                        c1[i][j]=0;
                    }
                    if(c2[i][j]==ra){//if second card has random number
                        c2[i][j]=0;
                    }
                }
            }
            ch1 = bingoCheck(c1);
            ch2 = bingoCheck(c2);
        }
        if(ch1==true && ch2==true)//if both won (very rarely)
            System.out.println("both won! (check the zeros for the winning line(s))");
        else if(ch1==true && ch2==false)//if Card 1 wins
            System.out.println("Card 1 won! (check the zeros for the winning line(s))");
        else if(ch1==false && ch2==true)//if card 2 wins
            System.out.println("Card 2 won! (check the zeros for the winning line(s))");
        System.out.println();
        System.out.println("Card 1");
        for(i=0;i<5;i++){//shows Card 1 after game
            for(j=0;j<5;j++){
                System.out.print(c1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Card 2");
        for(i=0;i<5;i++){//shows Card 2 after game
            for(j=0;j<5;j++){
                System.out.print(c2[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //determines the winner
    public static boolean bingoCheck(int [][]ch){
        if((ch[0][0]==0 && ch[0][1]==0 && ch[0][2]==0 && ch[0][3]==0 && ch[0][4]==0) ||//rows
                (ch[1][0]==0 && ch[1][1]==0 && ch[1][2]==0 && ch[1][3]==0 && ch[1][4]==0) ||
                (ch[2][0]==0 && ch[2][1]==0 && ch[2][2]==0 && ch[2][3]==0 && ch[2][4]==0) ||
                (ch[3][0]==0 && ch[3][1]==0 && ch[3][2]==0 && ch[3][3]==0 && ch[3][4]==0) ||
                (ch[4][0]==0 && ch[4][1]==0 && ch[4][2]==0 && ch[4][3]==0 && ch[4][4]==0) ||
                (ch[0][0]==0 && ch[1][0]==0 && ch[2][0]==0 && ch[3][0]==0 && ch[4][0]==0) ||//columns
                (ch[0][1]==0 && ch[1][1]==0 && ch[2][1]==0 && ch[3][1]==0 && ch[4][1]==0) ||
                (ch[0][2]==0 && ch[1][2]==0 && ch[2][2]==0 && ch[3][2]==0 && ch[4][2]==0) ||
                (ch[0][3]==0 && ch[1][3]==0 && ch[2][3]==0 && ch[3][3]==0 && ch[4][3]==0) ||
                (ch[0][4]==0 && ch[1][4]==0 && ch[2][4]==0 && ch[3][4]==0 && ch[4][4]==0) ||
                (ch[0][0]==0 && ch[1][1]==0 && ch[2][2]==0 && ch[3][3]==0 && ch[4][4]==0) ||//diagonals
                (ch[0][4]==0 && ch[1][3]==0 && ch[2][2]==0 && ch[3][1]==0 && ch[4][0]==0)){
            return true;
        }
        else
            return false;

    }
}