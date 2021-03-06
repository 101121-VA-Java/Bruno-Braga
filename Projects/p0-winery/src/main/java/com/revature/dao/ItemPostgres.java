package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.ItemDao;
import com.revature.models.Employee;
import com.revature.models.Item;

import com.revature.utilities.ConnectionUtil;

public class ItemPostgres implements ItemDao {

	@Override
	public List<Item> getAll() {
		String sql = "select * from items;";
		List<Item> items = new ArrayList<>();

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				String description = rs.getString("i_description");
				int quantity = rs.getInt("i_quantity");
				double price = rs.getDouble("i_itemPrice");
				int cusId = rs.getInt("i_cusId");
				String status = rs.getString("i_status");

				Item newItem = new Item(description, quantity, price, cusId, status);
				items.add(newItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		return items;

	}

	public Item add(Item item) {
		String sql = "insert into items ( i_description, i_quantity, i_itemprice, i_cusId, i_status) "
				+ "values (?, ?, ?, ?, ?);";

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, item.getDescription());
			ps.setInt(2, item.getQuantity());
			ps.setDouble(3, item.getPrice());
			ps.setInt(4, item.getCusId());
			ps.setString(5, item.getStatus());
			ps.executeUpdate();

		} catch (SQLException | IOException e1) {

			e1.printStackTrace();
		}

		return item;
	}

	public Item getById(int id) {
		String sql = "select * from items where e_id = ? ";
		Item i = null;

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String description = rs.getString("i_description");
				int quantity = rs.getInt("i_quantity");
				double price = rs.getDouble("i_itemPrice");
				int cusId = rs.getInt("i_cusId");
				String status = rs.getString("i_status");

				i = new Item(description, quantity, price, cusId, status);
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean update(Item item) {
		String sql = "update items set i_description = ?, i_quantity = ?, i_price = ?, i_cusid = ? "
				+ "where i_status = ?;";

		int rowsChanged = -1;

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, item.getDescription());
			ps.setInt(2, item.getQuantity());
			ps.setDouble(3, item.getPrice());
			ps.setInt(4, item.getCusId());
			ps.setString(5, item.getStatus());
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		if (rowsChanged > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Item delete(Item item) {
		String sql = "delete from items where i_description = ?;";
		int rowsChanged = -1;
		String id = item.getDescription();

		try (Connection con = ConnectionUtil.getConnectionFromFile();) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			rowsChanged = ps.executeUpdate();
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}
		if (rowsChanged > 0) {
			return null;
		} else {
			return item;
		}
	}

	@Override
	public Item getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}