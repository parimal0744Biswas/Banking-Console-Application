package com.bank.util;

import java.util.Scanner;

import com.bank.oparation.Oparations;

public class MainClass
{
	public static void main(String[] args)
	{
		start();
	}

	public static void start()
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);

			System.out.println("Welcome to XYZ Bank");
			System.out.println("---------------------");
			System.out.println("Press 1 to check balance");
			System.out.println("Press 2 to cash deposit");
			System.out.println("Press 3 to cash withdraw");
			System.out.println("==========================");
			System.out.println("Enter Your choise");
			int choise = sc.nextInt();

			switch (choise)
			{
			case 1:
				System.out.println("check balance");
				System.out.println("=============");
				System.out.println("Enter Account Number");
				int accNo = sc.nextInt();
				System.out.println(Oparations.checkBalance(accNo));
				break;

			case 2:
				System.out.println("cash deposit");
				System.out.println("=============");
				System.out.println("Enter Account Number");
				int accNo1 = sc.nextInt();

				System.out.println("Enter Amount ");
				int amount1 = sc.nextInt();

				System.out.println(Oparations.depositBalance(accNo1, amount1));

				break;

			case 3:
				System.out.println("cash withdraw");
				System.out.println("=============");
				System.out.println("Enter Account Number");
				int accNo2 = sc.nextInt();

				System.out.println("Enter Amount ");
				int amount2 = sc.nextInt();

				System.out.println(Oparations.withdrawlBalance(accNo2, amount2));
				break;

			default:
				System.out.println("Trying to Exit");
				MainClass.start();
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
			sc.close();
		}
	}

}
