class Number_Guess extends UserInterface
{
	Number_Guess()
	{
		
	}
	public void numberGuess() 
	{
		System.out.println("---------Hurry Up to Number Guessing-----------");
		System.out.println("\t\tRules!\n1.The Number you have to Guess Between 0 to 100\n2.No Negative Numbers are Allowed and No Invalid Inputs are Allowed");
		game();
		System.out.println("1.Play Again\n2.Back");
		System.out.print("Wanna Move to :");
		while (a)
		{
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user==1 || user==2)
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
	public void game()
	{
		System.out.println("\tLoading.....");
		System.out.println("\tNow Game Gets Begin...");
		int gnum=r.nextInt(100);
		while (a)
		{
			System.out.print("Guess the Number :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user==gnum)
				{
					System.out.printf("Congratulation!...'%d' is the Secret Number,You Won ...........\n",user);
					break;
				}
				else if(user>gnum)
				{
					System.out.printf("sorry, '%d' is Little High than Secret Number...\n",user);
				}
				else
				{
					System.out.printf("sorry, '%d' is Little Low than Secret Number...\n",user);
				}
			}
			else
			{
				intNote();
			}
		}
	}
}
