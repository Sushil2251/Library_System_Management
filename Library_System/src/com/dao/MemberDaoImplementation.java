package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.configuration.ConnectionFactory;
import com.model.Book;
import com.model.Member;

public class MemberDaoImplementation implements MemberDao {

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		ArrayList<Member> memberList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		final String QUERY = "select * from member";
		try {
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(QUERY);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
			Member member = new Member();
				member.setMember_id(resultSet.getInt("member_id"));
				member.setMember_name(resultSet.getString("member_name"));
				

				memberList.add(member);
	}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return memberList;
	}

	@Override
	public int addMember(Member member) {
		
			System.out.println(member);
			int status = 0;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = ConnectionFactory.getConnection();
				preparedStatement = connection.prepareStatement("insert into member values (?,?)");
				preparedStatement.setInt(1, member.getMember_id());
				preparedStatement.setString(2,member.getMember_name());
				
				status=preparedStatement.executeUpdate();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
					try {
						if(preparedStatement!=null)
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						if(connection!=null)
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			// TODO Auto-generated method stub
			return status;
		
	}

	public int deleteMember(int member_id1) {
		System.out.println(member_id1);
		int status1= 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement("delete from member where member_id=?");
			preparedStatement.setInt(1,member_id1);
		
		status1=preparedStatement.executeUpdate();
          System.out.println(status1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
				try {
					if(preparedStatement!=null)
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if(connection!=null)
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		// TODO Auto-generated method stub
		return status1;
	}
	
	@Override
	public int dateDiff(int member_id) {
		int r = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection
					.prepareStatement("select datediff(due_date,issue_date) from bookreg where member_id=?;");

			preparedStatement.setInt(1, member_id);

			r = preparedStatement.executeUpdate();
			
			  
			  while(resultSet.next())
			  {
				
				  System.out.println(resultSet.getInt(member_id));	
				  System.out.println("Date Diff" + resultSet);
			  }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return r;

}
}