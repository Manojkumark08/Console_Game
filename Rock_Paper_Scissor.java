import java.util.*;
class Rock_Paper_Scissor extends UserInterface 
{
	ArrayList<String> al= new ArrayList<String>();
	Rock_Paper_Scissor()
	{
		
	}
	public void rockPaperScissor()throws Exception 
	{
		System.out.println("---------Hurry Up to Rock-Paper-Scissor-----------");
		while (a)
		{
			System.out.println("1.Play Game\n2.About Game\n3.Back");
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<4)
				{
					switch (user)
					{
					case 1:
						{
							ui();
						}
					break;
					case 2:
						{
							rules();
						}
					break;
					case 3:
						{
							frontPage();
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
	public void rules()
	{
		System.out.println("\t\tAttention!\n1.When Game get Started You will Pick one Option from given [Rock, Paper, Scissor] & Same Time System Will Pick one from [Rock, Paper, Scissor].\n2.Rock Defeat Scissor\n3.Scissor cuts Paper\n4.Paper Hold/Catch Rock\n5.If You and User Pick Same from [Rock, Paper, Scissor] the Game gets Draw/Die");
	}
	public void ui()throws Exception
	{
		System.out.println("\t\tSystem VS You");
		System.out.println("Lets Begin.....");
		al.add("Rock");
		al.add("Paper");
		al.add("Scissor");
		game();
		while (a)
		{
			System.out.println("1.Play Again\n2.Back");
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<3)
				{
					switch (user)
					{
					case 1:
						{
							game();
						}
					break;
					case 2:
						{
							rockPaperScissor();
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
	public void game()
	{
		
		while (a)
		{
			System.out.println("1.Rock\n2.Paper\n3.Scissor");
			System.out.print("What You Pick :");
			int sys = r.nextInt(al.size());
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<4)
				{
					switch (user)
					{
					case 1:
						{
							if (sys==0)
							{
								System.out.println("You and System Pick Rock, So Game Die........");
							}
							else if (sys==1)
							{
								System.out.println("You :Rock ");
								System.out.println("System :"+al.get(sys));
								System.out.println("Rock gets Holded,Sorry You Lost....");
							}
							else
							{
								System.out.println("You :Rock ");
								System.out.println("System :"+al.get(sys));
								System.out.println("Rock Defeat Scissor,so You Won....");
							}
						}
					break;
					case 2:
						{
							if (sys==1)
							{
								System.out.println("You and System Pick Paper, So Game Die........");
							}
							else if (sys==0)
							{
								System.out.println("You :Paper ");
								System.out.println("System :"+al.get(sys));
								System.out.println("Paper Hold Rock ,so You Won....");
							}
							else
							{
								System.out.println("You :Paper");
								System.out.println("System :"+al.get(sys));
								System.out.println("Paper gets Cutted by Scissor,so You Lost......");
							}
						}
					break;
					case 3:
						{
							if (sys==2)
							{
								System.out.println("You and System Pick Scissor, So Game Die........");
							}
							else if (sys==0)
							{
								System.out.println("You :Scissor");
								System.out.println("System :"+al.get(sys));
								System.out.println("Scissor gets Broke by Rock,Sorry You Lost....");
							}
							else
							{
								System.out.println("You :Scissor");
								System.out.println("System :"+al.get(sys));
								System.out.println("Scissor Cutted the Paper,so You Won....");
							}
						}
					}
					break;
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
}
