package com.t3.midterm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.t3.midterm.Benefitsinterface.BenefitInterface;

public class AttendanceIntergace {

	public class  AttendanceInterface {
		static DataSource db;
		
		final String CREATE    = "INSERT INTO attendance (benefit_id, dental, life, health, 401k_match_amount) VALUES (?,?,?,?,?)";
		final String READ_ID   = "SELECT * FROM attendance WHERE emp_id = ?";
		final String READ_TARDY = "SELECT * FROM attendance WHERE tardys = ?";
		final String READ_ABSENTS = "SELECT * FROM attendance WHERE absents = ?";
		final String READ_EXCUSEDA ="SELECT * FROM attendance WHERE excused_absents = ?";
		final String READ_EXCUSEDT = "SELECT * FROM attendance WHERE excused_tardys = ?";
		final String READ_ALL  = "SELECT * FROM attendance";
		final String UPDATE    = "UPDATE attendance  SET  = ?, life = ?, health = ?, 401k_match_amount = ? WHERE emp_id = ?";
		final String DELETE    = "DELETE FROM attendance WHERE emp_id = ?";
		

	}
	
	public void AttendanceInterface(DataSource db) {
		BenefitInterface.db = db;
}
	
	public void readAllTableByAttendanceId(int emp_id) {
		Attendance returnedAttendance = null;
		try (Connection c = db.getConnection();
				PreparedStatement ps = c.prepareStatement(READ_ID);) {
			ps.setInt(1, emp_id);
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				returnedAttendance = new Attendance(rs.getInt(1), 
						 						rs.getInt(2), 
						 						rs.getInt(3),
												rs.getInt(4),
												rs.getInt(5),
												rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Attendance readTardy(int tardys) {
		Attendance returnedAttendance = null;
		try (Connection c = db.getConnection();
				PreparedStatement ps = c.prepareStatement(READ_TARDY);) {
			ps.setInt(1, );
			
			
			ResultSet rs = ps.executeQuery(READ_TARDY);

			while (rs.next()) {
				returnedAttendance = new Attendance rs.getInt(1), 
  												rs.getInt(2), 
  												rs.getInt(3),
  												rs.getInt(4),
  												rs.getInt(5),
  												rs.getInt(6));
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return returnedAttendance;
	}	
		
	
	public Benefits readAbsents(int absents) {
		Attendance returnedAttendance = null;
		try (Connection c = db.getConnection();
				PreparedStatement ps = c.prepareStatement(READ_ABSENTS);) {
			ps.setInt(1, absents);
			
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				returnedAttendance = new Attendance(rs.getInt(1), 
  												rs.getInt(2), 
  												rs.getInt(3),
  												rs.getInt(4),
  												rs.getInt(5),
  												rs.getInt(6));
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return returnedAttendance;
	}	
	
	
	public Benefits readExcusedTardy(int excusedT) {
		Attendance returnedAttendance = null;
		try (Connection c = db.getConnection();
				PreparedStatement ps = c.prepareStatement(READ_EXCUSEDT);) {
			ps.setInt(1, excusedT);
			
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				returnedAttendance = new Attendance(rs.getInt(1), 
  												rs.getInt(2), 
  												rs.getInt(3),
  												rs.getInt(4),
  												rs.getInt(5),
  												rs.getInt(6));
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return returnedAttendance;
	}	
	
	
	public Benefits readExcusedAbsents(int excusedA) {
		Attendance returnedAttendance = null;
		try (Connection c = db.getConnection();
				PreparedStatement ps = c.prepareStatement(READ_EXCUSEDA);) {
			ps.setInt(1, excusedA);
			
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				returnedAttendance = new Attendance(rs.getInt(1), 
  												rs.getInt(2), 
  												rs.getInt(3),
  												rs.getInt(4),
  												rs.getInt(5),
  												rs.getInt(6));
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return returnedAttendance;
	}	
}