package com.bank.util;

import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args)
	{
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(System.in);

			System.out.println("Welcome to XYZ Bank");
			System.out.println("---------------------");
			System.out.println("Press 1 to check balance");
			System.out.println("Press 2 to cash deposit");
			System.out.println("Press 3 to cash withdraw");
			System.out.println("==========================");
			System.out.println("Enter Your choise");
			int choise = scanner.nextInt();

			switch (choise)
			{
			case 1:
				System.out.println("check balance");
				break;

			case 2:
				System.out.println("cash deposit");
				break;

			case 3:
				System.out.println("cash withdraw");
				break;

			default:
				System.out.println("Trying to Exit");
				break;
			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage() + " Enter only Number Input");
			System.out.println();
		}
		finally
		{
			scanner.close();
		}

	}

}
