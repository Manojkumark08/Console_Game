import java.util.*;
class Tic_Tac_Toe extends UserInterface
{
	Tic_Tac_Toe()
	{
		
	}
	static ArrayList<Object> al=new ArrayList<Object>();
	static int turn=0;
	static String name1="";
	static String name2="";
	public void tictactoe()throws Exception 
	{
		System.out.println("---------Hurry Up to Tic Tac Toe-----------");
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
	public void ui()throws Exception
	{
		while (a)
		{
			System.out.println("Play with.....\n1.New Player\n2.System\n3.Back");
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
							player();
						}
					break;
					case 2:
						{
							system();
						}
					break;
					case 3:
						{
							tictactoe();
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
		System.out.println("\t\tAttention!\n1.Enter a number between 1 and 9 only.\nExample: 1 → Top left, 5 → Center, 9 → Bottom right.\n2.You cannot select a cell that is already taken by X or O.\n3.If you enter a number outside 1–9, you will be asked again.\n4.If you enter letters or invalid input, you will be asked again.\n5.The winner is the first to get 3 marks in a row:\n(i)Horizontally (Row)\n(ii)Vertically (Column)\n(iii)Diagonally\n6.If all 9 moves are filled and no winner → Game Draw.");
	}
	public void player()throws Exception
	{
		while (a)
		{
			System.out.println("1.Play Now\n2.Back");
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
							gameP();
						}
					break;
					case 2:
						{
							ui();
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
	public void system()throws Exception
	{
		while (a)
		{
			System.out.println("1.Play Now\n2.Back");
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
							gameS();
						}
					break;
					case 2:
						{
							ui();
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
	public void gameP()throws Exception
	{
		System.out.println("Lets Begin.....");
		System.out.print("Enter First Gamer Name :");
		name1 = sc.next();
		System.out.print("Enter Second Gamer Name :");
		name2 = sc.next();
		while (a)
		{
			System.out.printf("%s, Which one You Want (X/O) ? :",name1);
			char user=sc.next().charAt(0);
			if (user=='X' || user=='x')
			{
				System.out.printf("Then %s get 'O'.\n",name2);
				run();
			}
			else if (user=='O' || user=='o')
			{
				System.out.printf("Then %s get 'X'.\n",name2);
				run();
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}	
	}
	public void gameS()throws Exception
	{
		System.out.println("Lets Begin.....");
		while (a)
		{
			System.out.print("Which one You Want ?(X/O) :");
			char user=sc.next().charAt(0);
			if (user=='X' || user=='x')
			{
				System.out.print("Gamer Name ?:");
				name1 = sc.next();
				System.out.println("Then System take 'O'");
				sysrun(1);
			}
			else if (user=='O' || user=='o')
			{
				System.out.print("Enter First Gamer Name :");
				name2 = sc.next();
				System.out.println("Gamer Name ?:");
				sysrun(2);
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}	
	}
	public static void run()throws Exception
	{
		inputboard();
		System.out.println("Here the Option, In game You will Move your Every Steps by 1 to 9.....");
		options();
		System.out.println(".........Here is Your Game Ground........");
		upboard();
		while (a)
		{
			xgame();
		if (checkwin("X"))
		{
			upboard();
			System.out.println("X Wins the Game");
			opinion();
			break;
		}
		if (turn==9)
		{
			upboard();
			System.out.println("Game Draw");
		}
		ogame();
		if (checkwin("O"))
		{
			upboard();
			System.out.println("O Wins the Game");
			opinion();
			break;
		}
		}
	}
	public static void sysrun(int b)throws Exception
	{
		inputboard();
		System.out.println("Here the Option, In game You will Move your Every Steps by 1 to 9.....");
		options();
		System.out.println(".........Here is Your Game Ground........");
		upboard();
		while (a)
		{
			if (b==1)
			{
				xgame();
			}
			else
			{
				xsys();	
			}
		if (checkwin("X"))
		{
			upboard();
			System.out.println("X Wins the Game");
			opinions();
			break;
		}
		if (turn==9)
		{
			upboard();
			System.out.println("Game Draw");
		}
		if (b==1)
			{
				osys();
			}
			else
			{
				ogame();	
			}
		if (checkwin("O"))
		{
			upboard();
			System.out.println("O Wins the Game");
			opinions();
			break;
		}
		}
	}
	public static void opinion()throws Exception
	{
		Tic_Tac_Toe game=new Tic_Tac_Toe();
		System.out.println();
		System.out.println("1.Play Again\n2.Back");
		while (a)
		{
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user<3 && user>0)
				{
					switch (user)
					{
					case 1:
						{
							game.player();
						}
					break;
					case 2:
						{
							game.ui();
						}
					break;
					}
				}
				else
				{
					game.elseNote();
					sc.nextLine();
				}
			}
			else
			{
				game.intNote();
				sc.nextLine();
			}
		}	
	}
	public static void opinions()throws Exception
	{
		Tic_Tac_Toe game=new Tic_Tac_Toe();
		System.out.println();
		System.out.println("1.Play Again\n2.Back");
		while (a)
		{
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user<3 && user>0)
				{
					switch (user)
					{
					case 1:
						{
							game.system();
						}
					break;
					case 2:
						{
							game.ui();
						}
					break;
					}
				}
				else
				{
					game.elseNote();
					sc.nextLine();
				}
			}
			else
			{
				game.intNote();
				sc.nextLine();
			}
		}	
	}
	public static void xsys()
	{
		while (a)
			{
				int user=r.nextInt(1,9);
				System.out.print("Its System Move :"+user+"\n");
				if (al.get(user-1).equals("X")||al.get(user-1).equals("O"))
				{
					System.out.print("Enter again :"+user+"\n");
					sc.nextLine();
				}
				else
				{
					al.set(user-1,"X");	
					upboard();
					turn++;
					break;
				}
			}
	}
	public static void osys()
	{
		while (a)
			{
				int user=r.nextInt(1,9);
				System.out.print("Its System Move :"+user+"\n");
				if (al.get(user-1).equals("X")||al.get(user-1).equals("O"))
				{
					System.out.print("Enter again :"+user+"\n");
					sc.nextLine();
				}
				else
				{
					al.set(user-1,"O");	
					upboard();
					turn++;
					break;
				}
			}
	}
	public static void xgame()
	{
		while (a)
			{
				int user=0;
				System.out.printf("%s, Its Your Move :",name1);
				if (sc.hasNextInt())
				{
					user=sc.nextInt();
					if (user<1||user>9)
					{
						System.out.print("Enter again :");
						sc.nextLine();
					}
				}
				else
				{
					System.out.print("Enter again :");
					sc.nextLine();
				}
				if (al.get(user-1).equals("X")||al.get(user-1).equals("O"))
				{
					System.out.print("Enter again :");
					sc.nextLine();
				}
				else
				{
					al.set(user-1,"X");	
					upboard();
					turn++;
					break;
				}
			}
	}
	public static void ogame()
	{
		while (a)
			{
				int user=0;
				System.out.printf("%s, Its Your Move :",name2);
				if (sc.hasNextInt())
				{
					user=sc.nextInt();
					if (user<1||user>9)
					{
						System.out.print("Enter again :");
						sc.nextLine();
					}
				}
				else
				{
					System.out.print("Enter again :");
					sc.nextLine();
				}
				if (al.get(user-1).equals("X")||al.get(user-1).equals("O"))
				{
					System.out.print("Enter again :");
					sc.nextLine();
				}
				else
				{
					al.set(user-1,"O");	
					upboard();
					turn++;
					break;
				}
			}
	}
	public static void upboard()
	{
		int idx=0;
		for (int i = 0; i < 7; i++) 
		{
            for (int j = 0; j < 7; j++) 
			{  
				if (i==0 || j==0 || j==6 || i==6)
					{
						continue;
					}
                if (i % 2 == 0 || j % 2 == 0) 
				{
                    System.out.print("* ");
                }
				else 
				{
					Object val = al.get(idx);
					if (val.equals("X") || val.equals("O")) 
					{
						System.out.print(val + " ");
					} 
					else 
					{
						System.out.print("  "); 
					}
					idx++;
                }
            }
            System.out.println();
		}
	}
	public static void options()
	{
		int num=1;
		for (int i=0;i<7 ;i++ )
		{
			for (int j=0;j<7;j++ )
			{
				if ((i%2==0 || j%2==0))
				{
					if (i==0 || j==0 || j==6 || i==6)
					{
						continue;
					}
					System.out.print(". ");
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
	public static void inputboard()
	{
		al.clear();
		for (int i=1;i<10 ;i++ )
		{
			al.add(String.valueOf(i));
		}
	}
	public static boolean checkwin(String sys)
	{
		return (al.get(0).equals(sys) && al.get(1).equals(sys) && al.get(2).equals(sys)) ||
               (al.get(3).equals(sys) && al.get(4).equals(sys) && al.get(5).equals(sys)) ||
               (al.get(6).equals(sys) && al.get(7).equals(sys) && al.get(8).equals(sys)) ||
               (al.get(0).equals(sys) && al.get(4).equals(sys) && al.get(8).equals(sys)) ||
               (al.get(2).equals(sys) && al.get(4).equals(sys) && al.get(6).equals(sys)) ||
               (al.get(0).equals(sys) && al.get(3).equals(sys) && al.get(6).equals(sys)) ||
               (al.get(1).equals(sys) && al.get(4).equals(sys) && al.get(7).equals(sys)) ||
               (al.get(2).equals(sys) && al.get(5).equals(sys) && al.get(8).equals(sys));
    }
}
