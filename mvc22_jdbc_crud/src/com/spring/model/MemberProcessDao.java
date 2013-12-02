package com.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MemberProcessDao extends JdbcDaoSupport{
	private static final String SELECT_COUNT=
			"select count(*) from member";
	
	public int getMemberCount()
	{
		return getJdbcTemplate().queryForInt(SELECT_COUNT);
	}
	
	private static final String SELECT_LIST=
			"select * from (select a.*,rownum rnum from " +
			"(select * from member order by reg_date desc)a)" +
			" where rnum>=? and rnum<=? order by id desc";
	
	public List<MemberDto> getMemberList(int startRow,int endRow)
	{
		@SuppressWarnings("unchecked")
		List<MemberDto> list=getJdbcTemplate().query(SELECT_LIST,
				new Object [] {startRow,endRow},
				new RowMapper(){
				@Override
				public Object mapRow(ResultSet rs, int rowNum)
						throws SQLException {
					MemberDto dto=new MemberDto();
					dto.setId(rs.getString("id"));
					dto.setPasswd(rs.getString("passwd"));
					dto.setName(rs.getString("name"));
					dto.setReg_date(rs.getString("reg_date"));
					return dto;
				}
		});
		return list;
	}
	
	private static final String INSERT_SQL=
			"insert into member values (?,?,?,sysdate)";
	
	public void insertData(MemberDto dto)
	{
		getJdbcTemplate().update(INSERT_SQL,
				new Object[]{dto.getId(),dto.getPasswd(),
				dto.getName()});
	}
	
	//상세보기
	private static final String SELECT_PART=
			"select * from member where id=?";
	public MemberDto getMember(String id)
	{
		MemberDto dto=
				getJdbcTemplate().queryForObject(SELECT_PART,
						new Object[]{id},
						new RowMapper(){
							@Override
							public Object mapRow(ResultSet rs, int rowNum)
									throws SQLException {
								MemberDto dto=new MemberDto();
								dto.setId(rs.getString("id"));
								dto.setPasswd(rs.getString("passwd"));
								dto.setName(rs.getString("name"));
								dto.setReg_date(rs.getString("reg_date"));
								return dto;
							}
				});
		return dto;
	}
	
	private static final String UPDATE_SQL=
			"update member set passwd=?,name=? where id=?";
	public void updateData(MemberDto dto)
	{
		getJdbcTemplate().update(UPDATE_SQL,
				new Object[]{dto.getPasswd(),dto.getName(),dto.getId()});
	}
	
	//delete
	private static final String DELETE_SQL=
			"delete from member where id=?";
	
	public void deleteData(String id)
	{
		getJdbcTemplate().update(DELETE_SQL,
				new Object[]{id});
	}
	
}




















