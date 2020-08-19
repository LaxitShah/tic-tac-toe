package HW;

import java.util.Scanner;

class Getmethods
{
	char pos[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };

	char p1 = 'X', p2 = 'O';
	Scanner sc = new Scanner(System.in);

	void printTable()
	{
		System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2]);
		System.out.println("--- --- ---");
		System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5]);
		System.out.println("--- --- ---");
		System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8]);

	}

	public void setposition(int position, char p)
	{
		if (position == 0)
		{
			pos[0] = p;
		}
		else if (position == 1)
		{
			pos[1] = p;
		}
		else if (position == 2)
		{
			pos[2] = p;
		}
		else if (position == 3)
		{
			pos[3] = p;
		}
		else if (position == 4)
		{
			pos[4] = p;
		}
		else if (position == 5)
		{
			pos[5] = p;
		}
		else if (position == 6)
		{
			pos[6] = p;
		}
		else if (position == 7)
		{
			pos[7] = p;
		}
		else if (position == 8)
		{
			pos[8] = p;
		}

	}

	public void p1winner()
	{
		if (pos[0] == 'X' && pos[1] == 'X' && pos[2] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[3] == 'X' && pos[4] == 'X' && pos[5] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[6] == 'X' && pos[7] == 'X' && pos[8] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[0] == 'X' && pos[3] == 'X' && pos[6] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[1] == 'X' && pos[4] == 'X' && pos[7] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[2] == 'X' && pos[5] == 'X' && pos[8] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[0] == 'X' && pos[4] == 'X' && pos[8] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}
		else if (pos[2] == 'X' && pos[4] == 'X' && pos[6] == 'X')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player1 is winner-------");
			System.exit(0);
		}

	}

	public void p2winner()
	{
		if (pos[0] == 'O' && pos[1] == 'O' && pos[2] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[3] == 'O' && pos[4] == 'O' && pos[5] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[6] == 'O' && pos[7] == 'O' && pos[8] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[0] == 'O' && pos[3] == 'O' && pos[6] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[1] == 'O' && pos[4] == 'O' && pos[7] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[2] == 'O' && pos[5] == 'O' && pos[8] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[0] == 'O' && pos[4] == 'O' && pos[8] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}
		else if (pos[2] == 'O' && pos[4] == 'O' && pos[6] == 'O')
		{
			System.out.println("\t\t\t***Congratulations***");
			System.out.println("\t\t\t----Player2 is winner-------");
			System.exit(0);
		}

	}

	public void player1()
	{
		int position;

		System.out.println("enter the position for player 1:");
		position = sc.nextInt();

		if (pos[position] == 'X' || pos[position] == 'O')
		{
			System.out.println("Position is already taken ");

			System.out.println("Try Again!!!");

			boolean check = true;

			do
			{
				System.out.println("enter the position again:");
				position = sc.nextInt();

				if (pos[position] == 'X' || pos[position] == 'O')
				{
					System.out.println("Position is already taken ");

					System.out.println("Try Again!!!");

				}
				else
				{
					setposition(position, p1);
					printTable();
					check = false;

				}
			}
			while (check);

		}
		else if (position >= 0 && position <= 8)
		{
			setposition(position, p1);
			printTable();
		}
		else
		{
			boolean check1 = false;

			do
			{
				System.out.println("enter the position");
				position = sc.nextInt();

				if (position >= 0 && position <= 8)
				{
					setposition(position, p1);
					printTable();
					check1 = true;
					break;
				}
			}
			while (true);
		}

	}

	public void player2()
	{
		int position;

		System.out.println("enter the position for player 1:");
		position = sc.nextInt();

		if (pos[position] == 'X' || pos[position] == 'O')
		{
			System.out.println("Position is already taken ");

			System.out.println("Try Again!!!");

			boolean check = true;

			do
			{
				System.out.println("enter the position again:");
				position = sc.nextInt();

				if (pos[position] == 'X' || pos[position] == 'O')
				{
					System.out.println("Position is already taken ");

					System.out.println("Try Again!!!");

				}
				else
				{
					setposition(position, p2);
					printTable();
					check = false;

				}
			}
			while (check);

		}
		else if (position >= 0 && position <= 8)
		{
			setposition(position, p2);
			printTable();
		}
		else
		{
			boolean check1 = false;

			do
			{
				System.out.println("enter the position");
				position = sc.nextInt();

				if (position >= 0 && position <= 8)
				{
					setposition(position, p1);
					printTable();
					check1 = true;
					break;
				}
			}
			while (true);
		}

	}
}

class Threads1
{
	Getmethods get = new Getmethods();

	public synchronized void first()
	{
		try
		{
			get.printTable();
			get.player1();
			wait();

			get.player1();
			notify();
			wait();

			get.player1();
			get.p1winner();
			notify();
			wait();
			get.player1();
			get.p1winner();
			notify();
			wait();
			get.player1();
			get.p1winner();
			System.out.println("Ohhhhh!!!!!");
			System.out.println("the match is draw");
			System.exit(0);

		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public synchronized void second()
	{
		try
		{
			get.player2();
			notify();
			wait();

			get.player2();
			notify();
			wait();

			get.player2();
			get.p2winner();
			notify();
			wait();
			get.player2();
			get.p2winner();
			notify();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}

public class TicTacToe_N
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t----Welcome to Tic-Tac-Toe-----");
		System.out.println();
		System.out.println();

		System.out.println("Enter the name of player 1:");
		String player1 = scanner.next();

		System.out.println();
		System.out.println();

		System.out.println("*******************");

		System.out.println();
		System.out.println();

		System.out.println("Enter the name of player 2:");
		String player2 = scanner.next();

		System.out.println();
		System.out.println();

		System.out.println(player1 + " is assigned 'X' ");
		System.out.println(player2 + " is assigned 'O' ");

		System.out.println();
		System.out.println();

		Threads1 t1 = new Threads1();

		new Thread()
		{
			public void run()
			{
				t1.first();
			}
		}.start();

		new Thread()
		{
			public void run()
			{
				t1.second();
			}
		}.start();
	}
}
