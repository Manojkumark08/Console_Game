import java.util.*;
class Lucky_Winner extends UserInterface 
{
	ArrayList<Integer> tickets=new ArrayList<Integer>();
	Lucky_Winner()
	{
		
	}
	int snum;
	public void luckyWinner()throws Exception 
	{
		System.out.println("---------Hurry Up to Who is our Lucky Winner-----------");
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
		System.out.println("\t\tAttention!\n1.It is a Money Based like (Lottery), A Ticket Price Rs.200. After Payment You will Receive a Ticket with 6-Digit Number. If that Number Matches with Lucky Number You Will Get One Lakh as Prize Money, If Does't Match Better Luck Next Time and Refund is Not Applicable and A user Can Buy only 8 Tickets at a Time only.\nEnd of the Day Sharply at 23:59 The Winner will Anounced so Kindly Check Status Maybe You are the Lucky Person Today........");
		System.out.println("\t\tNote :\n\tIt is Just for Learning and Fun.........");
	}
	public void ui()throws Exception
	{
		System.out.println("1.Buy Ticket\n2.View Ticket Status\n3.Back");
		while (a)
		{
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
							game();
						}
					break;
					case 2:
						{
							status();
						}
					break;
					case 3:
						{
							luckyWinner();
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
	public void game()throws Exception
	{
		while (a)
		{
			System.out.print("Ticket Count :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<9)
				{
					System.out.println("Redirecting to Payment.....");
					if (payment(user))
					{
						System.out.println("Payment Success");
						ticket(user);
						ui();
						break;
					}
					else
					{
						System.out.println("Payment Failed...");
						ui();
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
	public void status()throws Exception
	{
		while (a)
		{
			System.out.print("Enter Your Ticket :");
			if (sc.hasNextInt())
			{
				int tnum=sc.nextInt();
				if (tickets.contains(tnum))
				{
					if (lucky(tnum))
					{
						System.out.println("Congratulation You are the Lucky and Luckiest Person Today and Your Prize Amount is One Lakh");
						ui();
						break;
					}
					else
					{
						System.out.println("Sorry Buddy Better Luck Next Time........");
						ui();
						break;
					}
				}
				else
				{
					System.out.println("Ticket Number Not Found");
					ui();
					break;
				}
			}
			else
			{
				intNote();
				sc.nextLine();	
			}
		}
	}
	public boolean payment(int count)
	{
		int amount=count*200;
		System.out.printf("Payable Amount is RS.%d\n",amount);
		System.out.println("1.Pay Now\n2.Cancel Payment");
		while (a)
		{
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
							return true;	
						}
					case 2:
						{
							return false;
						}
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
		return false;
	}
	public boolean lucky(int num)
	{
		int lunum=r.nextInt(tickets.size());
		int vtic=tickets.get(lunum);
		if (num==vtic)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void ticket(int count)
	{
		for (int i=0;i<count ;i++ )
		{
			snum=r.nextInt(100000,1000000);
			tickets.add(snum);
			System.out.println("----This is Your Ticket Number-----");
			System.out.printf("%d.Secret Number :%d\n",i+1,snum);
		}
		System.out.println("Dont't Share Your Ticket to Anyone\nKindly check Status");
	}
}
