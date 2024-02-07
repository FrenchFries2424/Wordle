import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Wordle {
  public static String[][] board = new String[6][5];
  public static String[][] keyboard = new String[3][10];

  public static int guessCount = 0;
  public static String key = "";
  public static String guess = "";

  public static void main(String[] args) throws IOException {
	  ArrayList<String> list = new ArrayList<> ();
	  Scanner input = new Scanner(new File("wordleWordList.txt"));
    while(input.hasNext()) {
    	list.add(input.next());
    }
   int rando = (int) (Math.random()*(list.size()-0+1)+0);
   key = list.get(rando);
   
    creatBox();
    Guess();
    printBoard();
    Guess();
    printBoard();
    Guess();
    printBoard();
    Guess();
    printBoard();
    Guess();
    printBoard();
    Guess();
    printBoard();

    System.out.println("You lost the word was: " + key);

  }

  public static void creatBox() {
    for (int i = 0; i < board.length; i++) {

      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = "-";

      }
    }
    keyboard[0][0] = "Q"; 
    keyboard[0][1] = "W";
    keyboard[0][2] = "E";
    keyboard[0][3] = "R";
    keyboard[0][4] = "T";
    keyboard[0][5] = "Y";
    keyboard[0][6] = "U";
    keyboard[0][7] = "I";
    keyboard[0][8] = "O";
    keyboard[0][9] = "P";
    keyboard[1][0] = " ";
    keyboard[1][1] = "A";
    keyboard[1][2] = "S";
    keyboard[1][3] = "D";
    keyboard[1][4] = "F";
    keyboard[1][5] = "G";
    keyboard[1][6] = "H";
    keyboard[1][7] = "J";
    keyboard[1][8] = "K";
    keyboard[1][9] = "L";
    keyboard[2][0] = " ";
    keyboard[2][1] = "Z";
    keyboard[2][2] = "X";
    keyboard[2][3] = "C";
    keyboard[2][4] = "V";
    keyboard[2][5] = "B";
    keyboard[2][6] = "N";
    keyboard[2][7] = "M";
    keyboard[2][8] = " ";
    keyboard[2][9] = " ";
  }
  public static void printBoard() {

		System.out.println("---------------------");
		System.out.println("| "+board[0][0]+" | "+ board[0][1]+  " | " + board[0][2]+  " | "+ board[0][3]+  " | " + board[0][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[1][0]+" | "+ board[1][1]+  " | " + board[1][2]+  " | "+ board[1][3]+  " | " + board[1][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[2][0]+" | "+ board[2][1]+  " | " + board[2][2]+  " | "+ board[2][3]+  " | " + board[2][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[3][0]+" | "+ board[3][1]+  " | " + board[3][2]+  " | "+ board[3][3]+  " | " + board[3][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[4][0]+" | "+ board[4][1]+  " | " + board[4][2]+  " | "+ board[4][3]+  " | " + board[4][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[5][0]+" | "+ board[5][1]+  " | " + board[5][2]+  " | "+ board[5][3]+  " | " + board[5][4]+ " |");
		System.out.println("---------------------");	
		
		System.out.println("["+keyboard[0][0]+"]"+"["+keyboard[0][1]+"]"+"["+keyboard[0][2]+"]"+
				           "["+keyboard[0][3]+"]"+"["+keyboard[0][4]+"]"+"["+keyboard[0][5]+"]"+
				           "["+keyboard[0][6]+"]"+"["+keyboard[0][7]+"]"+"["+keyboard[0][8]+"]"+"["+keyboard[0][9]+"]");
		
		System.out.println("["+keyboard[1][0]+"]"+"["+keyboard[1][1]+"]"+"["+keyboard[1][2]+"]"+         
		           		   "["+keyboard[1][3]+"]"+"["+keyboard[1][4]+"]"+"["+keyboard[1][5]+"]"+
		           		   "["+keyboard[1][6]+"]"+"["+keyboard[1][7]+"]"+"["+keyboard[1][8]+"]"+"["+keyboard[1][9]+"]");
		
		System.out.println("["+keyboard[2][0]+"]"+"["+keyboard[2][1]+"]"+"["+keyboard[2][2]+"]"+
		           		   "["+keyboard[2][3]+"]"+"["+keyboard[2][4]+"]"+"["+keyboard[2][5]+"]"+
		           		   "["+keyboard[2][6]+"]"+"["+keyboard[2][7]+"]"+"["+keyboard[2][8]+"]"+"["+keyboard[2][9]+"]");
  }
  public static void Guess() throws FileNotFoundException {
	  ArrayList<String> list1 = new ArrayList<> ();
	  Scanner input1 = new Scanner(new File("wordleWordList.txt"));
    while(input1.hasNext()) {
    	list1.add(input1.next());
    }
    
   
    


    if (guessCount >= 0) {

      Scanner input = new Scanner(System.in);
      System.out.println("What is your guess");
      guess = input.nextLine();
    }
    while(!list1.contains(guess)) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
		System.out.println("| "+board[0][0]+" | "+ board[0][1]+  " | " + board[0][2]+  " | "+ board[0][3]+  " | " + board[0][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[1][0]+" | "+ board[1][1]+  " | " + board[1][2]+  " | "+ board[1][3]+  " | " + board[1][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[2][0]+" | "+ board[2][1]+  " | " + board[2][2]+  " | "+ board[2][3]+  " | " + board[2][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[3][0]+" | "+ board[3][1]+  " | " + board[3][2]+  " | "+ board[3][3]+  " | " + board[3][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[4][0]+" | "+ board[4][1]+  " | " + board[4][2]+  " | "+ board[4][3]+  " | " + board[4][4]+ " |");
		System.out.println("|---|---|---|---|---|");
		System.out.println("| "+ board[5][0]+" | "+ board[5][1]+  " | " + board[5][2]+  " | "+ board[5][3]+  " | " + board[5][4]+ " |");
		System.out.println("---------------------");
	
		System.out.println("["+keyboard[0][0]+"]"+"["+keyboard[0][1]+"]"+"["+keyboard[0][2]+"]"+
		           "["+keyboard[0][3]+"]"+"["+keyboard[0][4]+"]"+"["+keyboard[0][5]+"]"+
		           "["+keyboard[0][6]+"]"+"["+keyboard[0][7]+"]"+"["+keyboard[0][8]+"]"+"["+keyboard[0][9]+"]");

System.out.println("["+keyboard[1][0]+"]"+"["+keyboard[1][1]+"]"+"["+keyboard[1][2]+"]"+         
        		   "["+keyboard[1][3]+"]"+"["+keyboard[1][4]+"]"+"["+keyboard[1][5]+"]"+
        		   "["+keyboard[1][6]+"]"+"["+keyboard[1][7]+"]"+"["+keyboard[1][8]+"]"+"["+keyboard[1][9]+"]");

System.out.println("["+keyboard[2][0]+"]"+"["+keyboard[2][1]+"]"+"["+keyboard[2][2]+"]"+
        		   "["+keyboard[2][3]+"]"+"["+keyboard[2][4]+"]"+"["+keyboard[2][5]+"]"+
        		   "["+keyboard[2][6]+"]"+"["+keyboard[2][7]+"]"+"["+keyboard[2][8]+"]"+"["+keyboard[2][9]+"]");

        System.out.println("Invalid word: What is your new guess");
        guess = input.nextLine();
       	

      }
    ArrayList < String > list = new ArrayList < > ();
    for (int i = 0; i < key.length(); i++) {
      list.add(key.substring(i, i + 1));
    }
    for (int i = 0; i < board.length; i++) {
      if (i == guessCount) {

        for (int j = 0; j < board[i].length; j++) {
          board[i][j] = guess.substring(j, j + 1);

          if (key.substring(j, j + 1).equals(guess.substring(j, j + 1)) && list.contains(board[i][j])) {
            list.remove(board[i][j]);
            board[i][j] = "\u001b[32m" + guess.substring(j, j + 1) + "\u001b[0m";
          
          }
          
          else if (key.contains(board[i][j]) && list.contains(board[i][j])) {
            list.remove(board[i][j]);
            board[i][j] = "\u001b[33m" + guess.substring(j, j + 1) + "\u001b[0m";

          } else {
            board[i][j] = "\u001b[31m" + guess.substring(j, j + 1) + "\u001b[0m";
          }
          
        }

      }

    }
   
    
    if (key.equals(guess)) {

      System.out.println("---------------------");
      System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | " + board[0][4] + " |");
      System.out.println("|---|---|---|---|---|");
      System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4] + " |");
      System.out.println("|---|---|---|---|---|");
      System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4] + " |");
      System.out.println("|---|---|---|---|---|");
      System.out.println("| " + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4] + " |");
      System.out.println("|---|---|---|---|---|");
      System.out.println("| " + board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4] + " |");
      System.out.println("|---|---|---|---|---|");
      System.out.println("| " + board[5][0] + " | " + board[5][1] + " | " + board[5][2] + " | " + board[5][3] + " | " + board[5][4] + " |");
      System.out.println("---------------------");
      System.out.println("You guess it you win!");
      System.exit(0);
    }

    guessCount += 1;
  }

}
