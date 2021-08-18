package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.BorderInsertModel;
import com.spring.mvc.model.beans.BorderBean;

/**
 * 
 * DAO(Data Access Object)
 *
 */

@Repository
public class BorderDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public ArrayList<BorderBean> getBorderList(){
		String sql = "select * from border_mst order by border_code desc";
		ArrayList<BorderBean> list = (ArrayList<BorderBean>)jdbcTemplate.query(sql, new RowMapper<BorderBean>() {
			@Override
			public BorderBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				BorderBean borderBean = new BorderBean();
				borderBean.setBorder_code(rs.getInt(1));
				borderBean.setBorder_title(rs.getString(2));
				borderBean.setBorder_content(rs.getString(3));
				borderBean.setBorder_file(rs.getString(4));
				borderBean.setWriter_name(rs.getString(5));
				borderBean.setWriter_ip(rs.getString(6));
				borderBean.setBorder_date(rs.getString(7));
				borderBean.setBorder_count(rs.getInt(8));
				return borderBean;
			}
		});
		return list;
	}
	
	public void insertBorder(BorderInsertModel borderInsertModel) {
		String sql = "insert into border_mst values(0, ?, ?, ?, ?, ?, now(), 0, now(), now())";
		jdbcTemplate.update(
				sql, 
				borderInsertModel.getBorder_title(), 
				borderInsertModel.getContent_textarea(),
				borderInsertModel.getFile(), 
				borderInsertModel.getUser_name(), 
				borderInsertModel.getUser_ip()
		);
	}
	
	public BorderBean getBorderDtl(int border_code) {
		String sql = "select * from border_mst where border_code = ?";
		BorderBean borderBean = jdbcTemplate.queryForObject(sql, new Object[] {border_code},
				new RowMapper<BorderBean>() {
					@Override
					public BorderBean mapRow(ResultSet rs, int rowNum) throws SQLException {
						BorderBean bean = new BorderBean();
						bean.setBorder_code(rs.getInt(1));
						bean.setBorder_title(rs.getString(2));
						bean.setBorder_content(rs.getString(3));
						bean.setBorder_file(rs.getString(4));
						bean.setWriter_name(rs.getString(5));
						bean.setWriter_ip(rs.getString(6));
						bean.setBorder_date(rs.getString(7));
						bean.setBorder_count(rs.getInt(8));
						return bean;
					}
				}
		);
		return borderBean;
	}
	
	public BorderBean getPreBorderCode(int border_code) {
		String sql = "select border_code, border_title from border_mst where border_code = "
				+ "(select max(border_code) from border_mst where border_code < ?)";
		BorderBean borderBean = jdbcTemplate.queryForObject(sql, new Object[] {border_code},
				new RowMapper<BorderBean>() {
					@Override
					public BorderBean mapRow(ResultSet rs, int rowNum) throws SQLException {
						BorderBean bean = new BorderBean();
						bean.setBorder_code(rs.getInt(1));
						bean.setBorder_title(rs.getString(2));
						return bean;
					}
				}
		);
		return borderBean;
	}
	
}







