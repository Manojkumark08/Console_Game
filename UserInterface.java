import java.util.*;
class UserInterface 
{
	static final Scanner sc=new Scanner(System.in);
	static boolean a = true;
	static Random r=new Random();
	public void frontPage()throws Exception
	{
		System.out.println("\t\t1.Number Guess\n\t\t2.Tic-Tac-Toe\n\t\t3.Rock-Paper-Scissor\n\t\t4.Lucky Winner Today\n\t\t5.Dice Thrice\n\t\t6.Flames\n\t\t7.Exit");
		while (a)
		{
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<8)
				{
					switch (user)
					{
					case 1:
						{
							Number_Guess ng=new Number_Guess();
							ng.numberGuess();
						}
					break;
					case 2:
						{
							Tic_Tac_Toe ttt=new Tic_Tac_Toe();
							ttt.tictactoe();
						}
					break;
					case 3:
						{
							Rock_Paper_Scissor rps=new Rock_Paper_Scissor();
							rps.rockPaperScissor();
						}
					break;
					case 4:
						{
							Lucky_Winner lw=new Lucky_Winner();
							lw.luckyWinner();
						}
					break;
					case 5:
						{
							Dice_Roll dr=new Dice_Roll();
							dr.diceRoll();
						}
					break;
					case 6:
						{
							Flames fs=new Flames();
							fs.flames();
						}
					break;
					case 7:
						{
							thankyou();
						}
					break;
					}
				}
				else
				{
					elseNote();
					sc.nextLine();
				}
			}
			else
			{
				intNote();
				sc.nextLine();
			}
		}
	}
	public void intNote()
	{
		System.out.println("Innvalid Input, Try Again...");
	}
	public void elseNote()
	{
		System.out.println("Enter Valid Input....");
	}
	public void thankyou()
	{
		System.out.println("Thank You Buddy, You Rock it.....");
		System.exit(0);
	}
	public static void main(String[] args)throws Exception 
	{
		System.out.println("--------------Its Java Console Game Corner Buddy--------------");
		UserInterface ui=new UserInterface();
		ui.frontPage();
	}
}
