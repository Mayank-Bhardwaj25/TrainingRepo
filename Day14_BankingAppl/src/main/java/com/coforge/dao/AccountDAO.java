package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Account;

public class AccountDAO {

	public  static List<Account> getAllAccounts(Connection conn) throws SQLException {
		
			String query = "select * from account";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			List<Account> accList = new ArrayList<>();
			
			while(rs.next()) {
				Account acc = new Account();
				acc.setAccNo(rs.getInt("accno"));
				acc.setAccHolderName(rs.getString("accholdername"));
				acc.setAccType(rs.getString("acctype"));
				acc.setBalance(rs.getDouble("balance"));
				
				accList.add(acc);
			}
			return accList;
			
		
	}
	
	public static Account addAccount( Connection conn, Account acc) {
		
		String query="insert into account values (?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, acc.getAccNo());
			ps.setString(2, acc.getAccHolderName());
			ps.setString(3, acc.getAccType());
			ps.setDouble(4, acc.getBalance());
			
			ps.executeUpdate();
			return acc ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		//return acc;
		
		
	}

	public static void deleteAccount(Connection conn, int accNo) {
		String query = "delete from account where accno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, accNo);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static Account getAccountById(Connection conn, int accNo) {
		// TODO Auto-generated method stub
		
		String query = "select * from account where accno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, accNo);
			ResultSet rs = ps.executeQuery();
			
			Account acc2 = new Account();
			if(rs.next() ) {
				acc2.setAccNo(rs.getInt("accno"));
				acc2.setAccHolderName(rs.getString("accholdername"));
				acc2.setAccType(rs.getString("acctype"));
				acc2.setBalance(rs.getDouble("balance"));
			}
			return acc2;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	public static void updateAccount(Connection conn, int accNo, String accHolderName, String accType, double balance) {
		// TODO Auto-generated method stub
		String query = "update account set accholdername=?, acctype=?, balance=? where accno=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,accHolderName);
			ps.setString(2, accType);
			ps.setDouble(3,balance);
			ps.setInt(4,accNo );
			
			ps.executeUpdate();
			System.out.println("updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void deposit(Connection conn, int accNo, double amount) {
		// TODO Auto-generated method stub
		
		String query = "update account set balance = balance+? where accno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, amount);
			ps.setInt(2, accNo);
			ps.executeUpdate();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void withdraw(Connection conn, int accNo, double amount) {
		// TODO Auto-generated method stub
		String query = "update account set balance = balance-? where accno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, amount);
			ps.setInt(2, accNo);
			ps.executeUpdate();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static List<Account> searchAccounts(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		 List<Account> list = new ArrayList<>();
		 String query = "select * from account where accholdername like ? or accno like ?";
		 try {
			 PreparedStatement ps = conn.prepareStatement(query);
			 ps.setString(1,  "%"+keyword+"%");
			 ps.setString(2,  "%"+keyword+"%");
			 ResultSet rs = ps.executeQuery();
			 
			 while(rs.next()) {
				 Account acc3 = new Account();
				 acc3.setAccNo(rs.getInt("accno"));
					acc3.setAccHolderName(rs.getString("accholdername"));
					acc3.setAccType(rs.getString("acctype"));
					acc3.setBalance(rs.getDouble("balance"));
					
					list.add(acc3);
				 
			 }
			 return list;
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
	
}
