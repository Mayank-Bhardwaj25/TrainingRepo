package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Item;
import com.coforge.entities.Order;
import com.coforge.util.HibernateUtil;

public class OrderDAO implements OrderDaointerface {

	@Override
	public List<Order> getAllOrders() {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("From Order", Order.class).list();
			
		}
		
		
	}

	@Override
	public void insertOrder(Order order) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(order);
			tx.commit();
			System.out.println("Data inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateOrder(Order order) {
		
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(order);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteOrder(int id) {
		Transaction tx = null;
		// TODO Auto-generated method stub
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			Order order = session.get(Order.class, id);
        if(order!=null) {
        	session.remove(order);
        	
        }
        tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Item getById(long id) {

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Item.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
