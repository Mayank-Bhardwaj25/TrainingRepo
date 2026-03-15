package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Item;
import com.coforge.util.HibernateUtil;



public class ItemDAO implements ItemDaoInterface {

	@Override
	public List<Item> getAllItem() {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("From Item", Item.class).list();
			
		}
	}

	@Override
	public void insertItem(Item item) {
		// TODO Auto-generated method stub
		
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.persist(item);
			tx.commit();
			System.out.println("Data inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateItem(Item item) {

		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(item);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteItem(long id) {
		Transaction tx = null;
		// TODO Auto-generated method stub
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			Item item = session.get(Item.class, id);
        if(item!=null) {
        	
        	session.remove(item);
        	
        }
        tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
       
	}

	@Override
	public Item getById(long id) {
		// TODO Auto-generated method stub
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Item.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}

}
