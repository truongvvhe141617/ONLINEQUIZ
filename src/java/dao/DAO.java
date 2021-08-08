/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Quiz;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vuong Van Truong
 */
public class DAO {

	public User getUser(String user, String pass) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from [user] where [user_name] = ? and [password]= ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return null;
	}

	public boolean checkExist(String user) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from [user] where [user_name] = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return false;
	}

	public void registerAcc(String user, String pass, int role, String createdDate, String email) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "insert into [user]\n"
				+ "values(N'" + user + "',N'" + pass + "'," + role + ",'" + createdDate + "',N'" + email + "')";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
	}

	public void makeQuiz(String question, String option1, String option2, String option3, String option4, String answer, String date, int userId) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "insert into quiz \n"
				+ "values(N'" + question + "',N'" + option1 + "',N'" + option2 + "',N'" + option3 + "',N'" + option4 + "','" + answer + "','" + date + "','" + userId + "')";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
	}

	public List<Quiz> getListQuiz(int numOfQuiz) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "Select top " + numOfQuiz + " * from quiz order by newid()";
		List<Quiz> list = new ArrayList<>();
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Quiz(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getInt(9)));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return list;
	}

	public List<Quiz> getListByUser(int userId) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from quiz where user_id= ? order by id";
		List<Quiz> list = new ArrayList<>();
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			while (rs.next()) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
				list.add(new Quiz(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						sdf.format(rs.getDate(8)),
						rs.getInt(9)));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return list;
	}

	public Quiz getQuizByID(int id) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from quiz where id=?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
				return new Quiz(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						sdf.format(rs.getDate(8)),
						rs.getInt(9));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return null;
	}

	

	public static void main(String[] args) {
		try {
			DAO dao = new DAO();
			
		} catch (Exception e) {
		}

	}

}
