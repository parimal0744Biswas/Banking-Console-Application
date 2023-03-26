package com.bank.oparation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Oparations
{

	private static List<Account> accounts = new ArrayList<>();

	static
	{
		accounts.add(new Account(1, "Parimal", 75000.0));
		accounts.add(new Account(2, "Biswas", 23000.0));
		accounts.add(new Account(3, "Lalu", 10.0));
		accounts.add(new Account(4, "Hulo", 12000.0));
		accounts.add(new Account(5, "Kalu", 7000.0));
		accounts.add(new Account(6, "Buli", 3000.0));

	}

	public static String checkBalance(int accNo)
	{
		List<Account> account = accounts.stream().filter(s -> s.getAccountNumber() == accNo)
				.collect(Collectors.toList());

		if (account.isEmpty())
		{
			return "  <====== Worng Account Number";
		}

		return account.get(0).getBalance() + "  <====== This is Your Balance";

	}

	public static String depositBalance(int accNo, double amount)
	{
		List<Account> account = accounts.stream().filter(s -> s.getAccountNumber() == accNo)
				.collect(Collectors.toList());

		if (account.isEmpty())
		{
			return "  <====== Worng Account Number";
		}

		account.get(0).setBalance(account.get(0).getBalance() + amount);

		return account.get(0).getBalance() + " <===== This is new Balance";

	}

	public static String withdrawlBalance(int accNo, double amount)
	{
		List<Account> account = accounts.stream().filter(s -> s.getAccountNumber() == accNo)
				.collect(Collectors.toList());

		if (account.isEmpty())
		{
			return "  <====== Worng Account Number";
		}

		if (account.get(0).getBalance() < amount)
		{
			return " Insufficient Balance";
		}
		else
		{
			account.get(0).setBalance(account.get(0).getBalance() + amount);
		}

		return account.get(0).getBalance() + " <===== This is new Balance";

	}

}
